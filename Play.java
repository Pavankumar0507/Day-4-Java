import java.util.LinkedList;

class Play {
    public static void main(String[] args) {
        LinkedList<String> song = new LinkedList<>();
        song.add("jorse jorse ");
        song.add("Bindas");
        song.add("onesun onemoon");
        song.add("Ravana");
        System.out.println("SongList:" + song);
        System.out.println("First song:" + song.get(0));
        System.out.println("Last song:" + song.getLast());
        song.set(1, "hangover");
        song.remove("Bindas");
        System.out.println("Total song" + song.size());
        System.out.println("The songs:");
    }

}