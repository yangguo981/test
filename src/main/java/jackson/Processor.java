package jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Processor {
    private static final ObjectMapper om = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        System.out.println(null == null);
        {
            System.out.println(om.writeValueAsString(new TestBean().with("name")));
        }
        {
            OutputConf conf = new OutputConf();
            // field1:column1:4,field2:column2:12,field3:column3:93
            //conf.setMappings("[{\"output\":\"column1\",\"input\":\"field1\"},{\"output\":\"column1\",\"input\":\"field1\"}]\n");
            //conf.setMappings("field1:column1:4,field2:column2:12,field3:column3:93");
            conf.setName("output_name");
            conf.setMappings("field1:column1:4, field2:column2, field3:column3");
            DbxOutput output = OutputMapper.INSTANCE.outputConfToDbxOutput(conf);
            System.out.println(new ObjectMapper().writeValueAsString(output));
//            List<OutputMapping> lm = OutputMapper.INSTANCE.outputConfToDbxOutput(conf).getCustomized_mappings();
//
//            System.out.println(lm);
//            System.out.println(OutputMapping.convertMappingToString(lm));
//
//            OutputMapping ommm = new OutputMapping("name", "column");
//            System.out.println(new ObjectMapper().writeValueAsString(ommm));
        }


        {
//            ObjectMapper om = new ObjectMapper();
//            Map<String, String> mss = new HashMap<String, String>();
//            mss.put("input", "field1");
//            mss.put("output", "column1");
//            mss.put("type", "4");
//
//            List<Map<String, String>> lmss = Arrays.asList(mss, mss);
//
//            DbxOutput output = new DbxOutput();
//            output.setCustomized_mappings(lmss);
//            System.out.println(OutputMapper.INSTANCE.dbxOutputToOutputConf(output).getMappings());
        }
    }
}
