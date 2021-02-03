public class Reverse {

    public static void main(String args[])
    {
        String input ="abc";
        String rev="";
        for(int i=input.length()-1;i>=0;i--)
        {
            //System.out.print(input.charAt(i));
            rev=rev+input.charAt(i);
        }
        //System.out.println(rev);


        //System.out.print(input+':'+rev);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for(int i=cars.length-1;i>=0;i--)
//        {
//
//            String word=cars[i];
//            for(int j=word.length()-1;j>=0;j--)
//            {
//                System.out.print(word.charAt(j));
//
//            }
//
//            System.out.println();
           String newString ="";
           StringBuilder str=new StringBuilder();
            for(int i=0;i<cars.length;i++)
            {
               // newString=newString+cars[i];
                str.append(cars[i]);

            }
        System.out.println(str);
        //}



    }



}
