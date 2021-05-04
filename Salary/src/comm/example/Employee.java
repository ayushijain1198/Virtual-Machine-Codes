package comm.example;

public class Employee {
    private String firstname;
    private String lastname;
    private String email;
    private int salary;

    public Employee(String firstname, String lastname, String email, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee =null;
        if(obj instanceof Employee){
            employee = (Employee) obj;
        }

        if(this.getSalary()==employee.getSalary()){
            return true;
        }
        else{
            return false;
        }
    }
}
