package employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getName() {

        Employee employee = new Employee();
        assertEquals("Employee",employee.getName(),"Employee name mismatch");
    }
}