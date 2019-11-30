package ex1;

public class Book {
    private String name;
    private String description;
    private int isbn;


    private String mainAuthor;
    private String[] authors;

    Book(String name,
         String description,
         int isbn,
         String mainAuthor,
         String[] authors
    ) {
        this.name = name;
        this.description = description;
        this.isbn = isbn;
        this.mainAuthor = mainAuthor;
        this.authors = authors;
    }

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    int getIsbn() {
        return isbn;
    }

    String getMainAuthor() {
        return mainAuthor;
    }
}
