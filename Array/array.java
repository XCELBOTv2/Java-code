import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int c;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many students: ");
        c = input.nextInt();
        String[] Student = new String[c];
        int[] grade = new int[c];

            for(int i = 0; i<c; i++){
                System.out.print("Enter the name: ");
                Student[i] = input.next();
                }

            for(int i = 0; i<c; i++){
                System.out.print("Enter the grade: ");
                grade[i] = input.nextInt();
                }
            int ch;
            do{
            System.out.println("Display all [1]: ");
            System.out.println("Search Student[2]: ");
            System.out.println("Highest Grade [3]: ");
            System.out.println("Average Grade [4]: ");
            System.out.println("Exit [0]: ");
            System.out.print("your choice: ");
            ch = input.nextInt();

            boolean found = false;
            String name;

                switch (ch) {
                    case 1:
                        System.out.println("DISPLAY ALL: ");
                        for(int i = 0; i<c; i++){
                        System.out.println(Student[i]+":"+grade[i]);
                         }
                        break;
                    case 2:
                        System.out.print("Search name: ");
                        name = input.next();
                        
                        for(int i = 0; i<c; i++){
                        if(name.equalsIgnoreCase(Student[i])){
                            System.out.println("Found:" + name);
                            found = true;
                            break;
                        }
                    }
                        if(!found){
                            System.out.println("Unknown");
                        } 
                        break;
                    case 3: {
                        int max = grade[0];
                        for(int i = 0; i<grade.length; i++){
                                if(grade[i] > max){
                                    max = grade[i];
                                }
                        }
                        System.out.println("Highest Grade: "+ max);
                        break;
                    } 
                    case 4:{
                        int Average = 0;
                        int ave = 0;
                        for(int i = 0; i<c; i++){
                            ave += grade[i];
                            Average = ave/grade.length;
                        }
                        System.out.println("Average Grade: "+ Average);
                    }
                    case 0:{
                        System.out.println("THANKS");
                        break;
                    }
                    default:
                        System.out.println("Please choose an valid number.");
    
                }
            }while(ch !=0);
                
            }
            
    }


