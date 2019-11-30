public class Main {
    public static void main(String[] args) {

        Film dogs = new Film("Psy", 0.2);
        Film[] filmsToOffer = {dogs};

        Advisor advisorRadek = new Advisor(filmsToOffer);
        System.out.println(advisorRadek.findBestFilm().toPrint());
    }
}
