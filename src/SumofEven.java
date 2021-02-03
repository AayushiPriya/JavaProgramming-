public class SumofEven {
    public static void main(String []args)
    {
       int sum=0;
        int []arr=new int[]{1,5,6,8,9,4};
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
                //System.out.println(arr[i]);
            }

        }
        System.out.println(sum);

    }
}
