package hk2;

import org.jvnet.hk2.annotations.Service;

@Service
public class SIFIBook implements Book {
    @Override
    public String getName() {
        return this.getClass().getName();
    }
}
