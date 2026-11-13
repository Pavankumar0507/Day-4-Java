
import java.util.HashSet;

class Empid {
    public static void main(String[] args) {

        HashSet<Integer> employees = new HashSet<Integer>();

        employees.add(101);
        employees.add(102);
        employees.add(103);
        employees.add(104);
        employees.add(105);
        employees.add(106);
        employees.add(107);
        employees.add(108);
        employees.add(109);
        employees.add(110);

        employees.add(103);
        employees.add(105);
        System.out.println("Employee IDs: " + employees);

        System.out.println("All Employee IDs:");

        for (int id : employees) {
            System.out.println(id);
        }

        System.out.println("Employee ID 105 exists: " + employees.contains(105));

        employees.remove(103);

        System.out.println("Total Employees: " + employees.size());

        System.out.println("Is collection empty: " + employees.isEmpty());
    }
}
