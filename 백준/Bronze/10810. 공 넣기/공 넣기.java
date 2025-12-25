import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] numArray = new int[n];

        for(int i=0; i<n; i++) {
            numArray[i] = 0;
        }

        for(int i=0; i<m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();
            for(int j=start-1; j<=end-1; j++) {
                numArray[j] = num;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.println(numArray[i]);
        }
        
    }
}
