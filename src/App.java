import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("Welcome to Trajectory!");
        System.out.println("Your financial journey begins here!");
        System.out.println("============================");

        displayMenu(scanner); //call method to DisplayMenu 
       

        scanner.close();
    }

    public static void displayMenu(Scanner scanner){
        boolean loop = true;

        while(loop){
            //print menu options
            System.out.println("1: Add transaction");
            System.out.println("2: View transactions");
            System.out.println("3: View balance");
            System.out.println("4: View monthly summary");
            System.out.println("5: Exit");
            System.out.println("Select an option(1-5): ");
            
            if(!scanner.hasNextInt()){
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            } 
            
            int response = scanner.nextInt();
             scanner.nextLine(); //clear newline

            switch(response) {
                case 1:
                    System.out.println("Add transaction selected.");
                    break;
                case 2:
                    System.out.println("View transactions selected");
                    break;    
                case 3:
                    System.out.println("View balance selected.");
                    break;
                case 4:
                    System.out.println("View monthly summary selected.");
                    break;
                case 5:
                    System.out.println("Exiting program! Thank you for using Trajectory!");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select 1-5.");
                    break;
            }
        }
    }
   
}
