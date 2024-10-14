import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public void tostring() {
        System.out.println("The name of the book: " + this.name);
        System.out.println("The author of the book: " + this.author);
        System.out.println("The price of the book: " + this.price);
        System.out.println("The number of pages: " + this.numPages);
    }
}

class Student2 {
    public static void main(String args[]) {
        int n = 0;
        System.out.println("Enter the number of books:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Books[] b = new Books[n];

        // Consume the newline character left by nextInt
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name, author, price, and number of pages for book " + (i + 1) + ":");
            String name = sc.nextLine();
            String author = sc.nextLine();
            int price = sc.nextInt();
            int numPages = sc.nextInt();
            // Consume the newline character left by nextInt
            sc.nextLine();

            b[i] = new Books(name, author, price, numPages);
        }

        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++) {
            b[i].tostring();
        }

        sc.close();
    }
}
