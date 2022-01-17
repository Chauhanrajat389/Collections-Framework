import java.util.HashMap;

public class LearnHashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(25,"rajat");
        hm.put(24,"anshu");
        hm.put(13,"vishu");
        hm.put(27,"rahul");
        hm.put(32,"rabta");
        System.out.println("before adding duplicate keys");
        System.out.println(hm);
        hm.put(35,"rajat");
        hm.put(13,"vishu");
        System.out.println("after adding duplicate keys");
        System.out.println(hm);

    }
}
