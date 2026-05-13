public class Main {
    public static void main(String[] args) {
        //Создадим четыре книги
        Book book1 = new Book("1984", 1949, "Джордж Оруэлл", 320);
        Book book2 = new Book("Война и Мир", 1873, "Лев Николаевич Толстой", 1500);
        Book book3 = new Book("Мертвые души", 1842, "Николай Васильевич Гоголь", 352);
        Book book4 = new Book("Колобок", 1965, "Алексей Николаевич Толстой", 32);

        //Вызовем методы для отображения информации о каждой книге для пользователя с ответом на поисковое слово.
        book1.informationBook("123");
        book2.informationBook("Толстой");
        book3.informationBook("Мертвые");
        book4.informationBook("Кол");
    }
}