//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner firstInput=new Scanner(System.in);
        Scanner secondInput=new Scanner(System.in);
        Scanner thirdInput=new Scanner(System.in);

        int firstuserNumber;
        int seconduserNumber;
        String firstuserText;
        int sum;

        System.out.println("Hello and welcome!");
        System.out.println("Give me any number");
        firstuserNumber=firstInput.nextInt();
        System.out.println("Give me another number");
        seconduserNumber=secondInput.nextInt();
        System.out.println("The numbers you input were: "+firstuserNumber+" and "+seconduserNumber);
        System.out.println("Would you like me to sum the two - Y/N?");
        firstuserText=thirdInput.nextLine();
        if (firstuserText.equals("Y")){
            sum=firstuserNumber+seconduserNumber;
            System.out.println("The sum is: "+sum);
        }
        else {
            System.out.println("Ok then, bye bye");
        }
    }
}