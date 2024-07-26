//GradeTrackerApp class or main class.
import java.util.*;
public class GradeTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        try {
            // Input student data
            System.out.print("Enter the number of students: ");
            int numStudents = Integer.parseInt(scanner.next());
            scanner.nextLine(); // Consume newline
            if(numStudents<0){
                System.out.println("Number of student should be more than 0.\n");
                System.exit(0);
            }

            System.out.print("Enter the number of subjects: ");
            int numSubjects = Integer.parseInt(scanner.next());
            scanner.nextLine(); // Consume newline
            if(numSubjects<0){
                System.out.println("Number of subjects should be more than 0.\n");
                System.exit(0);
            }

            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter student"+(i+1)+" name: ");
                String name = scanner.nextLine();

                System.out.print("Enter student's roll number: ");
                int roll = Integer.parseInt(scanner.next());

                Student student = new Student(name,roll);

                System.out.println("Enter grades of the subjects.......");
                for(int j=0;j<numSubjects;j++){
                
                    System.out.print("subject"+(j+1)+" : ");
                    String grade = scanner.next();
                    student.addGrade(Double.parseDouble(grade));
                }
                scanner.nextLine(); // Consume newline

                students.add(student);
            }

            // Calculate and display statistics
            System.out.println();
            for (Student student : students) {
                System.out.println("Roll: " + student.roll);
                System.out.println("Name: " + student.name);
                System.out.println("Average: " + student.getAverage());
                System.out.println("Highest Grade: " + student.getHighestGrade());
                System.out.println("Lowest Grade: " + student.getLowestGrade());
                System.out.println();
            }
            //Display topper details
            System.out.println("Details of topper from the student's :");
            System.out.println("Name : "+Student.topperName);
            System.out.println("Roll:"+Student.topperName);
            System.out.println("Average grade : "+Student.topperGrade);
            System.out.println();
        }catch(NumberFormatException e){
            // Number of students/number of subjects/Roll number/grade or mark of student
            System.out.println("An error occur "+e.getMessage());
        }catch(Exception e){
            System.out.println("An error occur "+e.getMessage());
        }
        scanner.close();
    }
}