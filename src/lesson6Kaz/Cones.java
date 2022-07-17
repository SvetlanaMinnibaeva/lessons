package lesson6Kaz;

public class Cones {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double coneVolume() {
        if(this.radius <= 0 || this.height <= 0)
            return -1;
        return (Math.PI * this.height * this.radius * this.radius) / 3;
    }

    public double totalSurfaceArea() {
        if(this.radius <= 0 || this.height <= 0)
            return -1;
        double coneGeneratrixLength = Math.sqrt(this.radius * this.radius + this.height * this.height);
        return Math.PI * this.radius * coneGeneratrixLength
                + Math.PI * this.radius * this.radius;
    }
}
