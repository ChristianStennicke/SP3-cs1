import java.io.IOException;
import java.util.Scanner;

public class TextUI {


    public void startMenu() {
        Scanner s = new Scanner(System.in);

        try {

            System.out.println("Startmenu");
            System.out.println("------------------");
            System.out.println("1. Create user account");
            System.out.println("2. Login user account");
            System.out.println("------------------");
            System.out.println("Enter choice : ");
            String choice = s.nextLine();
            if (choice.equals("1")) {
                new createAccount();
            } else if (choice.equals("2")) {
                new userAccount();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MovieAccount() {

        Scanner m = new Scanner(System.in);

        try {

            System.out.println("Main menu");
            System.out.println("--------------------------");
            System.out.println("1. Search");
            System.out.println("2. Search for movies in a category");
            System.out.println("3. List of watched movies");
            System.out.println("4. List of saved movies");
            System.out.println("--------------------------");
            System.out.print("Enter choice");
            String choice = m.nextLine();
            if (choice.equals("1"))
            {


