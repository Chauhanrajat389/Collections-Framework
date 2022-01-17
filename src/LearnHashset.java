import java.util.HashSet;
public class LearnHashset {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("java");
        hs.add("c++");
        hs.add("phython");
        hs.add("c");
        System.out.println("before duplicate and null values");
        System.out.println(hs);
        hs.add("java");
        hs.add("c++");
        System.out.println("after Adding duplicate values ");
        System.out.println(hs);
        hs.add("null");
        hs.add("null");
        System.out.println("After adding null");
        System.out.println(hs);
    }
}
