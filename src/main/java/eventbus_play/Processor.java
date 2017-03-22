package eventbus_play;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

// 3rd commit
public class Processor {
    public static void main(String args[]) throws IOException {
//        EventBus e = new EventBus();
//        Subscriber subscriber = new Subscriber();
//        DeadSubscriber deadSubscriber = new DeadSubscriber();
//        e.register(subscriber);
//        //e.register(new RecurisiveSubscriber(e));
//        e.register(new SlowSubscriber());
//        e.register(deadSubscriber);
//
//        e.post(new ExpEvent(0));
//        System.out.println("11111");
//        e.post(new ExpEvent(1));
//        System.out.println("11111");
//        //e.unregister(subscriber);
//        e.post(new ExpEvent(2));
        File file = new File("/Users/ychai/Downloads/splunk/aaa/bbb");
        Path path = file.toPath();
        Files.createDirectories(path.getParent());
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        pw.write("test");
        pw.flush();
        pw.close();
    }
}
