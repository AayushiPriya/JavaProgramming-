public class MaxElement {
    public static void main(String []args)
    {

        int []arr=new int[]{1,7,8,9,10,17};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
               max =arr[i];
            }

        }
        System.out.println(max);


    }

}
