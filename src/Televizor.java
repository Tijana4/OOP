public class Televizor {

    int jacinaTona=0; //iskljucen
    boolean ukljucen=false; //ugasen

    //konstruktori
    public Televizor(int jacinaTona,boolean ukljucen) {
        this.jacinaTona=jacinaTona;
        this.ukljucen = ukljucen;
    }

    public Televizor() {
    }

    public Televizor(int jacinaTona) {

        this.jacinaTona = jacinaTona;
    }

    public Televizor(boolean ukljucen) {

        this.ukljucen = ukljucen;
    }

    //metode
    public void pojacajTon()
    {
        if (jacinaTona<20)
        {
            jacinaTona=jacinaTona+1;
            System.out.println("trenutna jacina je :" + jacinaTona);
        }
        else {
            System.out.println("ne moze da se pojaca vise od 20");
        }
    }

    public void smanjiTon()
    {
        if (jacinaTona>=1)
        {
            jacinaTona=jacinaTona-1;
            System.out.println("trenutna jacina je :" + jacinaTona);
        }
        else {

            System.out.println("jacina je 0, ne moze vise da se smanji");
        }
    }

    public void ukljuci()
    {
        ukljucen=true;

    }

    public void iskljuci()
    {
        ukljucen=false;
    }

    public boolean daLiJeUkljucen()
    {
        return ukljucen;
    }

    public int vratiJacinuTona()
    {
        return jacinaTona;
    }

    @Override
    public String toString() {
        return "Televizor{" +
                "jacinaTona=" + jacinaTona +
                ", ukljucen=" + ukljucen +
                '}';
    }
}
