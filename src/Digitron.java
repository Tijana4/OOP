import java.util.Scanner;
public class Digitron {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("unesi prvi broj");
        int a=sc.nextInt();
        System.out.println("unesi drugi broj");
        int b=sc.nextInt();
        System.out.println("unesi operaciju");
        String op=sc.next();
        switch (op)
        {
            case "+": {
                int suma = a + b;
                System.out.println("suma je : " + suma);
            }break;
            case "-": {
                int razlika = a - b;
                System.out.println("razlika je : " + razlika);
            }break;
            case "*": {
                int proizvod = a * b;
                System.out.println("proizvod je : " + proizvod);
            }break;
            case "/": {
                if (b==0)
                {
                    System.out.println("drugi broj ne sme biti 0");
                }
                else {
                    int kolicnik = a / b;
                    System.out.println("kolicnik je : " + kolicnik);
                }
            }break;
            default:
            {
                System.out.println("uneli ste pogresnu op");
            }
        }



    }
}
