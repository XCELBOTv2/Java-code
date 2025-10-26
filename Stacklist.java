import java.util.Scanner;
class Stacks{
    int stacks[];
    int top = -1;

    Stacks(int size){
        stacks = new int[size];
    }
    void push(int data){
        if(isFull()){
            System.out.println("Stacks is already Full");
        }else{
            top++;
            stacks[top] = data;
        }
    }
    int pop(){
        int data = 0;

        if(isEmpty()){
            System.out.println("Stacks is empty");

        }else{
            data = stacks[top];
            stacks[top] = 0;
            top --;
        }
        return data;
    }
    int peek(){
    return stacks[top];
}
    boolean isFull(){
        return top == stacks.length -1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    void Display(){
        for(int x = top; x>=0; x--){
            System.out.println(stacks[x]);
        }
    }
    boolean Search(int target){
        for(int i = 0; i<=top; i++){
            if(stacks[i] == target){
                return true;
            }
        }
                return false;
            
        }
    }
    public class Stacklist {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Size: ");
            int c = input.nextInt();
            Stacks st = new Stacks(c);
            int choice;
            
            do{
                System.out.println("[1] push");
                System.out.println("[2] Pop" );
                System.out.println("[3] Display");
                System.out.println("[4] Peek");
                System.out.println("[5] Search");
                choice = input.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Enter data: ");
                        int data = input.nextInt();
                        st.push(data);
                
                break;
                    case 2:
                    System.out.println("Deleting data: "+ st.pop());
                break;
                    case 3:
                    System.out.println("Displaying: ");
                    st.Display();
                break;
                    case 4:
                    System.out.println("Peek: "+ st.peek());
                break;
                case 5:
                    System.out.println("Search: ");
                    int target = input.nextInt();
                    if(st.Search(target)){
                        System.out.println(target+"is here");
                    }else{
                        System.out.println(target+ "is not here");
                    }
                    break;
                default:

                System.out.println("Try another number");
            }
        }while(choice != 0);
    }
}