public class Employee {
    private String firstName;
    private String lastName;

    public Employee(){

    }
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName =lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void calculateMonthlyPay() {
        System.out.println("Monthly Pay Calculator");
    }
}
