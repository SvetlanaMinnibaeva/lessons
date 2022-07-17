package lesson10Kaz.izdatelstvo;

public class Book extends PrintPub{
    private String author;
    private int countPage;


    public Book(){

    }

    public Book(String name, int year, String pub, String author, int countPage) {
        super(name, year, pub);
        this.author = author;
        this.countPage = countPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (countPage != book.countPage) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + countPage;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", countPage=" + countPage +
                ", name=" + super.getName() +
                ", year=" + super.getYear() +
                ", pub=" + super.getPub() +
                '}';
    }
}
