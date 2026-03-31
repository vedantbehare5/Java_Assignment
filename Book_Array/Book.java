class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book b[] = {
            new Book("Java", "ABC", 500),
            new Book("Python", "XYZ", 600)
        };

        for (Book x : b)
            x.display();
    }
}