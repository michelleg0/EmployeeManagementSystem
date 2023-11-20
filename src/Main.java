import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    //Create array list to house employee data. This array is at the top since it's being used multiple times.
    //If its inside a function, then it is usuable for other functions
    static ArrayList<String> employees = new ArrayList<>();
    public static void main(String[] args) {
        int optionNumberSelected;




        //Menu
        do {
            showMainMenu();

            Scanner scanner = new Scanner(System.in);
            optionNumberSelected = scanner.nextInt();

            switch (optionNumberSelected){
                case 1:
                    employeeInformation();
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                   upDateEmployee();
                    break;
                default: break;
            }

        } while (optionNumberSelected != 5);
    }




    public static void showMainMenu() {
        System.out.println("===========================================");
        System.out.println("Select option number from the menu below.");
        System.out.println("1. Fill out employee information");
        System.out.println("2. See list of employees");
        System.out.println("3. Delete employee");
        System.out.println("4. Update employee");
        System.out.println("3. Exit menu");
        System.out.println("===========================================");
    }
    public static void employeeInformation() {
        String firstName;
        String lastName;
        String birthDate;
        int employeeSSN;
        String employeeDeparment;
        float employeeSalary;
        boolean isEmployeeActive = false;
        String isEmployeeActiveStr;
        boolean isContinue;
        String isContinueStr;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter employee's first name:");
            firstName = scanner.next();

            System.out.println("Enter employee's last name:");
            lastName = scanner.next();

            System.out.println("Enter employee's birth date:");
            birthDate = scanner.next();

            System.out.println("Enter Employee SSN:");
            employeeSSN = Integer.parseInt(scanner.next());

            System.out.println("Enter employee salary:");
            employeeSalary = Float.parseFloat(scanner.next());

            System.out.println("Enter employee's department:");
            employeeDeparment = scanner.next();

            System.out.println("Is the employee still active? (active/inactive)");
            isEmployeeActiveStr = scanner.next();
            isEmployeeActive = isEmployeeActiveStr.equals("active");


            System.out.println("Do you wish to continue sorting another employee? (yes/no)");
            isContinueStr = scanner.next();
            isContinue = isContinueStr.equals("yes");

            employees.add(firstName + " " + lastName + " - " + birthDate + "  "  + employeeSSN + "  " + employeeDeparment + "  " + employeeSalary + "  " + isEmployeeActive);




        } while (isContinue);
    }



    //Display list of employees
    public static void listEmployees() {
        System.out.println("View employee list:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }


//complete the delete first
   public static void deleteEmployee (){

    }

    public static void upDateEmployee (){

    }
}
