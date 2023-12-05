import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static ArrayList<String> employees = new ArrayList<>();

    public static void main(String[] args) {
        int optionNumberSelected;


        //Menu
        do {
            showMainMenu();

            Scanner scanner = new Scanner(System.in);
            optionNumberSelected = scanner.nextInt();

            switch (optionNumberSelected) {
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
                default:
                    break;
            }

        } while (optionNumberSelected != 5);
    }


    public static void showMainMenu() {
        System.out.println("===========================================");
        System.out.println("Select option number from the menu below.");
        System.out.println("1. Fill out employee information");
        System.out.println("2. View list of employees");
        System.out.println("3. Delete employee");
        System.out.println("4. Update employee");
        System.out.println("3. Exit menu");
        System.out.println("===========================================");
    }

    public static void employeeInformation() {
        String firstName;
        String lastName;
        String birthDate;
        String employeeSSN;

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
            employeeSSN = scanner.next();

            System.out.println("Enter employee salary:");
            employeeSalary = Float.parseFloat(scanner.next());

            System.out.println("Enter employee's department:");
            employeeDeparment = scanner.next();

            System.out.println("Is the employee still active? (yes/no)");
            isEmployeeActiveStr = scanner.next();
            isEmployeeActive = isEmployeeActiveStr.equals("yes");


            System.out.println("Do you wish to continue viewing other employees? (yes/no)");
            isContinueStr = scanner.next();
            isContinue = isContinueStr.equals("yes");

            employees.add(firstName + " " + lastName + " - " + birthDate + "  " + employeeSSN + "  " + employeeDeparment + "  " + employeeSalary + "  " + isEmployeeActive);


        } while (isContinue);
    }



    public static void listEmployees() {
        System.out.println("View employee list:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }



    //complete the delete first
    public static void deleteEmployee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which employee would you like to delete? Please enter the employee SSN: ");

        String deleteSSN = scanner.next();

        for (String employee : employees) {
            if (employee.contains(deleteSSN)) {
                //remove from array list - singular
                employees.remove(employee);
                System.out.println("We have founds records of. " + deleteSSN + " Their records have sucessfully been removed.");
                return;
            }
        }
    }


    public static void upDateEmployee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee SSN: ");
        String employeeSSN = scanner.next();

        System.out.println("Enter employee first name: ");
        String firstName = scanner.next();

        System.out.println("Enter employee last name: ");
        String lastName = scanner.next();




        for (String employee : employees) {
            if (employee.contains(employeeSSN)) {

                employees.remove(employee);
                employees.add(firstName + " " + lastName +  "  " + employeeSSN );
                System.out.println("We have added a new employee record. " + employeeSSN);
                return;


            }
        }
    }
}

