import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        new Phone(11, "Xiaomi", 160.0);
        libraryReaders Salim = new libraryReaders("Salimbek", 13, "SE", "28.03.05", "87762482761");
        Book[] Comics = new Book[]{new Book("Marvel", "Avengers"), new Book("Marvel", "Thor")};
        Salim.returnBook(3);
        String[] fantasy = new String[]{"Van Ghok", "Ella", "Producy of water"};
        Salim.returnBook(fantasy);
        Salim.takeBook(Comics);
        Matrix matrix1 = new Matrix(4, 2);
        Matrix matrix2 = new Matrix(4, 2);
        matrix1.print();
        System.out.println();
        matrix1.add(matrix2);
    }
}