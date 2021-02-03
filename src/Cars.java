//Class and Object concepts
public class Cars {
    String color ="Red";
    String type ="SUV";
    String variant ="Breeza";

    public void displayDetails()
    {
      System.out.println("I have a"+ " "+color+" "+"colour"+" "+type+" "+variant);
    }

    public static  void main(String args[])
    {
        Cars c1=new Cars();
        c1.color="White";
        c1.displayDetails();
    }
}
