public class Recursion {
    public int sumN(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return sumN(n-1)+n;
    }
    public static void main(String[] args) {

    }
}
