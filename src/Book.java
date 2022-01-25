public class Book {
    private final String name;
    private final Author author;
    private int yearOfPublished;

    public Book(String name, Author author, int yearOfPublished) {
        this.name = name;
        this.author = author;
        this.yearOfPublished = yearOfPublished;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }
}
