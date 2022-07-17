package lesson10Kaz.izdatelstvo;

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        Journal j = new Journal();
        PrintPub[] printPubs = new PrintPub[7];

        printPubs[0] = new Book("Преступление и наказание", 2020, "Махаон",
                "Федор Михайлович Достоевский", 608);
        printPubs[1] = new Book("Бесы", 2018, "Махаон",
                "Федор Михайлович Достоевский", 704);
        printPubs[2] = new Book("Бедные люди", 2019, "Махаон",
                "Федор Михайлович Достоевский", 354);
        printPubs[3] = new Book("Братья Карамазовы", 2015, "Махаон",
                "Федор Михайлович Достоевский", 513);
        printPubs[4] = new Book("Финансист", 2015, "Клевер",
                "Теодор Драйзер", 815);
        printPubs[5] = new Journal("ESQUIRE", 2020, "Premium Publishing", 11);
        printPubs[6] = new Journal("ESQUIRE", 2021, "Premium Publishing", 12);

        PrintPub.printMaxPage(printPubs);
        System.out.println();

        PrintPub.sortBookDescending(printPubs);
        for (PrintPub pub : printPubs)
            System.out.println(pub);

        System.out.println();

        PrintPub.sortBookAscending(printPubs);
        for (PrintPub pub : printPubs)
            System.out.println(pub);

    }
}



