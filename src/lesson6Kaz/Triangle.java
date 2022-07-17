package lesson6Kaz;

public class Triangle {
    private int ab;
    private int bc;
    private int ac;

    public void setAB(int ab) {
        this.ab = ab;
    }

    public void setBC(int bc) {
        this.bc = bc;
    }

    public void setAC(int ac) {
        this.ac = ac;
    }

    public int getAB() {
        return this.ab;
    }

    public int getBC() {
        return this.bc;
    }

    public int getAC() {
        return this.ac;
    }


    public double perimeterTriangle() {
        return getPerimeterTriangle(this.ab, this.bc, this.ac);
    }

    public static double getPerimeterTriangle(double ab, double bc, double ac) {
        if (ab <= 0 || bc <= 0 || ac <= 0)
            return -1;
        return ab + bc + ac;
    }


    public double areaTriangle() {
        return getAreaTriangle(this.ab, this.bc, this.ac);
    }

    public static double getAreaTriangle(double ab, double bc, double ac) {
        if (ab <= 0 || bc <= 0 || ac <= 0)
            return -1;
        return Math.sqrt(Triangle.getPerimeterTriangle(ab, bc, ac) / 2
                * (Triangle.getPerimeterTriangle(ab, bc, ac) / 2 - ab)
                * (Triangle.getPerimeterTriangle(ab, bc, ac) / 2 - bc)
                * (Triangle.getPerimeterTriangle(ab, bc, ac) / 2 - ac));
    }

    public boolean checkTriangle() {
        return getCheckTriangle(this.ab, this.bc, this.ac);
    }

    public static boolean getCheckTriangle(int ab, int bc, int ac) {
        return ab + bc >= ac
                && bc + ac >= ab
                && ac + ab >= bc;
    }
}

