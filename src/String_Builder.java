public class String_Builder {
    public static void main(String []args)
    {

        StringBuilder sb1 = new StringBuilder("HELLO");
        sb1.append(" AAYUSHI");
        sb1.insert(6,"Priya ");
        sb1.deleteCharAt(0);
        sb1.delete(0,5);
        sb1.reverse();
        System.out.println(sb1);
    }
    //String builder methods -insert,delete,reverse

}
