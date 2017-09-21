import java.util.Scanner;

public class ArealCirkel {
    //Dette program beregner arealet af en cirkel

        public static void main(String[] args) {

            System.out.println("Enter a number for Radius:   ");

            //de næste tre linjer "scanner" for brugerens indtastning
            Scanner input = new Scanner(System.in);
            double r = 0;
            r = input.nextDouble();

            System.out.println("Radius er " + r);

            double areal = 0;
            areal = r*r*3.14159;
            System.out.println("Arealet af cirklen er: "+ areal);
        }
    }
