import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        /*ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(25);
        numbers.add(45);
        numbers.add(65);
        for(int i = numbers.size()-1; i>=0; i--){
            System.out.println("The numbers are "+numbers.get(i));
        }
        ArrayList<arraylist2> numbers = new ArrayList<arraylist2>();
        numbers.add(new arraylist2(45));
        numbers.add(new arraylist2(25));
        numbers.add(new arraylist2(15));

        for (arraylist2 n : numbers){
            n.getnumber();
        }*/
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

      
