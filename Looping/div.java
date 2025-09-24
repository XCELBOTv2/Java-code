import java.util.Scanner;
public class div {
    public static void main (String[] args){
        int a, b ,c;
    Scanner input = new Scanner(System.in);
    System.out.print("Input first number: ");
        a = input.nextInt();
    System.out.print("Input Second number: ");
        b = input.nextInt();
        for (c=0;a>=b;c++){
            a = a- b;   
        }
        System.out.println("Answer: "+ c);
        System.out.println("Remainder: "+a);
    }
    
}