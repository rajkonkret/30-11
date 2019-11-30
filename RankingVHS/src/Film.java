class Film {
    private String title;
    private double ranking;

    Film(String title,
         double ranking
    ) {
        this.title = title;
        this.ranking = ranking;
    }

    double getRanking() {
        return ranking;
    }

    String toPrint() {
        return title + " " + (int) (ranking * 100) + " pkt";
    }
}
