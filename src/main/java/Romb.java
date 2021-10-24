

public class Romb extends Czworokat{

    Romb (double bok1, double kat) throws Ujemna
    {
        super(bok1, bok1, bok1, bok1, kat);

        if(bok1 <= 0.0 && ((kat <= 0.0) || (kat >= 180.0)))
        {
            throw new Ujemna();
        }
    }


    @Override
    public double obwod() {

        return 4 * bok1;
    }

    @Override
    public double pole() {

        return bok1 * bok1 * Math.sin(kat * Math.PI / 180);
    }
}
