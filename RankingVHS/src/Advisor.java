public class Advisor {
    private Store store;
    private double imdbWage;
    private double rankingWage;

    public Advisor(Store store,
                   double imdbWage,
                   double rankingWage
    ) {
        this.store = store;
        this.imdbWage = imdbWage;
        this.rankingWage = rankingWage;
    }

    Film findBestFromBoth() {
        Film bestFilmBoth= store.getFilms()[0];
        for (Film film : store.getFilms()) {
            double
            double rankingAverage = (film.getRanking() + film.getRankingImdb()) / 2;

            return film;
        }
        return bestFilmBoth;
    }

}

