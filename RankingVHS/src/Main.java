public class Main {
    public static void main(String[] args) {

        Film dogs = new Film("Psy", 0.2, 0.5, FilmCategory.ACTION);
        Film earth = new Film("Ziemia obiecana", 0.76, 0.99, FilmCategory.DRAMA);
        Film batman = new Film("Batman", 0.99, 0.45, FilmCategory.COMEDY);
        Film[] filmsToOffer = {dogs, earth, batman};

        Store advisorRadek = new Store(filmsToOffer);
        Advisor advisor=new Advisor(advisorRadek,1,1);
        System.out.println(advisor.findBestFromBoth().toPrint());

    }
}
