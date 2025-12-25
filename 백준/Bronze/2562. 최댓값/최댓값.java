import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = new int[9];
        int idx = 0;

        for(int i=0; i<9; i++) {
            numArray[i] = sc.nextInt();
            if(numArray[i] > numArray[idx]) {
                idx = i;
            }
        }

        System.out.println(numArray[idx]);
        System.out.println(idx+1);

    }
}
