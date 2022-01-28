public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");
        Author twain = new Author("Марк", "Твен");
        Author chekhov = new Author("Антон", "Чехов");
        Author cooper = new Author("Джеймс", "Куппер");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1896);
        Book onegin = new Book("Евгений Онегин", pushkin, 1847);
        Book onegin1 = new Book("Евгений Онегин", pushkin, 1847);
        Book tom = new Book("Приключения Тома Сойера", twain, 1859);
        Book uncle = new Book("Дядя Ваня", chekhov, 1882);
        Book deerSlayer = new Book("Зверобой", cooper, 1841);
        uncle.setYearOfPublished(1905);


        Book[] arrayBooks = {warAndPeace, onegin, tom, uncle, deerSlayer};
        for (Book arrayBook : arrayBooks) {
            System.out.println("Название книги - " + arrayBook.getName() + ". Автор - " + arrayBook.getAuthor().getFirstName() + " " +
                    arrayBook.getAuthor().getLastName() + ". Год публикации - " + arrayBook.getYearOfPublished());
        }

        for (Book arrayBook : arrayBooks) {
            if (arrayBook.getName().equals("Зверобой")) {
                System.out.println("Книга - " + arrayBook.getName() + ". Год публикации - " + arrayBook.getYearOfPublished());
                arrayBook.setYearOfPublished(1912);
                System.out.println("Год переиздания книги " + arrayBook.getName() + " - " + arrayBook.getYearOfPublished());
            }
        }

        System.out.println(tolstoy);
        System.out.println(deerSlayer);
        System.out.println(onegin.equals(tom));
        System.out.println(onegin.hashCode());
        System.out.println(onegin1.hashCode());


    }
}
