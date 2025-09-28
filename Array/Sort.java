import java.util.ArrayList;
public class Sort {
    public static void main(String[] args) {
       
        int[] numbers ={23,34,17,89,90,65,24,12,8,79};
        
        for(int number : numbers){
            System.out.println(number);
        }
        int data = 0;
        for (int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    data = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = data;
                }
            }
        }
        System.out.println("SHEEEESH: ");
        for(int i = 0;i<numbers.length; i++)
            System.out.println(numbers[i] + " ");
        }

    }

      

