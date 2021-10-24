

public class Szesciokat extends Figura{

    double bok;

    Szesciokat(double bok) throws Ujemna
    {
        this.bok = bok;

        if(bok<0.0)
        {
            throw new Ujemna();
        }

    }

    @Override
    public double obwod() {

        return 6 * bok;
    }

    @Override
    public double pole() {

        return 1.5 * Math.sqrt(3) * bok * bok;
    }
}
