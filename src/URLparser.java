/*
2. URL parser

Ask the user to enter a full URL like https://www.google.com/search. Extract and print:

The protocol (https)
The domain (www.google.com)
The path (/search)

You'll need indexOf, substring, and some thought about where each part starts and ends.
 */
import java.util.Scanner;
public class URLparser {
    public static void main(String[]args){
    //Scanner object
    Scanner input=new Scanner(System.in);
    //variable declaration
    String URL;
    String protocol;
    String domain;
    String path;
    //asking for user input
        System.out.println("Please enter a full URL :");
        URL=input.nextLine();
    //formatting the URL
    protocol=URL.substring(0,URL.indexOf(":"));
    domain=URL.substring(URL.indexOf("/")+2,URL.lastIndexOf("/"));
    path=URL.substring(URL.lastIndexOf("/"));
        System.out.println("Protocol :"+protocol);
        System.out.println("Domain :"+domain);
        System.out.println("Path :"+path);
    }
}
