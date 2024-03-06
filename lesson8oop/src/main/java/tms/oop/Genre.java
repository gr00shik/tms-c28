package tms.oop;

public enum Genre {

    COMEDY(12),
    DRAMA(20),
    ACTION(16);

    private int minAge;

    Genre(int minAge) {
        this.minAge = minAge;
    }

    public int getMinAge() {
        return minAge;
    }
}
