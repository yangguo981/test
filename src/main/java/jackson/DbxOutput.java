package jackson;

import java.util.List;

public class DbxOutput {
    private List<OutputMapping> customized_mappings;

    public List<OutputMapping> getCustomized_mappings() {
        return customized_mappings;
    }

    public void setCustomized_mappings(List<OutputMapping> customized_mappings) {
        this.customized_mappings = customized_mappings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
