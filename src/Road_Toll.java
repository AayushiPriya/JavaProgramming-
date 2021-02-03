public class Road_Toll {
     String Vehiletype;
     int NumOfTires;

    public void calculate_Toll()
    {
       if(NumOfTires==2)
       {
           System.out.println("Toll amount is 0");
       }
       else if(NumOfTires==4)
        {
          System.out.println("Toll amount is 10");
        }
        else if(NumOfTires>4)
        {
            System.out.println("Toll amount is 20");
        }
       else
        {
            System.out.println("Incorrect Number of tires entered");
        }
    }
}
