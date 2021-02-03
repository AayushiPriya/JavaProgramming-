public class TestSpilt {
    public static void main(String[] args) {
        String s ="a_b_c";
        String[] a =s.split("_");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
