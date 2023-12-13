package gramma.InClass;

public class OOP {
    public static void main(String[] args) {
    }
}

class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
