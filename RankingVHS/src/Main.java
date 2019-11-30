import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Film dogs = new Film("Psy", 0.2, 0.5, FilmCategory.ACTION, true);
        Film earth = new Film("Ziemia obiecana", 0.76, 0.99, FilmCategory.DRAMA, true);
        Film batman = new Film("Batman", 0.99, 0.45, FilmCategory.COMEDY, true);
        Film grey = new Film("50 Fades of Gray", 0.99, 0.99, FilmCategory.ACTION, true);
        Film[] filmsToOffer = {dogs, earth, batman, grey};

        for (Film film : filmsToOffer) {
            System.out.println(film.toPrint());
        }
        Store advisorRadek = new Store(filmsToOffer);
        Advisor advisor = new Advisor(advisorRadek, 1, 1);

        System.out.println("\nPolecany film: " + advisor.findBestFromBoth(FilmCategory.COMEDY).toPrint());

        System.out.println("\nPodaj film, który wypożyczasz");
        int filmToRent = scanner.nextInt();
        filmsToOffer[filmToRent - 1].setIspresent(false);
        Film yourFilm = filmsToOffer[filmToRent - 1];
        System.out.println("Wypożyczyłeś: " + yourFilm.toPrint());

        System.out.println("Chcesz oddac? (t/n)");
        String yourchoice = scanner.next();
        if (yourchoice.equalsIgnoreCase("t")) {
            yourFilm.setIspresent(true);
            for (Film film : filmsToOffer) {
                System.out.println(film.toPrint());
            }
        }
    }
}
