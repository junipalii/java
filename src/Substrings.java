public class Substrings {
    public static void main(String[] args){
        //String to be used
        String email="habibti@gmail.com";
        //substring pratice
        String username=email.substring(0,7);
        System.out.println("Username : "+username);
        String domain=email.substring(8);
        System.out.println("domain : "+domain);
    }
}
