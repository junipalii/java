public class Printf {
    public static void main(String[] args){
        //variables to demonstrate printf formatting output
        int age=20;
        String name="Sydney";
        double height=5.8;
        char grade='A';
        boolean isEmployed=true;
        double price1=9000.99;
        double price2=90000.99;
        double price3=-100.5;
        int id1=1;
        int id2=16;
        int id3=327;
        int id4=1629;
        //printf statements
        System.out.printf("I am %d years old\n",age);
        System.out.printf("My name is %s\n",name);
        System.out.printf("I got an %c\n",grade);
        System.out.printf("is employed : %b\n",isEmployed);
        System.out.printf("I am %.1f feet tall\n", height);
        //adding more than one variable in one printf statement
        System.out.printf("%s is %d years old and is %.1f feet tall\n",name , age , height);
        //flags
        System.out.printf("%+.2f\n",price1);
        System.out.printf("%+,.2f\n",price2);
        System.out.printf("%(.1f\n",price3);
        System.out.printf("% .2f",price2,"\t",price3,"\n");
        //width
        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);


    }

}
