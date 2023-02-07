/*
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOpener {
    Scanner MR;
    Senior[] tab;
    static int n;
    public FileOpener() throws FileNotFoundException {
        MR = new Scanner(Main.filereader);
        n = MR.nextInt();

        tab = new Senior[n];

        for (int i = 0; i < n; i++) {
            int tokens = Integer.parseInt(tab[i].toString());
            tab.add(new Senior(i, tab[i]));
        }

        MR.close();
    }


}
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;

class FileOpener {
    public static ArrayList<Senior> readDataFromFile(String fileName) {
        ArrayList<Senior> seniors = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            String[] parts = line.split(" ");
            for (int i = 1; i < parts.length; i++) {
                int tokens = Integer.parseInt(parts[i]);
                String id = Integer.toString(i);
                seniors.add(new Senior(id , tokens));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return seniors;
    }

}
