import java.util.Scanner;
/* Dette program omdanner tid i sekunder til hele minutter og sekunder*/
public class SecToMin {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //bruger kan indtaste sekunder
        System.out.println("Antal sekunder: "); //udprinter "antal sekunder"
        int seconds = input.nextInt(); //input af sekunder

        int minutes = seconds / 60; //laver sekunder om til minutter
        int remainingSeconds = seconds % 60; //finder "rest"-sekunderne
        System.out.println(seconds + " sekunder er " + minutes + " minutter og " + remainingSeconds + " sekunder."); //udprinter og udregner tekst og sekunder til minutter og "rest"-sekunder
    }
}
