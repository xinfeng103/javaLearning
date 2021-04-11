package Chapter6;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee>, Cloneable {
    //    private static int nextId;
//    private int id;
    private String name;
    private double salary;
    private Date hireDay;

//    {
//        id = nextId;
//        nextId++;
//    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
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

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
