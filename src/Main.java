//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void printMenue(){
        System.out.println("Hello and welcome!");
        System.out.println("Give me any number");
    }
    public static void promptCalculation(){
        System.out.println("Would you like me to add, subtract, divide, or multiply the two? Or do all? (A/S/D/M/All)");
    }
    public static double addition(double firstuserNumber, double seconduserNumber) {
        return firstuserNumber+seconduserNumber;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner userInput=new Scanner(System.in);

        double firstuserNumber;
        double seconduserNumber;
        String firstuserText;
        double sum;

        printMenue();
        firstuserNumber=userInput.nextDouble();
        System.out.println("Give me another number");
        seconduserNumber=userInput.nextDouble();
        System.out.println("The numbers you input were: "+firstuserNumber+" and "+seconduserNumber);
        userInput.nextLine();
        promptCalculation();
        firstuserText=userInput.nextLine();
        if (firstuserText.equals("A")){
           sum=addition(firstuserNumber, seconduserNumber);
            System.out.println("The sum of the addition is: "+sum);
        }
        else if (firstuserText.equals("S")) {
            sum=firstuserNumber - seconduserNumber;
            System.out.println("The sum of the subtraction equals:" +sum);
        }
        else if (firstuserText.equals("D")){
            sum=firstuserNumber / seconduserNumber;
            System.out.println("The sum of the division equals:" + sum);
        }
        else if (firstuserText.equals("M")){
            sum=firstuserNumber * seconduserNumber;
            System.out.println("The sum of the multiplication equals:" +sum);
        }
        else if (firstuserText.equals("All")){
            sum=firstuserNumber + seconduserNumber;
            System.out.println("The sum of the addition is: "+sum);
            sum=firstuserNumber - seconduserNumber;
            System.out.println("The sum of the subtraction equals:" +sum);
            sum=firstuserNumber / seconduserNumber;
            System.out.println("The sum of the division equals:" + sum);
            sum=firstuserNumber * seconduserNumber;
            System.out.println("The sum of the multiplication equals:" +sum);
        }
        else {
            System.out.println("You didn't select A or S, bye bye");
        }
    }
}