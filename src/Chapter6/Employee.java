package Chapter6;

public class Employee implements Comparable<Employee>{
//    private static int nextId;
//    private int id;
    private String name;
    private double salary;

//    {
//        id = nextId;
//        nextId++;
//    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

//    public Employee(double s) {
//        this("Employee #" + nextId, s);
//    }
//
//    public Employee() {
//        name = "";
//        salary = 0;
//    }

//    public int getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary,other.salary);
    }
}
