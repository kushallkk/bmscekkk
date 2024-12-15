import java.util.Scanner;
import java.lang.Math;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        
        
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            return; 
        }

        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        
        
        int d = b * b - 4 * a * c;
        
        if (d == 0) {
            
            double r1 = -b / (2.0 * a);
            System.out.println("The roots are real and equal: " + r1);
        } 
        else if (d > 0) {
            
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real and distinct: " + r1 + " and " + r2);
        } 
        else {
            
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-d) / (2.0 * a);
            System.out.println("The roots are imaginary: " + realPart + " ± " + imaginaryPart + "i");
        }
    }
}