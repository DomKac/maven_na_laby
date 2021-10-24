

public class Prostokat extends Czworokat{


    Prostokat(double bok1, double bok2) throws Ujemna
    {
        super(bok1, bok2, bok1, bok2, Math.PI /2 );

        if(bok1 <= 0.0 && bok2 <= 0.0)
        {
            throw new Ujemna();
        }
    }


    @Override
    public double obwod() {

        return 2 * bok1 + 2 * bok2;
    }

    @Override
    public double pole() {

        return bok1 * bok2;
    }


}
