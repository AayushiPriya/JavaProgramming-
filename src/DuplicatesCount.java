public class DuplicatesCount {
    public static void main(String []args)
    {
        int []arr=new int[]{1,2,1,3,1,1};
        int temp =arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==temp)
            {
                temp=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
