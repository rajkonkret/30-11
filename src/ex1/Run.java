package ex1;

public class Run {
    public static void main(String[] args) {
        String mrTadzioMainAuthor = " Adaś Mick";
        String[] mrTAuthors = new String[1];
        mrTAuthors[0] = mrTadzioMainAuthor;

        Book mrTadzio = new Book("Pan Tadeusz",
                "Pan Tadeusz Adama Mickiewicza",
                12345678,
               mrTadzioMainAuthor,
                mrTAuthors);

        System.out.println(mrTadzio.getName());
    }
}
