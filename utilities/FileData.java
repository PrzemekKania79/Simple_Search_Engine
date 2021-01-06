package search.utilities;

import search.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileData extends Menu {

    public List<String> readFile(List<String> data, String[] args) {
        try {
            // File file = new File(args[1]);
            File file = new File("C:\\b\\names.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                data.add(fileScanner.nextLine());
            }
            fileScanner.close();
            //  file.delete();
        } catch (FileNotFoundException e) {
        }
        return data;
    }
}
