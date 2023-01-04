public class libraryReaders {
    private String fullName;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getPhone() {
        return this.phone;
    }

    public libraryReaders(String fullName, int cardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int number) {
        System.out.print(this.fullName + " took " + number + " books.");
    }

    public void takeBook(String[] bookTitles) {
        System.out.print(this.fullName + " took books: ");

        for(int i = 0; i < bookTitles.length; ++i) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void takeBook(Book[] books) {
        System.out.print(this.fullName + " took books: ");

        for(int i = 0; i < books.length; ++i) {
            System.out.print(books[i].getTitle());
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(int numBooks) {
        System.out.println(this.fullName + " returned " + numBooks + " books.");
    }

    public void returnBook(String[] bookTitles) {
        System.out.print(this.fullName + " returned books: ");

        for(int i = 0; i < bookTitles.length; ++i) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}