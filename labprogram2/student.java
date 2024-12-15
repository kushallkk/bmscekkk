import java.util.Scanner;

class StudentDet {
    int marks[] = new int[3];
    String usn, name, grade;
    int credits = 12;
    double scgpa;
    Scanner sc = new Scanner(System.in);

    void getDetails() {
        System.out.print("Enter USN and Name: ");
        usn = sc.next();
        name = sc.next();
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Marks for the 3 subjects are:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }

    void calcScgpa() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += marks[i];
        }
        // Assuming 100 is the max marks per subject
        scgpa = (sum / 3.0) * (credits / 30.0); // Adjusting based on the credits

        if (scgpa >= 9) {
            grade = "S";
        } else if (scgpa >= 8) {
            grade = "A+";
        } else if (scgpa >= 7) {
            grade = "A";
        } else if (scgpa >= 6) {
            grade = "B+";
        } else if (scgpa >= 5) {
            grade = "B";
        } else {
            grade = "F";
        }

        System.out.println("SCGPA: " + scgpa + " Grade: " + grade);
    }
}

class Student {
    public static void main(String args[]) {
        StudentDet s1[] = new StudentDet[3];
        for (int j = 0; j < 3; j++) {
            s1[j] = new StudentDet();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            s1[i].getDetails();
        }

        for (int j = 0; j < 3; j++) {
            s1[j].display();
            s1[j].calcScgpa();
        }
    }
}