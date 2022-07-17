package lesson10Kaz.izdatelstvo;

public abstract class PrintPub {
    private String name;
    private int year;
    private String pub;

    public PrintPub() {
    }

    public PrintPub(String name, int year, String pub) {
        this.name = name;
        this.year = year;
        this.pub = pub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrintPub)) return false;

        PrintPub printPub = (PrintPub) o;

        if (year != printPub.year) return false;
        if (name != null ? !name.equals(printPub.name) : printPub.name != null) return false;
        return pub != null ? pub.equals(printPub.pub) : printPub.pub == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + (pub != null ? pub.hashCode() : 0);
        return result;
    }

    @Override
    public abstract String toString();

    public static void printMaxPage(PrintPub[] printPubs) {
        Book book = null;
        for (PrintPub pub : printPubs) {
            if (pub instanceof Book) {
                if (book == null)
                    book = (Book) pub;
                else if (book.getCountPage() < ((Book) pub).getCountPage()) ;
                book = (Book) pub;
            }
        }
        System.out.println(book);
    }

    public static PrintPub[] sortBookDescending(PrintPub[] printPubs) {
        for (int i = printPubs.length - 1; i > 0; i--) {
            if (printPubs[i] instanceof Book) {
                for (int j = 0; j < i; j++) {
                    if (((Book) printPubs[j]).getCountPage() < ((Book) printPubs[j + 1]).getCountPage()) {
                        Book temp = (Book) printPubs[j];
                        printPubs[j] = (Book) printPubs[j + 1];
                        printPubs[j + 1] = temp;
                    }
                }
            }
        }
        return printPubs;
    }

    public static PrintPub[] sortBookAscending(PrintPub[] printPubs) {
        for (int i = printPubs.length - 1; i > 0; i--) {
            if (printPubs[i] instanceof Book) {
                for (int j = 0; j < i; j++) {
                    if (((Book) printPubs[j]).getCountPage() > ((Book) printPubs[j + 1]).getCountPage()) {
                        Book temp = (Book) printPubs[j];
                        printPubs[j] = (Book) printPubs[j + 1];
                        printPubs[j + 1] = temp;
                    }
                }
            }
        }
        return printPubs;
    }
}



