import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fakeNum = "";
        int myNum = 0;
        int totalNum = 0;
        int evenNum = 0;
        int oddNum = 0;
        double evenPercentage = 0.0;
        double oddPercentage = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("\nEven Odd Percentage Program");
        System.out.println();
        System.out.println("Be aware that any negative numbers will work like a 'quit' from the following loop.");
        System.out.println();

        do {
            System.out.print("Enter any number: ");
            fakeNum = input.nextLine().trim();

            if(!MyUtil.isInteger(fakeNum)) {
                System.out.println("\nInvalid input detected.");
                System.out.println();
                continue;
            }

            myNum = Integer.parseInt(fakeNum);

            if(myNum < 0) {
                break;
            }

            totalNum += 1;

            if(myNum % 2 == 0) {
                evenNum += 1;
            } else {
                oddNum += 1;
            }

        } while (true);

        evenPercentage = ((evenNum + 0.0) / (totalNum + 0.0)) * 100;
        oddPercentage = ((oddNum + 0.0) / (totalNum + 0.0)) * 100;

        System.out.println("\nTotal numbers: " + totalNum);
        System.out.println("Even numbers: " + evenNum);
        System.out.println("Odd numbers: " + oddNum);
        System.out.printf("Even percentage: %.1f%%%n", evenPercentage);
        System.out.printf("Odd percentage: %.1f%%%n", oddPercentage);

        System.out.print("\nProgram terminated.");

        input.close();
    }
}
