
import java.util.TreeSet;

class Stmarks {
    public static void main(String[] args) {
        TreeSet<Integer> mark = new TreeSet<Integer>();
        mark.add(75);
        mark.add(90);
        mark.add(65);
        mark.add(85);
        mark.add(95);
        mark.add(75);
        mark.add(80);
        System.out.println("Marks is: " + mark);
        mark.remove(65);
        System.out.println("Least Marks is:" + mark.first());
        System.out.println("Highest marks is: " + mark.last());
        System.out.println("Is marks 95 in mark: " + mark.contains(95));
        System.out.println("marks is: " + mark);
    }
}
