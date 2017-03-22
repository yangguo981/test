package jackson;

public class OutputConf {
    public String getMappings() {
        return mappings;
    }

    public void setMappings(String mappings) {
        this.mappings = mappings;
    }

    private String mappings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
