/*In this project User will enjoy to find the exact number.
When s/he will tire to find out the number, s/he will give negative number.
*/
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // MINI PROJECT

        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);

        int userNumber = 0;
        do {
            System.out.println("Guess my number (1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOOH ... CORRECT NUMBER !!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is  Large... ");
            } else {
                System.out.println("Your number is small... ");
            }
        }
        while (userNumber >= 0);

        System.out.print("MY number was : ");
        System.out.println(myNumber);
    }
}