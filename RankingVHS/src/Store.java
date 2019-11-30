class Store {
    private Film[] store;

    Store(Film[] films) {
        this.store = films;
    }

    Film findBestFilm() {

        Film bestFilm = store[0];
        for (Film films : store) {
            if (films.getRanking() > bestFilm.getRanking()) {
                bestFilm = films;
            }

        }
        return bestFilm;
    }

    Film[] getFilms() {
        return store;
    }

}
