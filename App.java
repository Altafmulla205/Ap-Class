import java.util.Scanner;

class Apclass {
     String courseName;
     double courseFees;
     String courseDuration;

    public Apclass(String courseName, double courseFees, String courseDuration) {
        this.courseName = courseName;
        this.courseFees = courseFees;
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + "\n" +
               "Course Fees: " + courseFees + "\n" +
               "Course Duration: " + courseDuration;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Apclass selectedCourse = null;

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Welcome to AP Classes");
            System.out.println("Press 1 for Data Science");
            System.out.println("Press 2 for Java");
            System.out.println("Press 3 for Python");
            System.out.println("Press 4 for HTML & CSS");
            System.out.println("Press 5 for JavaScript");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    selectedCourse = new Apclass("Data Science", 120000.0, "12 Months");
                    break;

                case 2:
                    selectedCourse = new Apclass("Java", 60000.0, "6 Months");
                    break;

                case 3:
                    selectedCourse = new Apclass("Python", 55000.0, "6 Months");
                    break;

                case 4:
                    selectedCourse = new Apclass("HTML & CSS", 30000.0, "3 Months");
                    break;

                case 5:
                    selectedCourse = new Apclass("JavaScript", 45000.0, "4 Months");
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.\n");
            }
            if (selectedCourse != null) {
                System.out.println("\nCourse Details:");
                System.out.println(selectedCourse);
                System.out.println("Press 1 for Back");
                System.out.println("Press 0 for Exit");
                
                int backOption = sc.nextInt();
                if (backOption == 0) {
                    System.out.println("Thank you for Visiting");
                    keepRunning = false;
                } 
            }
        }
        

        sc.close();
    }
}