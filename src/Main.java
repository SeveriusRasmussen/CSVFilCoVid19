import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        // load covid
        ArrayList<Covid19Data> covid19Datas = fh.loadAllCovid19Data();

        // display covid information
        for (Covid19Data covid19Data : covid19Datas) {
            System.out.println(covid19Data);
        }
    }
}