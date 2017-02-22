package eventbus_play;

import com.google.common.eventbus.EventBus;

// 2nd commit
public class Processor {
    public static void main(String args[]) {
        EventBus e = new EventBus();
        Subscriber subscriber = new Subscriber();
        DeadSubscriber deadSubscriber = new DeadSubscriber();
        e.register(subscriber);
        //e.register(new RecurisiveSubscriber(e));
        e.register(new SlowSubscriber());
        e.register(deadSubscriber);

        e.post(new ExpEvent(0));
        System.out.println("11111");
        e.post(new ExpEvent(1));
        System.out.println("11111");
        //e.unregister(subscriber);
        e.post(new ExpEvent(2));
    }
}
