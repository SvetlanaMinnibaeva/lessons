package lesson6Kaz;

public class Parallelogramm {
    private double ab;
    private double bc;
    private double cd;
    private double ad;
    private double angleA;


    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    public double getBc() {
        return bc;
    }

    public void setBc(double bc) {
        this.bc = bc;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getAd() {
        return ad;
    }

    public void setAd(double ad) {
        this.ad = ad;
    }

    public double getAngleA() {
        return angleA;
    }

    public void setAngleA(double angleA) {
        this.angleA = angleA;
    }

    public double getPerimeter() {
        if (this.ab <= 0 || this.bc <= 0)
            return -1;
        return 2 * (this.ab + this.bc);
    }

    public double getArea() {
        if (this.ab <= 0 || this.bc <= 0 || this.cd <= 0 || this.ad <= 0 || this.angleA <= 0)
            return -1;
        return this.ab * this.ad * Math.sin(Math.toRadians(this.angleA));
    }

    public static boolean checkParallelogramm(double ab, double bc, double cd, double ad) {
        return ab == cd
                && bc == ad;
    }
}

