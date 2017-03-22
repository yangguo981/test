package hk2;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

public class Processor {
    static public void main(String[] args) {
        ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();

        Book book = locator.getService(Book.class);
        System.out.println(book.getName());
    }
}
