import java.util.Scanner;

public class ArealCirkel {
    //Dette program beregner arealet af en cirkel

        public static void main(String[] args) {

            System.out.println("Enter a number for Radius:   ");

            //de næste tre linjer "scanner" for brugerens indtastning
            Scanner input = new Scanner(System.in); //Brugeren kan indtaste sit tal
            double r = 0; //radius er 0 eller større
            r = input.nextDouble(); //Brugeren kan indputte sin radius

            System.out.println("Radius er " + r); //udprint af "Raduis er" og efterfølgende brugerens radius

            double areal = 0; //arealet er 0 eller større
            areal = r*r*3.14159; //udregning af cirklens areal
            System.out.println("Arealet af cirklen er: "+ areal); //udprint af tekst og areal
        }
    }
