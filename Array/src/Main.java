import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            int sizeem;
            String searchid;
            sizeem = scanner.nextInt();
            String[] employees = new String[sizeem];

            fillArray(employees);
            printArray(employees);

            System.out.println("Enter the name do you want");
            searchid = scanner.nextLine();

            boolean returnedIndex = search(employees, searchid);
            System.out.println(returnedIndex);
        } catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
    public static String[] fillArray(String[] employees1) {

        for (int i = 0; i < employees1.length; i++) {
            employees1[i] = scanner.nextLine();
            System.out.println("Enter the next Employees: ");
        }
        return employees1;
    }

    public static void printArray(String[] employees1) {
        for (int i = 0; i < employees1.length; i++) {
            System.out.println(employees1[i] + " ");
            System.out.println();
        }
    }
    public static boolean search(String[] employees1, String target) {
        for (int i = 0; i < employees1.length; i++) {
            if (employees1[i].equals(target)) {
                System.out.println(target);
                return true;
            }
        }
        return false;
    }
}




/*    try {
            Scanner reader = new Scanner(System.in);
            System.out.println(
                    "Enter how much size do you need"
            );
            int size;
            size = reader.nextInt();


            String[] name = new String[size];
            double[] credit = new double[size];

            for (int i = 0; i< name.length; i++){
                if (name.length > 1){
                    name[i] = reader.nextLine();
                    System.out.println("Enter the next name: "+ (i + 1) + " " + name[i]);
                } else {
                    System.out.println("wrong name");
                }
            }
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
*/