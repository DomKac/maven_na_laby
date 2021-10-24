

public class Pieciokat extends Figura{

    double bok;

    Pieciokat(double bok) throws Ujemna
    {
        this.bok = bok;

        if(bok <= 0.0)
        {
            throw new Ujemna();
        }
    }


    @Override
    public double obwod() {

        return 5 * bok;
    }

    @Override
    public double pole() {

        return 1.72048 * bok * bok;
    }

}
