import java.util.Objects;

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

    @Override
    public String toString() {
        return "Полная информация о книге:\n1. Название: " + name + ".\n2. " + author + ".\n3. Год публикации: " + yearOfPublished + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublished == book.yearOfPublished && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublished);
    }
}
