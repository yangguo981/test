package saved_search_parser;

/**
 * Created by ychai on 3/2/17.
 */
public class OutputNameParser {
    SavedSearch savedSearch = null;
    OutputNameParser decorated;

    public OutputNameParser(SavedSearch ss) {
        savedSearch = ss;
    }

    SavedSearch getSavedSearch() {
        return savedSearch;
    }

    public String getOutputName() {
        return null;
    }
}
