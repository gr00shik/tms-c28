package tms.oop3;

public enum Prof {

    DIRECTOR(2, 2000),
    WORKER(1, 1000);

    private int koef;
    private int extra;

    Prof(int koef, int extra) {
        this.koef = koef;
        this.extra = extra;
    }

    public int getKoef() {
        return koef;
    }

    public int getExtra() {
        return extra;
    }
}
