import java.util.Scanner;

/*
Exceptions Handling 02
Exercise: Exceptions Handling 2

continue to ask the user to input two integers:
dividend
divisor
execute the division and print the quotient
if the user inputs divisor==0, alert the user that is not possible to divide by zero
 */
public class Main {
    public static void main(String[] args) {
        int dividend;
        int divisor;
        double result;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Please enter a first integer");
            dividend = scanner.nextInt();

            System.out.println("Please enter a second integer");
            divisor = scanner.nextInt();

            try{
                result=(dividend/divisor);
                System.out.printf("The division between %d and %d is: %.2f %n",dividend,divisor,result);
            }catch (Exception exc){
                System.out.println("Attention it is not possible to divide by zero!");
            }finally {
                System.out.println("Try again");
            }
        }

    }
}
