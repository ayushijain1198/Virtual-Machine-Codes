package comm.example;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;

    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName() throws Exception{
        if(getFirstName().length()<5 || getLastName().length()<5){
            throw new Exception("First name and last name must be atleast 5 character long");

        }
        return "employee full name is : "+ firstName+ lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
