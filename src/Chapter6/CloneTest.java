package Chapter6;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var origiinal = new Employee("John Q. public", 50000);
        origiinal.setHireDay(2000, 1, 1);
        Employee copy = origiinal.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + origiinal.toString());
        System.out.println("copy=" + copy.toString());
    }
}
