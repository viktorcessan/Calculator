//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void printMenue(){
        System.out.println("Hello and welcome to Viktor and Olivias awesome calculator, to exit at anytime, just type Exit!");
        System.out.println("Give me any number");
    }
    public static void promptCalculation(){
        System.out.println("Would you like me to add, subtract, divide, or multiply the two? Or do all? (A/S/D/M/All)");
    }
    public static double addition(double firstuserNumber, double seconduserNumber) {
        return firstuserNumber+seconduserNumber;
    }
    public static double subtraction(double firstuserNumber, double seconduserNumber) {
        return firstuserNumber-seconduserNumber;
    }
    public static double division(double firstuserNumber, double seconduserNumber) {
        return firstuserNumber/seconduserNumber;
    }
    public static double multiplication(double firstuserNumber, double seconduserNumber){
        return firstuserNumber*seconduserNumber;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner userInput=new Scanner(System.in);

        double[] usernumbersArray = new double[3];
        String firstuserText;
        //double sum;

            printMenue();
            usernumbersArray[0] = userInput.nextDouble();
            System.out.println("Give me another number");
            usernumbersArray[1] = userInput.nextDouble();
            System.out.println("The numbers you input were: " + usernumbersArray[0] + " and " + usernumbersArray[1]);
            userInput.nextLine();
            promptCalculation();
            firstuserText = userInput.nextLine();
            if (firstuserText.equalsIgnoreCase("a")) {
                usernumbersArray[2] = addition(usernumbersArray[0], usernumbersArray[1]);
                System.out.println("The sum of the addition is: " + usernumbersArray[2]);
            } else if (firstuserText.equalsIgnoreCase("s")) {
                usernumbersArray[2] = subtraction(usernumbersArray[0], usernumbersArray[1]);
                System.out.println("The sum of the subtraction equals:" + usernumbersArray[2]);
            } else if (firstuserText.equalsIgnoreCase("d")) {
                usernumbersArray[2] = division(usernumbersArray[0], usernumbersArray[1]);
                System.out.println("The sum of the division equals:" + usernumbersArray[2]);
            } else if (firstuserText.equalsIgnoreCase("m")) {
                usernumbersArray[2] = multiplication(usernumbersArray[0], usernumbersArray[1]);
                System.out.println("The sum of the multiplication equals:" + usernumbersArray[2]);
            } else if (firstuserText.equalsIgnoreCase("all")) {
                usernumbersArray[2] = addition(usernumbersArray[0], usernumbersArray[1]);
                System.out.println("The sum of the addition is: " + usernumbersArray[2]);
                usernumbersArray[2] = subtraction(usernumbersArray[0], usernumbersArray[1]);
                System.out.println("The sum of the subtraction equals:" + usernumbersArray[2]);
                usernumbersArray[2] = division(usernumbersArray[0], usernumbersArray[1]);
                System.out.println("The sum of the division equals:" + usernumbersArray[2]);
                usernumbersArray[2] = multiplication(usernumbersArray[0], usernumbersArray[1]);
                System.out.println("The sum of the multiplication equals:" + usernumbersArray[2]);
            } else {
                System.out.println("You didn't select A or S, bye bye");
            }
    }
}