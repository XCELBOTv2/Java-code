import java.util.Scanner;

class Node{
    int data;
    Node next;
}
class Linked{
    Node head;

    void push(int data){
        Node node = new Node();
        node.data = data;

        if(head == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }

    }
    int pop(){
        int data = 0;
        if(head == null){
            System.out.println("Stack is empty");
        }else{
            data = head.data;
            head = head.next;
        }
        return head.data;
    }
    void Display(){
        Node node = head;
        while(node != null){
        System.out.println(node.data);

        node = node.next;
        }
    }
    int peek(){
       return head.data;
    }
    boolean search(int target){
        Node node = head;
        while(node != null){
            if(node.data == target){
                return true;
            }
            node = node.next;
            
        }
        return false;

    }
    }
    public class Stacked {
    
        public static void main(String[] args) {
            Linked st = new Linked();
            Scanner input = new Scanner(System.in);
            int choice = 0;
            do{
                System.out.println("1 Push: ");
                System.out.println("2 Pop");
                System.out.println("3 Display");
                System.out.println("4 Peek");
                System.out.println("5 Search");
                choice = input.nextInt();

                if(choice == 1){
                    int data;
                    System.out.println("Add a data: ");
                    data = input.nextInt();
                    st.push(data);
                }
                if (choice == 2){
                    System.out.println("Popping: "+ st.pop());
                    
                }
                if (choice == 3){
                    System.out.println("Display: ");
                    st.Display();
                }
                if (choice == 4){
                    System.out.println("Peeking...");
                    System.out.println(st.peek());
                    
                }
                if(choice == 5){
                    System.out.println("Enter a Value: ");
                    int target = input.nextInt();
                    if(st.search(target)){
                        System.out.println("Found it");

                    }else{
                        System.out.println("Nope");
                    }
                
                }
            }while (choice != 0);
        }
    }
