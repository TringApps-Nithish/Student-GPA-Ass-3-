
/*"3. Design a class for a student at a school. The class should have the following features:
         - Instance variables for the student's name, grade level, and GPA.
         - A constructor that allows the user to create a student with a given name, grade level, and GPA.
         - A method that allows the user to update the student's GPA.
         - A method that returns the student's name and GPA as a string (e.g. ""John Doe has a 3.5 GPA"")."*/
import java.util.*;

class info {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String name, grade;

        System.out.printf("\n -------NEW STUDENT DETAILS----- ");
        System.out.printf("\n Enter Student Name : ");
        name = sc.nextLine();
        System.out.printf(" Enter your grade : ");
        System.out.printf("\n  A -> 4 Points \n  B -> 3 Points \n  C -> 3 Points \n  D -> 4 Points \n");
        System.out.printf("\n Enter Here : ");
        grade = sc.nextLine();
        cal a = new cal(name);
        System.out.printf(a.calgpa(grade));
        a.upgpa();
    }
}

class cal {
    int gpa = 0;
    String name, grade;
    Scanner sc = new Scanner(System.in);

    cal(String name) {
        this.name = name;
        System.out.printf("\n Details added successfully!!!\n");
    }

    String calgpa(String grade) {
        switch (grade) {
            case "A": {
                gpa = 4;
            }
                break;
            case "B": {
                gpa = 3;
            }
                break;
            case "C": {
                gpa = 2;
            }
                break;
            case "D": {
                gpa = 1;
            }
                break;
            default:
                System.out.printf("\n Enter the valid grade A to D");
                break;
        }
        return ("\n " + name + " has " + gpa + " GPA.");
    }

    public void upgpa() {

        int ch;

        Scanner sc = new Scanner(System.in);
        System.out.printf("\n ------ Want to Update ------ \n YES=1\t\tNO=0 \n");
        System.out.printf("\n Enter Your Choice : ");
        ch = sc.nextInt();
        if (ch == 1) {
            gpa = 0;
            System.out.print("\n Enter your new grade: ");
            String newgrade = sc.next();
            System.out.printf(calgpa(newgrade));
        } else {
            System.out.printf("\n Exiting.....");
            System.exit(0);
        }
    }

}