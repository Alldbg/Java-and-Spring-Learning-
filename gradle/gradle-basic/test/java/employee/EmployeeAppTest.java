public class EmployeeAppTest {

    private Employee getEmployeeTest() {

        Employee employee = new Employee();
        employee.name = "John";
        employee.emailAddress = "john@baeldung.com";
        employee.yearOfBirth = 1978;

        return employee;
    }

    @Test
    public void testData() {

        Employee testEmp = this.getEmployeeTest();
        assertEquals(testEmp.name, "John");
        assertEquals(testEmp.emailAddress, "john@baeldung.com");
        assertEquals(testEmp.yearOfBirth, 1978);
    }
}