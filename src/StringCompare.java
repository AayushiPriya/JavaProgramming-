public class StringCompare {
    public static void main (String  args[])
    {
        //String Search
       // String str1 = "Trying to learn Selenium to";
        //String str2 = "Learn";
//        System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));//contains
//        String str3 ="Trying";
//        System.out.println(str1.startsWith("trying"));//startsWith
//        System.out.println(str1.endsWith("Selenium"));//endsWith
//        System.out.println(str1.indexOf("to"));
//        System.out.println(str1.lastIndexOf("to"));
    //String compare
        String s1 ="Expected output";
        String s2 ="Expected Output";
//        System.out.println(s1.equals(s2));//case sensitivity
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s2.matches(s2));
     //String Slice
        //CharAt(),substring ,spilt
//        System.out.println(str1.charAt(5));
//        System.out.println(str1.substring(6));
//        System.out.println(str1.substring(6,11));
        String s3="A_B_C_D";
        String[] arr=s3.split("_");
        for(String x :arr) {
            System.out.println(x);
        }
        //String Replace
        String  str1 ="Learing 1234 Selenium 1234day";
        String str2 ="1234";
        String str3 ="to";
        System.out.println(str1.replace(str2,str3));
    }

    //String Conversion
    //Integer to String -->toString()
    //String to Integer --->Integer.parseInt()

}
