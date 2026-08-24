/*
2. Login with lockout
Build a login system where the user gets 3 attempts.
If username AND password match, grant access.
If they fail 3 times, lock them out and print "Account locked."
Use a while loop and a counter.
 */

import java.util.Scanner;

/*
PSEUDO CODE
-Need a scanner to get input
-get password and username separately
-use .equalsIgnoreCase to check for matches
-actually passwords are case sensitive so .equals works
-while loop with a counter
-create a boolean to be used as the condition in the while loop
*/

public class LoginWithLockout {
    public static void main(String[] args){
    //Scanner and variable declaration
    Scanner input=new Scanner(System.in);
    String username="sydney";
    String password="admin123";
    String usernameCopy;
    String passcopy;
    int count=0;
        System.out.println("LOGIN WITH LOCKOUT");
        System.out.println("Please enter your username :");
        usernameCopy=input.next();
        System.out.println("Please enter your password");
        passcopy= input.next();
        boolean passwordCheck=(passcopy.equals("admin123")&&usernameCopy.equals("sydney"));

    while(count<=2&&!passwordCheck){
        System.out.printf("%15s\n","TRY AGAIN");
        System.out.println("Please enter your username");
        usernameCopy=input.next();
        System.out.println("Please enter your password");
        passcopy= input.next();
        passwordCheck=(passcopy.equals("admin123")&&usernameCopy.equals("sydney"));
        count++;

    }
    if(!passwordCheck){
        System.out.println("ACCOUNT LOCKED");
    }
    else{
        System.out.println("ACCESS GRANTED");
    }
    }
}
