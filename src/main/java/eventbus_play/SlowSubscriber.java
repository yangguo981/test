package eventbus_play;

import com.google.common.eventbus.Subscribe;

public class SlowSubscriber {
    @Subscribe
    public void handleExpEvent(ExpEvent event) throws InterruptedException {
        System.out.format("Subscriber handler 1: [%s], Event: [%s]\n",
                SlowSubscriber.class.getName(), event);

        Thread.sleep(2000);
    }
}
