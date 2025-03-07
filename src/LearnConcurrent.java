import java.util.HashMap;

public class LearnConcurrent {
    public static void main(String[] args) {
        HashMap<String, Integer> mapcon
                = new HashMap<>();
        mapcon.put("k1", 100);
        mapcon.put("k2", 200);
        mapcon.put("k3", 300);
        mapcon.put("k4", 400);
        System.out.println("HashMap values :\n " + mapcon.toString());
        mapcon.computeIfAbsent("k5", k -> 200 + 300);
        mapcon.computeIfAbsent("k6", k -> 60 * 10);
        System.out.println("New HashMap after computeIfAbsent :\n "+ mapcon);
    }
}
