public class Main {
    public static void main(String[] args) {
        //Создадим 4-х авторов для четырех книг
        Author author1 = new Author("Джордж", "Оруэлл", 5);
        Author author2 = new Author("Лев", "Толстой", 4);
        Author author3 = new Author("Николай", "Гоголь", 3);
        Author author4 = new Author("Алексей", "Толстой", 2);

        //Создадим четыре книги
        Book book1 = new Book("1984", 1949, author1, 320);
        Book book2 = new Book("Война и Мир", 1873, author2, 1500);
        Book book3 = new Book("Мертвые души", 1842, author3, 352);
        Book book4 = new Book("Колобок", 1965, author4, 32);

        //Вызовем методы для отображения информации о каждой книге для пользователя с ответом на поисковое слово.
        book1.informationBook("123");
        book2.informationBook("Толстой");
        book3.informationBook("Мертвые");
        book4.informationBook("Кол");
    }
}