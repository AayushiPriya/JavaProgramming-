public class Methods {
    public  static void main(String[] args)
    {
        Methods m1=new Methods();
        m1.Execution();
        m1.addition(10,20);
        float var =m1.multiply(10.00f,20.98f);
        System.out.println(var);
    }

    public void Execution()
    {
        System.out.println("Do this method execution");
    }
    public void addition(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
    public float multiply (float num1,float num2)
    {
        return(num1*num2);
    }
}
