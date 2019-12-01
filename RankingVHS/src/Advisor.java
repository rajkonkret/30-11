public class Advisor {
    private Store store;
    private double imdbWage;
    private double rankingWage;

    public Advisor(
            Store store,
            double imdbWage,
            double rankingWage
    ) {
        this.store = store;
        this.imdbWage = imdbWage;
        this.rankingWage = rankingWage;
    }

    Film findBestFromBoth() {
        Film bestFilmBoth = store.getFilms()[0];
        double rankingAverage = (bestFilmBoth.getRankingImdb() + bestFilmBoth.getRanking()) / 2;
        for (Film film : store.getFilms()) {
            double rankingAverageFilm = (film.getRanking() + film.getRankingImdb()) / 2.0;
            if (rankingAverageFilm > rankingAverage) {
                bestFilmBoth = film;
                rankingAverage = rankingAverageFilm;
            }
        }
        return bestFilmBoth;
    }

    Film findBestFromBoth(FilmCategory filmCategory) {
        Film bestFilmBoth = store.getFilms()[0];

        double rankingAverage = (bestFilmBoth.getRankingImdb() + bestFilmBoth.getRanking()) / 2;

        for (Film film : store.getFilms()) {

            if (film.getFilmCategory().equals(filmCategory)) {

                double rankingAverageFilm = (film.getRanking() + film.getRankingImdb()) / 2.0;

                if (rankingAverageFilm > rankingAverage) {

                    bestFilmBoth = film;
                    rankingAverage = rankingAverageFilm;
                }
            }
        }
        return bestFilmBoth;
    }

}

