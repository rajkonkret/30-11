class Film {
    private String title;
    private double ranking;
    private double imdb;
    private FilmCategory filmCategory;
    private boolean ispresent;
    private int id;
    private double userRanking;

    Film(
            String title,
            double ranking,
            double imdb,
            FilmCategory filmCategory,
            boolean ispresent,
            int id
    ) {
        this.title = title;
        this.ranking = ranking;
        this.imdb = imdb;
        this.filmCategory = filmCategory;
        this.ispresent = ispresent;
        this.id = id;
    }

    double getRanking() {
        return ranking;
    }

    double getRankingImdb() {
        return imdb;
    }

    FilmCategory getFilmCategory() {
        return filmCategory;
    }

    double getUserRanking() {
        return userRanking;
    }

    String toPrint() {
        return id + ") " + title + " " + (int)((ranking + imdb + userRanking) / 3 * 100) + " pkt " + filmCategory + " " + ispresent;
    }

    public void setIspresent(boolean ispresent) {

        this.ispresent = ispresent;
    }

    public void userRanking(double vote) {
        userRanking = vote;

    }
}
