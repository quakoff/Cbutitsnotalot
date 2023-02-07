import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static File filereader;
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Senior> seniors50 = FileOpener.readDataFromFile("datain\\datain_50.txt");

        RandomCall.polacz(seniors50);

        System.out.println("Liczba połączeń: " + RandomCall.getIloscPolaczen());
        System.out.println("Connections: " + RandomCall.getPolaczenia());
        ArrayList<String> connections = RandomCall.getPolaczenia();

       try {
            File file = new File("dataout\\dataout_50Rand.txt");
            if (file.exists()) {
                file.delete();
            }
            FileWriter fileWriter = new FileWriter("dataout\\dataout_50rand.txt");
            fileWriter.write( RandomCall.getIloscPolaczen() + "\n");
            for(String ine : connections) {
                fileWriter.write(ine + " ");
            }

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku lub usuwania pliku");
            e.printStackTrace();
        }
//--------------------------------------------------------------------------------
        ArrayList<Senior> seniors100 = FileOpener.readDataFromFile("datain\\datain_100.txt");

        RandomCall.polacz(seniors100);

        System.out.println("Total portal revenue: " + RandomCall.getIloscPolaczen());
        System.out.println("Connections: " + RandomCall.getPolaczenia());

        try {
            File file = new File("dataout\\dataout_100Rand.txt");
            if (file.exists()) {
                file.delete();
            }
            FileWriter fileWriter = new FileWriter("dataout\\dataout_100rand.txt");
            fileWriter.write( RandomCall.getIloscPolaczen() + "\n");
            for(String ine : connections) {
                fileWriter.write(ine + " ");
            }

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku lub usuwania pliku");
            e.printStackTrace();
        }
//--------------------------------------------------------------------------------
        ArrayList<Senior> seniors200 = FileOpener.readDataFromFile("datain\\datain_200.txt");

        RandomCall.polacz(seniors200);

        System.out.println("Total portal revenue: " + RandomCall.getIloscPolaczen());
        System.out.println("Connections: " + RandomCall.getPolaczenia());

        try {
            File file = new File("dataout\\dataout_200Rand.txt");
            if (file.exists()) {
                file.delete();
            }
            FileWriter fileWriter = new FileWriter("dataout\\dataout_200rand.txt");
            fileWriter.write( RandomCall.getIloscPolaczen() + "\n");
            for(String ine : connections) {
                fileWriter.write(ine + " ");
            }

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku lub usuwania pliku");
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------------");
        //--------------------------------------------------------------------------------
        //-----------------------------HEAP--------------------------------------
        //--------------------------------------------------------------------------------

        ArrayList<Senior> seniors50b = FileOpener.readDataFromFile("datain\\datain_50.txt");
        SortedCall sortedCall = new SortedCall(seniors50b);
        sortedCall.polaczheap(seniors50b);
        ArrayList<String> polaczenia = sortedCall.getPolaczenia();
        System.out.println("Total portal revenue: " + sortedCall.getIloscPolaczen());
        System.out.println("Connections: ");
        for (String polaczenie : polaczenia) {
            System.out.print(polaczenie);
        }

        System.out.println();


        ArrayList<Senior> seniors100b = FileOpener.readDataFromFile("datain\\datain_100.txt");
        SortedCall sortedCall2 = new SortedCall(seniors100b);
        sortedCall2.polaczheap(seniors100b);
        ArrayList<String> polaczenia2 = sortedCall.getPolaczenia();
        System.out.println("Total portal revenue: " + sortedCall2.getIloscPolaczen());
        System.out.println("Connections: " + sortedCall.getPolaczenia());
        for (String polaczenie : polaczenia2) {
            System.out.print(polaczenie);
        }

        System.out.println();

        ArrayList<Senior> seniors200b = FileOpener.readDataFromFile("datain\\datain_200.txt");
        SortedCall sortedCall3 = new SortedCall(seniors200b);
        sortedCall3.polaczheap(seniors200b);
        ArrayList<String> polaczenia3 = sortedCall.getPolaczenia();
        System.out.println("Total portal revenue: " + sortedCall3.getIloscPolaczen());
        System.out.println("Connections: " + sortedCall.getPolaczenia());
        for (String polaczenie : polaczenia3) {
            System.out.print(polaczenie);
        }
        System.out.println();
    }
}