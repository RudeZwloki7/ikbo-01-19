package Exercise1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Lev Tolstoy", "lev.hudoi@gmail.com", 'm');
        System.out.println(author.toString());
        author.setEmail("lev.tolstoy@mail.ru");
        System.out.println(author.toString());
    }
}
