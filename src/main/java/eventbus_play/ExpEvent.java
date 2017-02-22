package eventbus_play;

public class ExpEvent {
    private Integer i;
    public ExpEvent(Integer i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return String.format("ClassName: [%s], Integer: [%d]", getClass().getName(), this.i);
    }
}
