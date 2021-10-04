import java.util.Scanner;

public class ok {

    private static Scanner keyboard = new Scanner(System.in);
//----The gas constant in Joules/mole/K

    //-----------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold system values
        double depth;
        int number;
        double pressure;
        double partialpressure;
        int digit;


//----What is this all about?

        System.out.print("Please enter your 305 phone number: ");


        do {
            System.out.print("Please enter your 305 phone number: ");
            number = keyboard.nextInt();
        } while (number > 9999999 && number < 1000000);

        char a;
        char[] digitsStartAt = {'0', '1', 'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W'};
        int[] digitsHaveLetters = {1, 1, 3, 3, 3, 3, 3, 3, 4, 3, 4};
        String finalString = "";
        while (number > 0) {
            digit = number % 10;
            a = (char) (Math.floor(Math.random() * digitsHaveLetters[(int) digit]) + digitsStartAt[(int) digit]);
            finalString += a;
            number /= 10;
        }
        System.out.println(finalString);
    }
}
//-----------------------------------------------------------------------------


