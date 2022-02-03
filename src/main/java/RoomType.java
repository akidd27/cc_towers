public enum RoomType {

    SINGLE(1, 25.00),
    DOUBLE(2, 50.00),
    TRIPLE(3, 75.00),
    FAMILY(4, 100.00),
    CONFERENCE(50, 200.00);

    private final int value;
    private final double nightlyRate;

    RoomType(int value, double nightlyRate) {
        this.value = value;
        this.nightlyRate = nightlyRate;
    }

    public int getValue() {
        return this.value;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }
}
