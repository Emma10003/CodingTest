import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cardArr = new int[N];

        for(int i=0; i<N; i++){
            cardArr[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;
        int diff = M;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    sum = cardArr[i] + cardArr[j] + cardArr[k];
                    if(sum <= M && diff > M-sum) {
                        max = sum;
                        diff = M - sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
