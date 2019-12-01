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
        double rankingAverage = ranking(bestFilmBoth);

        for (Film film : store.getFilms()) {
            double rankingAverageFilm =ranking(film);

            if (rankingAverageFilm > rankingAverage) {
                bestFilmBoth = film;
                rankingAverage = rankingAverageFilm;
            }
        }
        return bestFilmBoth;
    }

    Film findBestFromBoth(FilmCategory filmCategory) {
        Film bestFilmBoth = store.getFilms()[0];
        double rankingAverage = ranking(bestFilmBoth);

        for (Film film : store.getFilms()) {

            if (film.getFilmCategory().equals(filmCategory)) {
                double rankingAverageFilm = ranking(film);

                if (rankingAverageFilm > rankingAverage) {
                    rankingAverage = rankingAverageFilm;
                    bestFilmBoth = film;
                }
            }
        }
        return bestFilmBoth;
    }

    private double ranking(Film film) {
        return (film.getRankingImdb() * imdbWage + film.getRanking() * rankingWage) / 2;
    }
}

