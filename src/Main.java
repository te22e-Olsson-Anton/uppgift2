import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        /*String[] leksaker = {"Lego", "Hotwheels", "Gosedjur", "Robot", "Docka"};

        String[] namn = {"Jonas", "Martin", "William", "Harry", "Walter"};

        int[] nummer = {1, 7, 3, 5, 10,};

        for(int i = 0; i < leksaker.length; i++)
        {
            System.out.println(namn[i] + " ger " + leksaker[i] + " betyget " + nummer[i]);
        }*/

        boolean loop = true;

        ArrayList<String> cities = new ArrayList<>();

        Scanner tangentbord = new Scanner(System.in);

        while (loop) {
            System.out.println("Skriv en stad (eller 'exit' för att avsluta):");
            String input = tangentbord.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                loop = false;
            } else {
                cities.add(input);
                System.out.println(input + " har lagts till i listan.");
            }
        }

        for (String city : cities) {
            System.out.println(city);
        }



    }



}