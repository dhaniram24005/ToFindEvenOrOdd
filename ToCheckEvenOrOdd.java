import java.util.*;

public class ToCheckEvenOrOdd {
    public static void main(String args[]) {

        int num;
        System.out.println("Enter an Integer no:");

        // The input provided by the user is stored int num
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        // if num is divisible by 2 then it is an even number
        // else it is an odd no
        if (num % 2 == 0) {
            System.out.println(num + " :it is an even no:");
        } else {
            System.out.println(num + " :it is an odd no:");
        }

    }

}
/* output:
 * Enter an integer no :
 * 10
 * 10: it is an even no
 * 
 * Enter an integer no:
 * 11
 * 11 : it is an odd no:
 */
