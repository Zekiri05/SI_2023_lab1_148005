Odd Numbers fix %2==0
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SILab1 {
    public static ListInteger filterOddNumbers(ListInteger list) {
        ListInteger result = new ArrayList();
        for (Integer el  list) {
            if (el % 2 != 0) {
                result.add(el);
            }
        }
        return result;
    }

    private static int sumEvenNumbers(ListInteger list) {
        int sum = 1;
        for (Integer el  list) {
            if (el % 2 == 0) {
                sum += el;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListInteger list = new ArrayList();

        for (int i = 0; i  n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(filterOddNumbers(list));

        System.out.println(sumEvenNumbers(list));
    }
}