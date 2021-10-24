

public class Main {

    public static void main(String args[]) {

        String jakie_figury = args[0];

        int dana = 1;

        Figura[] tablica_figur = new Figura[jakie_figury.length()];

        for (int i = 0; i < jakie_figury.length(); i++) {

            if (jakie_figury.charAt(i) == 'o') {

                if(args.length < dana + 1)
                {
                    System.out.println("Figura " + (i+1) + ": Nie podano odpowiedniej ilosci danych do pola i obwodu!!!\n");
                    break;
                }

                try {
                    Kolo kolo = new Kolo(Double.parseDouble(args[dana]));
                    tablica_figur[i] = kolo;
                }
                catch (NumberFormatException ex) {
                    System.out.println("Figura " + (i+1) + ": " + args[dana] + " - nie prawidlowa dana! \n");
                }
                catch(Ujemna ex)
                {
                    System.out.println("Figura " + (i+1) + ": " + args[dana] + " - ujemny promien \n");
                }
                finally
                {
                    dana++;
                }
            }

            else if (jakie_figury.charAt(i) == 'p') {

                if(args.length < dana + 1)
                {
                    System.out.println("Figura " + (i+1) + ": Nie podano odpowiedniej ilosci danych do pola i obwodu!!!\n");
                    break;
                }

                try {
                    Pieciokat pieciokat = new Pieciokat(Double.parseDouble(args[dana]));
                    tablica_figur[i] = pieciokat;
                }
                catch (NumberFormatException ex) {
                    System.out.println("Figura " + (i+1) + ": " + args[dana] + " - nie prawidlowa dana! \n");
                }
                catch(Ujemna ex)
                {
                    System.out.println("Figura " + (i+1) + ": " + args[dana] + " - ujemny bok! \n");
                }
                finally
                {
                    dana++;
                }
            }

            else if (jakie_figury.charAt(i) == 's') {

                if(args.length < dana + 1)
                {
                    System.out.println("Figura " + (i+1) + ": Nie podano odpowiedniej ilosci danych do pola i obwodu!!!\n");
                    break;
                }

                try {
                    Szesciokat szesciokat = new Szesciokat(Double.parseDouble(args[dana]));
                    tablica_figur[i] = szesciokat;
                }
                catch (NumberFormatException ex) {
                    System.out.println("Figura " + (i+1) + ": " + args[dana] + " - nie prawidlowa dana! \n");
                }
                catch(Ujemna ex)
                {
                    System.out.println("Figura " + (i+1) + ": " + args[dana] + " - ujemny bok! \n");
                }
                finally
                {
                    dana++;
                }
            }

            else if(jakie_figury.charAt(i) == 'c'){

                double bok1,bok2,bok3,bok4, kat;

                if(args.length < dana + 5)
                {
                    System.out.println("Figura " + (i+1) + ": Nie podano odpowiedniej ilosci danych do pola i obwodu!!!\n");
                    break;
                }

                try{
                    bok1 = Double.parseDouble(args[dana]);
                    bok2 = Double.parseDouble(args[dana+1]);
                    bok3 = Double.parseDouble(args[dana+2]);
                    bok4 = Double.parseDouble(args[dana+3]);
                    kat = Double.parseDouble(args[dana+4]);

                    if(bok1 == bok2 && bok2 == bok3 && bok3 == bok4 && kat == 90.0)
                    {
                        Kwadrat kwadrat = new Kwadrat(bok1);
                        tablica_figur[i] = kwadrat;
                    }
                    else if(bok1 == bok2 && bok2 == bok3 && bok3 == bok4)
                    {
                        Romb romb = new Romb(bok1,kat);
                        tablica_figur[i] = romb;
                    }
                    else if(kat == 90 && ((bok1 == bok2 && bok3 == bok4 && bok1 != bok3) || (bok1 == bok4 && bok2 == bok3 && bok1 != bok2) || (bok1==bok3 && bok2==bok4 && bok1 != bok2)))
                    {
                        if(bok1 == bok2){
                            bok2 = bok3;
                        }

                        Prostokat prostokat = new Prostokat(bok1, bok2);
                        tablica_figur[i] = prostokat;
                    }
                    else
                    {
                        System.out.println("Figura " + (i+1) + ": z podanych zmiennych:" + bok1 + ", " + bok2 + ", " + bok3 + ", " + bok4 + ", " + kat + ", " + " nie utworzymy ani kwaratu ani rombu ani prostokata\n");
                    }


                }
                catch (NumberFormatException ex)
                {
                    System.out.println("Figura " + (i+1) +": przynajmniej jedna dana jest niepoprawna\n");
                }
                catch (Ujemna ex){

                    System.out.println("Figura " + (i+1) +": przynajmniej jedna dana jest niepoprawna\n");
                }
                finally
                {
                    dana = dana + 5;
                }
            }

            else{
                System.out.println("Nie rozpatrujemy figury o skrocie: " + jakie_figury.charAt(i) + "\n");
            }

        }


        for (int i = 0; i < jakie_figury.length(); i++) {

            if (tablica_figur[i] != null) {
                System.out.println("Figura "+ (i+1) + ":  Pole = " + tablica_figur[i].pole() + "  Obwod = " + tablica_figur[i].obwod() + "\n");
            }
        }
    }


}