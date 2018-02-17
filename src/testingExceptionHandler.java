import defconcustomexceptions.CheckedDefConExceptions;

import java.util.Scanner;

public class testingExceptionHandler {

    public static void main(String[] args) throws CheckedDefConExceptions {

        CheckedDefConExceptions stuff = new CheckedDefConExceptions();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String word = myScanner.nextLine();

        if (word.contains("Jonas")) {
            System.out.println("Error exception will be thrown if 'Jonas is used in user input");
            stuff.writeError("Error no: 5757");
            throw new CheckedDefConExceptions("Error no: 8579");

        }


    }
}