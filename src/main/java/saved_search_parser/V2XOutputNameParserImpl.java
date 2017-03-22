package saved_search_parser;

/**
 * Created by ychai on 3/2/17.
 */
public class V2XOutputNameParserImpl extends OutputNameParser {

    public V2XOutputNameParserImpl(OutputNameParser ssonp) {
        super(ssonp.getSavedSearch());
        decorated = ssonp;
    }

    public String getOutputName() {
        if (decorated.getOutputName() != null) {
            return decorated.getOutputName();
        }
        return decorated.getSavedSearch().get("V2: action.alert_output.param.mi_output_name");
    }
}