
public class SumOfPosivite {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[]{1, 2, 3, 4, 5,-1,-2};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    sum = sum + arr[i];

                }
            }
            System.out.println(sum);
        }
        }

