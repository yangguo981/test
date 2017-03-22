package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Joiner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Mapper
public abstract class OutputMapper {

    public static OutputMapper INSTANCE = Mappers.getMapper(OutputMapper.class);

    @Mapping(source = "mappings", target = "customized_mappings")
    public abstract DbxOutput outputConfToDbxOutput(OutputConf conf);

    @Mapping(source = "customized_mappings", target = "mappings")
    public abstract OutputConf dbxOutputToOutputConf(DbxOutput conf);

    private static final ObjectMapper om = new ObjectMapper();

    public List<OutputMapping> stringToList(String mappings) throws IOException {
        // field1:column1:4,field2:column2:12,field3:column3:93 convert to:
        return OutputMapping.parseMappings(mappings);
//        List<Map<String, String>> lmss = new ArrayList<>();
//        for (String fields : mappings.split(",")) {
//            String[] fs = fields.split(":");
//            Map<String, String> mss = new HashMap<>();
//            for (int i = 0; i < Math.min(fs.length, fieldNames.size()); ++i) {
//                mss.put(fieldNames.get(i), fs[i]);
//            }
//            lmss.add(mss);
//        }
//        return lmss;
        // [{"output":"column1","input":"field1","type":"4"},{"output":"column3","input":"field3","type":"93"}]
        // return om.readValue(mappings.getBytes(), new TypeReference<List<Map<String, String>>>(){});
    }

    public String listToSTring(List<OutputMapping> customizedMappings) throws JsonProcessingException {
        return OutputMapping.convertMappingToString(customizedMappings);
//        List<String> ret = new ArrayList<String>();
//        for (Map<String, String> mss : customizedMappings) {
//            ret.add(convertMssToString(mss));
//        }
//        return Joiner.on(",").join(ret);
//        return om.writeValueAsString(customizedMappings).replaceAll("\"", "");
    }
}
