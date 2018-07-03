package aem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class MainDataFile {


    static ArrayList<Currency> currencyList = new ArrayList<>();
    static String filePath;
    static String headers;

    public static void main(String[] args) {

    }

    public String readFile() {
        String path = "/home/smakubaku/Desktop/temp/CHF.txt";

        try {
            FileReader fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "null";
    }


//    public static void main(String args[]) throws IOException {


//        BufferedReader bufferedReader = new BufferedReader(fileReader);

//        Array<String> fileContent = new ArrayList<>();

//        try {
//            String textLine = bufferedReader.readLine();
//            do {
//                System.out.println(textLine);
//                textLine = bufferedReader.readLine();
//            } while (textLine != null);
//        } finally {
//            bufferedReader.close();
//        }
//    }


}


