import java.util.ArrayList;

public class SortedCall {
    private ArrayList<Senior> seniors;
    private ArrayList<String> polaczenia;
    private HeapMax heap;

    private static int iloscPolaczen;

   public SortedCall(ArrayList<Senior> seniors) {
        this.seniors = seniors;
        this.polaczenia = new ArrayList<>();
        this.heap = new HeapMax(seniors.size());
        for (Senior senior : seniors) {
            heap.insert(senior.getToken());
        }
    }

    public void polaczheap(ArrayList<Senior> seniors) {
        iloscPolaczen = 0;
        while (heap.size() > 1) {
            int senior1Tokens = heap.remove();
            int senior2Tokens = heap.remove();
            if (senior1Tokens > 0 && senior2Tokens > 0) {
                int senior1Index = seniors.size() - heap.size() - 1;
                int senior2Index = seniors.size() - heap.size() - 2;
                Senior senior1 = seniors.get(senior1Index);
                Senior senior2 = seniors.get(senior2Index);
                senior1.setToken(senior1Tokens - 1);
                senior2.setToken(senior2Tokens - 1);
                iloscPolaczen++;
                heap.insert(senior1Tokens - 1);
                heap.insert(senior2Tokens - 1);
                polaczenia.add(senior1.getId());
                polaczenia.add(senior2.getId());
            }

        }
    }

    public int getIloscPolaczen() {
        return iloscPolaczen;
    }

    public ArrayList<String> getPolaczenia() {
        ArrayList<String> formattedConnections = new ArrayList<>();

        for (int i = 0; i < polaczenia.size(); i += 2) {
            String connection = polaczenia.get(i) + "," + polaczenia.get(i + 1);
            formattedConnections.add(connection);
        }

        return formattedConnections;
    }
}