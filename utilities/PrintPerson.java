package search.utilities;

import java.util.List;

public class PrintPerson {
    public void printPerson(List<String> data) {
        System.out.println("=== List of people ===");
        for (String e : data) {
            System.out.println(e);
        }
    }
}
