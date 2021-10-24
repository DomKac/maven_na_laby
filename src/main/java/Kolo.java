

public class Kolo extends Figura{

    double promien;

    Kolo(double promien) throws Ujemna
    {
        this.promien = promien;

        if(promien <= 0.0)
        {
            throw new Ujemna();
        }
    }

    @Override
    public double obwod() {

        return 2*promien* Math.PI;
    }

    @Override
    public double pole() {

        return promien * promien * Math.PI;
    }

}
