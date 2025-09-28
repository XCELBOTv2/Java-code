import java.util.Scanner;

public class methods {
    
     public static boolean isPrime (int n){
        if(n <= 1){
        return false;
        }
        if (n % 2 == 0 && n != 2 ){
            return false;
        }
        for (int i = 3; i<n; i+=2){
        if (n % i == 0)
        return false;
 }
 return true;
}


  public static void main(String[] args) {
   
  
    Scanner input = new Scanner(System.in);
    String choice;
      do{
    System.out.print("Input a number: ");
    int num = input.nextInt();
    if(isPrime(num)){
    System.out.println(num + " is Prime");
  }else{
    System.out.println(num + " is not a Prime");
  }
  System.out.print("Wanna try again? (y/n): ");
  choice = input.next();
}while (choice.equalsIgnoreCase("y"));
    
System.out.println("Thanks");
}
  }
  


