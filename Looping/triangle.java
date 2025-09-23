import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give me an Number: ");
        int n = input.nextInt();
        int a = 0;
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<i; j++){
            a++;
            System.out.print(a);
            }
            System.out.println();
            a=0;
        }
        for(int i = 0; i<=n;){
            for(int j = 0; j<n; j++){
                a++;
                System.out.print(a);
            }
            System.out.println();
            a=0;
            n--;
        }
    }
}
