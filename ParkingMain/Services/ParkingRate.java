package ParkingMain.Services;

public class ParkingRate {
    private int one=4;
    private int two=3;
    private int rest=2;

    public ParkingRate(int one, int two, int rest) {
        this.one = one;
        this.two = two;
        this.rest = rest;
    }

    public int getOne() {
        return one;
    }
    public int getTwo() {
        return two;
    }
    public int getRest() {
        return rest;
    }
}
