package eventbus_play;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class RecurisiveSubscriber {
    EventBus eb;
    public RecurisiveSubscriber(EventBus eb) {
        this.eb = eb;
    }

    @Subscribe
    public void handleExpEvent(ExpEvent event) {
        System.out.format("Subscriber handler 1: [%s], Event: [%s]\n",
                RecurisiveSubscriber.class.getName(), event);
        eb.post(event);
    }
}
