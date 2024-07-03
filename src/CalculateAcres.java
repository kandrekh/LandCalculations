public class CalculateAcres {
    private double squareFeet;

    public CalculateAcres() {
    }
    public CalculateAcres(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public double acresOfLand() {
        // one acre of land is 43,560 sqft
        final double SQFT = 43560;
        return squareFeet / SQFT;
    }
}
