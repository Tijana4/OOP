public class GlavniTV {

    public static void main(String[] args) {
        Televizor tv = new Televizor();
        System.out.println(tv.vratiJacinuTona());
        System.out.println(tv.daLiJeUkljucen());

        tv.pojacajTon();
        tv.smanjiTon();
        tv.smanjiTon();
        System.out.println(tv.vratiJacinuTona());
        System.out.println(tv.daLiJeUkljucen());
        tv.ukljuci();
        System.out.println(tv.daLiJeUkljucen());
        tv.iskljuci();
        System.out.println(tv.daLiJeUkljucen());

       /* Televizor tv1 = new Televizor(2);
        tv1.pojacajTon();
        tv1.smanjiTon();

        Televizor tv2 = new Televizor(true);
        tv2.pojacajTon();
        tv2.smanjiTon();

        Televizor tv3=new Televizor(20,false);
        tv3.pojacajTon();
        tv3.smanjiTon();
        tv3.ukljuci();
        System.out.println(tv3.daLiJeUkljucen());
*/
        System.out.println(tv.toString());


    }
}
