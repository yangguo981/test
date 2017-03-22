package jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;

@JsonInclude(Include.NON_EMPTY)
public class OutputMapping {
    private String name;
    private String column;
    private Integer type;
    private boolean setStringNeeded = false;

    public OutputMapping(String name, String column, Integer type) {
        this.name = name;
        this.column = column;
        this.type = type;
    }

    public OutputMapping(String name, String column) {
        this.name = name;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public String getColumn() {
        return column;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public boolean isSetStringNeeded() {
        return setStringNeeded;
    }

    public void setSetStringNeeded(boolean setStringNeeded) {
        this.setStringNeeded = setStringNeeded;
    }

    static public List<OutputMapping> parseMappings(String mappings) {
        return Stream.of(mappings.split(","))
                .map(String::trim)
                .map(e -> e.split(":"))
                .map(e -> {
                    if (e.length > 2) {
                        return new OutputMapping(e[0], e[1], Integer.parseInt(e[2]));
                    } else {
                        return new OutputMapping(e[0], e[1]);
                    }
                })
                .collect(Collectors.toList());
    }

    static public String convertMappingToString(List<OutputMapping> lm) {
        List<String> ret = new ArrayList<>();
        for (OutputMapping om : lm) {
            List<String> oneItem = new ArrayList<>();
            if (!Strings.isNullOrEmpty(om.getName()) &&
                    !Strings.isNullOrEmpty(om.getColumn())) {
                oneItem.add(om.getName());
                oneItem.add(om.getColumn());
                if (om.getType() != null) {
                    oneItem.add(om.getType().toString());
                }
                if (om.isSetStringNeeded()) {
                    oneItem.add("true");
                }
                ret.add(Joiner.on(":").join(oneItem));
            } else {
                // error, name and column must be provided.
            }
        }
        return Joiner.on(",").join(ret);
    }
}
