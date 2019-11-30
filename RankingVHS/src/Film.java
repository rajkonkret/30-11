class Film {
    private String title;
    private double ranking;
    private double imdb;
    private FilmCategory filmCategory;

    Film(
            String title,
            double ranking,
            double imdb,
            FilmCategory filmCategory
    ) {
        this.title = title;
        this.ranking = ranking;
        this.imdb = imdb;
        this.filmCategory = filmCategory;
    }

    double getRanking() {
        return ranking;
    }

    double getRankingImdb() {
        return imdb;
    }


    String toPrint() {
        return title + " " + (int) ((ranking + imdb) / 2 * 100) + " pkt " + filmCategory;
    }
}
