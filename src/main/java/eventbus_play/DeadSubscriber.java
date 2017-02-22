package eventbus_play;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

public class DeadSubscriber {
    @Subscribe
    public void handleDeadEvent(DeadEvent event) {
        System.out.format("Dead subscriber: [%s], Event: [%s]\n",
                Subscriber.class.getName(), event);
    }
}
