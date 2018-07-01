package Ex_TryCatch;

public class MainTryCatch {

    private static int[] tab = new int[10];

    public static void main(String[] args) {
        fillTable(4);
        printTable();
    }

    private static void fillTable(int param) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = param + i;
        }
    }

    private static void printTable() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
