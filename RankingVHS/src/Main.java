public class Main {
    public static void main(String[] args) {

        Film dogs = new Film("Psy", 0.2, 0.5);
        Film earth = new Film("Ziemia obiecana", 0.76, 0.99);
        Film batman = new Film("Batman", 0.99, 0.45);
        Film[] filmsToOffer = {dogs, earth, batman};

        Store advisorRadek = new Store(filmsToOffer);
        System.out.println(advisorRadek.findBestFilm().toPrint());
    }
}
