import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArray = new int[n];
        int count = 0;

        // 두 번째로 들어오는 공백으로 구분된 숫자 받아서 배열에 넣기
        for(int i=0; i<n; i++) {
            numArray[i] = sc.nextInt();
        }

        int number = sc.nextInt();

        for(int i=0; i<n; i++) {
            if(numArray[i] == number) count++;
        }

        System.out.println(count);
    }
}
