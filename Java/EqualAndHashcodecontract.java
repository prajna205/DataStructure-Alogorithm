package Java;

public class EqualAndHashcodecontract {
    public static void main(String[] args) {
        Employee emp = new Employee(101,"raja");
        Employee emp1 = new Employee(101,"john");
        System.out.println("Shallow compare::"+(emp==emp1) +" "+ emp.hashCode());
        System.out.println("deep compare::"+ (emp.equals(emp1))+" "+ emp1.hashCode());
        System.out.println(emp.getId() +"......."+emp.getName());
        System.out.println(emp1.getId() +"......."+emp1.getName());
    }
}
