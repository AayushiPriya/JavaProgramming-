import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {
      int a=1;
//        int b =2;
//        int c=3;

        HashMap<String,Integer>  numbers=new HashMap<String,Integer>();
        numbers.put("bfghjnk",a);
//        numbers.get("a");
        System.out.println(numbers.get("bfghjnk"));
//        numbers.put("b",2);
//        numbers.get("b");
//        numbers.put("c",3);
        System.out.println(numbers);
    }
}
