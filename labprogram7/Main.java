import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.age = age;
        System.out.println("Father's age: " + age);
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age: " + sonAge);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Father's age for Test Case 1:");
            int fatherAge1 = scanner.nextInt();
            System.out.println("Enter Son's age for Test Case 1:");
            int sonAge1 = scanner.nextInt();
            Son son1 = new Son(fatherAge1, sonAge1);
        } catch (WrongAge e) {
            System.out.println("Exception in Test Case 1: " + e.getMessage());
        }

        try {
            System.out.println("\nEnter Father's age for Test Case 2:");
            int fatherAge2 = scanner.nextInt();
            Father father2 = new Father(fatherAge2);
        } catch (WrongAge e) {
            System.out.println("Exception in Test Case 2: " + e.getMessage());
        }

        try {
            System.out.println("\nEnter Father's age for Test Case 3:");
            int fatherAge3 = scanner.nextInt();
            System.out.println("Enter Son's age for Test Case 3:");
            int sonAge3 = scanner.nextInt();
            Son son2 = new Son(fatherAge3, sonAge3);
        } catch (WrongAge e) {
            System.out.println("Exception in Test Case 3: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}