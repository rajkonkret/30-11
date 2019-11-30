public enum Sex {
    MALE("a"), FEMALE("b");
    private String nice;

    Sex(String nice) {
        this.nice=nice;
    }

    public String getNice() {
        return nice;
    }
}
