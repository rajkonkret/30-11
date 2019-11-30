class Advisor {
    Film[] films;

    Advisor(Film[] fims) {
        this.films = fims;
    }

    Film findBestFilm() {
        Film bestFilm = films[0];

        for (Film film : films) {
            if (bestFilm.getRanking() < film.getRanking()) {
                bestFilm = film;
            }

        }

        return bestFilm;
    }

}
