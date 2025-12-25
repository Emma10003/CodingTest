import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1000000;
        int min = 1000000;
        int[] numArray = new int[n];

        for(int i=0; i<n; i++) {
            numArray[i] = sc.nextInt();
            max = Math.max(max, numArray[i]);
            min = Math.min(min, numArray[i]);
        }

        System.out.println(min + " " + max);
    }
}
