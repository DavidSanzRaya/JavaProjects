package newsRoom;

public enum NewsType {
	FOOTBALL(5, 300),
    BASKETBALL(4, 250),
    TENNIS(4, 150),
    F1(4, 100),
    MOTORCYCLING(3, 100);

    private final int initialScore;
    private final double initialPrice;

    NewsType(int initialScore, double initialPrice) {
        this.initialScore = initialScore;
        this.initialPrice = initialPrice;
    }

    public int getInitialScore() {
        return initialScore;
    }

    public double getInitialPrice() {
        return initialPrice;
    }
}
