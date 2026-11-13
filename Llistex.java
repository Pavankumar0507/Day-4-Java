import java.util.LinkedList;

class Llistex {
 public static void main(String[] args) {
    LinkedList <String> names=new LinkedList<>();
    names.add("John");
    names.add("Alice");
    names.add("Davd");
    names.add("Robort");
    System.out.println("LinkeList:" +names);
    System.out.println("First element:" +names.get(0));
    names.set(1,"Peter");
    names.remove("David");
    names.addFirst("Sam");
    names.addLast("Tom");
    System.out.println("Size: "+names.size());
}

}