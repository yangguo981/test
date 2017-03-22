package jackson;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TestBean {
    @JsonProperty("another_name")
    private String name;

    public TestBean with(String name) {
        this.name = name;
        return this;
    }
}
