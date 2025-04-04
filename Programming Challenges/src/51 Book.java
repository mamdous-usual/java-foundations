class Book {
    static int totalBooks;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    { // Object Init
        totalBooks++;
    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this("Unknown","unknown", isbn);
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("This book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("Design", "MrPoet", "417.5");
        Book myBook = new Book("1");
        System.out.println(getTotalBooks());
        designOfThings.borrowBook();
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.returnBook();
        myBook.returnBook();
        myBook.returnBook();

    }
}
