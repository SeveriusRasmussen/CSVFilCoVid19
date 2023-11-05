import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppeCSV.csv");

    public ArrayList<Covid19Data> loadAllCovid19Data() {
        ArrayList<Covid19Data> covid19Datas = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            sc.nextLine();  // Skip første linje

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data covid19Data = null; // Captial bogstav betøde at den er klasse, intet capital bogstav er et objekt.
        while (sc.hasNext()) {
            String line = sc.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            covid19Data = new Covid19Data(
                    attributes[0],
                    attributes[1],
                    Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[4]),
                    Integer.parseInt(attributes[5])
            );

            covid19Datas.add(covid19Data);

        }
        sc.close();
        return covid19Datas;
    }

}