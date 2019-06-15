package customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getName() {
        Customer customer = new Customer();
        assertEquals("Customer",customer.getName(),"Customer name mismatch");
    }
}