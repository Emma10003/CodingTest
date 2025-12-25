import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] numArray = new int[n];

        for(int i=0; i<n; i++) {
            numArray[i] = i+1;
        }
        
        for(int idx=0; idx<m; idx++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int temp = numArray[i];  // 이전값 저장
            numArray[i] = numArray[j];
            numArray[j] = temp;
        }

        for(int i=0; i<n; i++) {
            System.out.print(numArray[i] + " ");
        }
    }
}
