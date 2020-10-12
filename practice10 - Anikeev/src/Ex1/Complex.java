package Ex1;

public class Complex {
    int realCoeff;
    int imgCoeff;

    public Complex() {
    }

    public Complex(int realCoeff, int imgCoeff) {
        this.realCoeff = realCoeff;
        this.imgCoeff = imgCoeff;
    }

    public int getRealCoeff() {
        return realCoeff;
    }

    public void setRealCoeff(int realCoeff) {
        this.realCoeff = realCoeff;
    }

    public int getImgCoeff() {
        return imgCoeff;
    }

    public void setImgCoeff(int imgCoeff) {
        this.imgCoeff = imgCoeff;
    }

    @Override
    public String toString() {
        return   realCoeff +
                " + (" + imgCoeff +
                ")i";
    }
}
