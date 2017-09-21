public class ConvTemp {
    public static void main(String[] args) {

        double fahrenheit = 32; //Deklarerer variablen. Fahrenheit som skal konverteres til Celcius

        double celcius = (5.0/9)*(fahrenheit-32); //Deklarerer variablen. Formel for konvertering fra F til C
        System.out.println(fahrenheit + " grader Fahrenheit = " + celcius + " grader Celsius"); //Udprint af resultat
    }
}
