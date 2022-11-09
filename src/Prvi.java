import jdk.swing.interop.SwingInterOpUtils;

public class Prvi {
    public static void main(String[] args) {
        int[] niz= {12, 4, 5, 2,5};

        //ispis bez petlje
        System.out.println("ispis clanova niza bez petlje: ");
        System.out.println(niz[0]);
        System.out.println(niz[1]);
        System.out.println(niz[2]);
        System.out.println(niz[3]);
        System.out.println(niz[4]);


        //ispis sa while
        System.out.println("ispis clanova niza sa WHILE: ");
       int i=0;
        while (i<niz.length)
        {
            System.out.println(niz[i]);
            i++;
        }

        //najveci clan
        System.out.println("najveci clan : ");
        int max=niz[0];
        for (int j = 1; j < niz.length; j++) {
            if (niz[j] > max)
            {
                max = niz[j];
            }
            //else {
              // System.out.println("i dalje trazimo najveci broj, a trenutni maximum je " + max);
            //}

        }
        System.out.println("maximum je " + max);




        //avg i suma
        double suma=0;
        double avg=1;
        for (int k = 0; k < niz.length; k++) {
            suma=suma +niz[k];
             avg=suma/ niz.length;

        }
        System.out.println("suma je " + suma);
        System.out.println("srednja vrednost je " + avg);


    }
}
