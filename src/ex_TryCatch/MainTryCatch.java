package ex_TryCatch;

public class MainTryCatch {

    private static int[] tab = new int[10];

    public static void main(String[] args) {
        fillTable(4);

        try {
            printTable();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }

    private static void fillTable(int param) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = param + i;
        }
    }

    private static void printTable() {
        System.out.println(tab[15]);
    }
}
