public class MinElement {
    public static void main(String []args)
    {

        int []arr=new int[]{6,7,2,9,3};

        int min =arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
