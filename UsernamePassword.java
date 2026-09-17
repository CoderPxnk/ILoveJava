import java.util.Scanner;

public class UsernamePassword
{
    public static void main(String[] args)
    {
        String existUsername = "Andris";
        String existPassword = "letmeinplease";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is your username? ");
        String userName = keyboard.nextLine();
        
        System.out.print("What is your password? ");
        String userPassword = keyboard.nextLine();
        
        if(existUsername.equals(userName) && existPassword.equals(userPassword))
        {
            System.out.println("Welcome back " + userName);
        }
        else
        {
            System.out.println("That is not the correct username: " 
                    + userName + " or correct user password: " + userPassword);
        }
    }
}
