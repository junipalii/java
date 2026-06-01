public class NestedIf {
    public static void main(String[]args){
        //variable declaration
        boolean isStudent=true;
        boolean isSenior=true;
        double price=9.99;
        //students get a 10% discount , seniors get a 20% discount
        //a person who is both a senior and student gets a 30% discount
        if(isStudent){
            if(isSenior){
                System.out.println("You get a 20% senior discount and a 10% student discount");
                price*=0.7;
            }else{
                System.out.println("You get a 10% student discount");
                price*=0.9;
            }
        }else{
            if(isSenior){
                System.out.println("You get a 20% senior discount");
                price*=0.8;
            }else {
                price *= 1;
            }
        }
        System.out.printf("The price of a ticket is :$%.2f" ,price);
    }


}
