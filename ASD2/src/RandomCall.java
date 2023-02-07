import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class RandomCall {
  private static int iloscPolaczen;
  private static ArrayList<String> polaczenia;

  public static void polacz(ArrayList<Senior> seniors) {
        polaczenia = new ArrayList<>();
        Random rand = new Random();
        boolean flag = true;
        while (flag) {
            if (getNSZ(seniors) < 1) {
                flag = false;
            } else {
                int senior1Index = rand.nextInt(seniors.size());
                Senior senior1 = seniors.get(senior1Index);
                int tokens1 = senior1.getToken();
                if (tokens1 > 0) {
                    int senior2Index = rand.nextInt(seniors.size());
                    Senior senior2 = seniors.get(senior2Index);
                    int tokens2 = senior2.getToken();
                    if (tokens2 > 0) {
                        senior1.setToken(tokens1 - 1);
                        senior2.setToken(tokens2 - 1);
                        iloscPolaczen++;
                        polaczenia.add(senior1.getId());
                        polaczenia.add(senior2.getId());
                    }
                }
            }
        }
    }

    public static int getNSZ(ArrayList<Senior> seniors) {
        int numSeniorsWithTokens = 0;
        for (Senior senior : seniors) {
            if (senior.getToken() > 0) {
                numSeniorsWithTokens++;
            }
        }
        return numSeniorsWithTokens;
    }

    public static int getIloscPolaczen() {
        return iloscPolaczen;
    }
  public static ArrayList<String> getPolaczenia() {

      ArrayList<String> formattedConnections = new ArrayList<>();

      for (int i = 0; i < polaczenia.size(); i += 2) {

          String connection = polaczenia.get(i) + "," + polaczenia.get(i + 1);

          formattedConnections.add(connection);
      }

      return formattedConnections;
  }
}



