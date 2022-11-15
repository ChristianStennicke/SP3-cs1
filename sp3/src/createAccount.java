import java.util.Scanner;

public class createAccount {

   static  Scanner s = new Scanner(System.in);


    static String createAccount()
    {
        System.out.println("C R E A T E A C C O U N T");
        String newusername = getNewUserName();
        String newpassword = getNewPassWord();

        FileIO.writeUser(newusername, newpassword);

        return newusername;
    }

    private static String getNewUserName()
    {
        System.out.println("Enter username : ");
        String username = s.nextLine();

        return username;
    }

private static String getNewPassWord() {
    System.out.println("Enter username : ");
    String password = s.nextLine();

    return password;
}




}

