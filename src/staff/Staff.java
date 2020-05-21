package staff;

public abstract class Staff {

    private String name;
    private String number;
    private int salary;

    public Staff(String name, String number, int salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
