import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result;
        if(num1 > 0 && num2 > 0) result = 1;
        else if(num1 < 0 && num2 > 0) result = 2;
        else if(num1 < 0 && num2 < 0) result = 3;
        else result = 4;

        System.out.println(result);
    }
}
