import java.util.ArrayList;

public class People {
    ArrayList<Author> authors;
    String name;

    public People(String peopleName) {
        authors = new ArrayList<>();
        this.name = peopleName;
    }

    public void addAuthor(Author e) {
        authors.add(e);
    }

    public static void main(String[] args) {
        Author filip = new Author("Filip", "18");
        People te18 = new People("Te18");
        te18.addAuthor(filip);
    }
}
