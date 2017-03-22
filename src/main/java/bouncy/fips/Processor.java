package bouncy.fips;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jackson.DbxOutput;
import jackson.OutputConf;
import jackson.OutputMapper;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Processor {
    public static void main(String[] args) throws Exception {
        OutputConf conf = new OutputConf();
        conf.setMappings("field1:column1:4,field2:column2:12,field3:column3:93");

        OutputMapper mapper = Mappers.getMapper( OutputMapper.class );
        DbxOutput output = mapper.outputConfToDbxOutput(conf);
        System.out.println(output.getCustomized_mappings());
//
//        ObjectMapper om = new ObjectMapper();
//        Map<String, String> mss = new HashMap<String, String>();
//        mss.put("input", "field1");
//        mss.put("output", "column1");
//        mss.put("type", "4");
//
//        List<Map<String, String>> lmss = Arrays.asList(mss, mss);
//
//        System.out.println(om.writeValueAsString(lmss));
//
//        System.out.println(om.readValue(om.writeValueAsString(lmss).getBytes(), new TypeReference<List<Map<String, String>>>(){}));


//        public String listToSTring(List<Map<String, String>> customizedMappings) {
//            return "mappings";
//        }
    }
}
