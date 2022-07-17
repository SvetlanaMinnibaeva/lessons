package lesson6Kaz;

public class Oval {
    private double bigSemiaxis;
    private double smallSemiaxis;

    public double getBigSemiaxis() {
        return bigSemiaxis;
    }

    public void setBigSemiaxis(double bigSemiaxis) {
        this.bigSemiaxis = bigSemiaxis;
    }

    public double getSmallSemiaxis() {
        return smallSemiaxis;
    }

    public void setSmallSemiaxis(double smallSemiaxis) {
        this.smallSemiaxis = smallSemiaxis;
    }

    public double getAreaOval() {
        if(this.smallSemiaxis <= 0 || this.bigSemiaxis <= 0)
            return -1;
        return Math.PI * bigSemiaxis * smallSemiaxis;
    }
}
