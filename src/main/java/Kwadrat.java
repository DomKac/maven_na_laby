

public class Kwadrat extends Czworokat{

    Kwadrat (double bok1) throws Ujemna
    {
        super(bok1, bok1, bok1, bok1, Math.PI /2);

        if(bok1 <= 0.0)
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

        return bok1 * bok1;
    }


}
