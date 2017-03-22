package saved_search_parser;

public class OutputNameParserImpl extends OutputNameParser {

    public OutputNameParserImpl(OutputNameParser ssonp) {
        super(ssonp.getSavedSearch());
        decorated = ssonp;
    }

    public String getOutputName() {
        if (decorated.getOutputName() != null) {
            return decorated.getOutputName();
        }
        return decorated.getSavedSearch().get("action.alert_output.param.output_name");
    }
}
