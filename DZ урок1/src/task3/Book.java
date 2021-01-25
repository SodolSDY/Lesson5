package task3;

public class Book {
        public static void main(String[] args) {
        Title t = new Title();
        Content c = new Content();
        Author a = new Author();

        a.setAuthor("Автор: Дмитрий");
        t.setTitle("Титулка");
        c.setContent("Содержание");

        a.show();
        t.show();
        c.show();
        }
}
