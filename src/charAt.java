public class charAt {
    public static void main(String[] args){
        //charAt practice
        String str="GeeksforGeeks";
        //getting a character at a given position in a String
        char ch=str.charAt(0);
        System.out.println(ch);
        //getting the first and last element
        System.out.println("First element :"+str.charAt(0));
        System.out.println("Last element :"+str.charAt(str.length()-1));
        //getting even and odd character positions
        for(int i=0;i<str.length();i+=2){
            System.out.println("Odd positions :");
            System.out.println("I"+i);
        }
        for(int i=1;i<str.length();i+=2){
            System.out.println("Even positions :");
            System.out.println("I"+i);
        }
        //counting frequency of the occurence of a character n a string
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e')
                count++;
        }
        System.out.println("The number of occurence of e :"+count);

    }
}
