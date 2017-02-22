package eventbus_play;

import com.google.common.eventbus.Subscribe;

public class Subscriber {
    @Subscribe
    public void handleExpEvent(ExpEvent event) {
        System.out.format("Subscriber handler 1: [%s], Event: [%s]\n",
                Subscriber.class.getName(), event);
    }
}
