package saved_search_parser;

/**
 * Created by ychai on 3/2/17.
 */
public class Processor {
    public static void main(String[] args) {
        SavedSearch savedSearch = new SavedSearch();
        System.out.println(new OutputNameParserImpl(new V2XOutputNameParserImpl(new OutputNameParser(savedSearch))).getOutputName());
        System.out.println(new V2XOutputNameParserImpl(new OutputNameParserImpl(new OutputNameParser(savedSearch))).getOutputName());
    }
}
