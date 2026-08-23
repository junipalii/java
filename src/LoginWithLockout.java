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


public class LoginWithLockout {
    public static void main(String[] args){
    //Scanner and variable declaration
    Scanner input=new Scanner(System.in);
    String username="sydney";
    String password="admin123";
    String usernameCopy;
    String passcopy;
    int count=1;
    while(count<=3&&username!=usernameCopy&&password!="ädmin123"){
        System.out.println("Enter your username");
        usernameCopy= input.next();

        count ++;
    }
    }
}
*/