import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean print = true;
        Scanner scanner = new Scanner(System.in);
        Film dogs = new Film("Psy", 0.2, 0.5, FilmCategory.ACTION, true, 1);
        Film earth = new Film("Ziemia obiecana", 0.76, 0.99, FilmCategory.DRAMA, true, 2);
        Film batman = new Film("Batman", 0.99, 0.45, FilmCategory.COMEDY, true, 3);
        Film grey = new Film("50 Fades of Gray", 0.99, 0.99, FilmCategory.ACTION, true, 4);
        Film stalin = new Film("Stalin", 0.09, 0.11, FilmCategory.HISTORY, true, 5);
        Film[] filmsToOffer = {dogs, earth, batman, grey, stalin};

        Store advisorRadek = new Store(filmsToOffer);
        Advisor advisor = new Advisor(advisorRadek, 1, 1);
        while (print) {
            for (Film film : filmsToOffer) {
                System.out.println(film.toPrint());
            }

            System.out.println("\n\u001B[31mPolecany film: " + advisor.findBestFromBoth().toPrint());

            System.out.println("\n\u001B[07mPodaj film, który wypożyczasz\u001B[0m");
            int filmToRent = scanner.nextInt();

            filmsToOffer[filmToRent - 1].setIspresent(false);
            Film yourFilm = filmsToOffer[filmToRent - 1];

            System.out.println("\u001B[37mWypożyczyłeś: " + yourFilm.toPrint());
            System.out.println("Chcesz oddac? (t/n)");
            String yourchoice = scanner.next();

            if (yourchoice.equalsIgnoreCase("t")) {
                yourFilm.setIspresent(true);
                System.out.println("Oceniasz film? (t/n)");
                yourchoice = scanner.next();

                if (yourchoice.equalsIgnoreCase("t")) {
                    System.out.println("podaj ocenę od 0 do 10");
                    double yourVote = scanner.nextDouble();
                    yourFilm.userRanking(yourVote/10);
                }

                for (Film film : filmsToOffer) {
                    System.out.println(film.toPrint());
                }
            }
            System.out.println("Dalej? (t/n)");
            yourchoice = scanner.next();
            if (!yourchoice.equalsIgnoreCase("t")) {
                print = false;
            }
        }
    }
}
