class Film {
    private String title;
    private double ranking;
    private double imdb;

    Film(String title,
         double ranking,
         double imdb
    ) {
        this.title = title;
        this.ranking = ranking;
        this.imdb = imdb;
    }

    double getRanking() {
        return ranking;
    }

    double getRankingImdb() {
        return imdb;
    }


    String toPrint() {
        return title + " " + (int) (ranking * 100) + " pkt";
    }
}
