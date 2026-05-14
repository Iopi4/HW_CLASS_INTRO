
public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    //Метод возвращающий ответ на вопрос, является ли книга большой; книгу считаем большой, если в ней больше 500 страниц.
    public String isBig() {
        if (pages > 500) {
            return "-Да, больше 500 стр.";
        } else return "-Нет, меньше 500 стр.";
    }

    //Метод возвращающий ответ на вопрос, содержится ли в описании книги (названии или в имени автора) переданное параметром слово.
    public String matches(String word) {
        if (title.contains(word) || author.name.contains(word) || author.surname.contains(word)) {
            return "-Да содержится";
        } else return "-Нет не содержится";
    }

    //Метод возвращающий оценку стоимости книги (целое число в рублях) по формуле 3 рубля за страницу, но не меньше 250 рублей.
    public int estimatePrice() {
        int price = pages * 3;
        return Math.max(price, 250);
    }

    //Дополнительный метод для вывода общей информации по книге и ответы на вопросы.
    public void informationBook(String word) {
        System.out.println("[Название книги: " + title + "."
                + " Aвтор - " + author
                + " (Книга большая?: " + isBig() + ") "
                + " {Поиск введенного слова: " + matches(word) + "} "
                + " Стоимость книги: " + estimatePrice() + " руб.");
    }
}
