class Film {
    private String title;
    private double ranking;
    private double imdb;
    private FilmCategory filmCategory;
    private boolean ispresent;

    Film(
            String title,
            double ranking,
            double imdb,
            FilmCategory filmCategory,
            boolean ispresent
    ) {
        this.title = title;
        this.ranking = ranking;
        this.imdb = imdb;
        this.filmCategory = filmCategory;
        this.ispresent = ispresent;
    }

    double getRanking() {
        return ranking;
    }

    double getRankingImdb() {
        return imdb;
    }


    String toPrint() {
        return title + " " + (int) ((ranking + imdb) / 2 * 100) + " pkt " + filmCategory+" "+ispresent;
    }

    public void setIspresent(boolean ispresent) {
        this.ispresent = ispresent;
    }
}
