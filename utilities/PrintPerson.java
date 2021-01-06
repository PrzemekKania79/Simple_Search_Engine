package search.utilities;

import java.util.List;
import java.util.Map;

public class PrintPerson {

    public void printPerson(List<String> data) {
        System.out.println("=== List of people ===");
        for (String e : data) {
            System.out.println(e);
        }
    }

    public void printPerson(List<String> data, Map<String, List<Integer>> keywords, Boolean isFind, String search) {
        if (isFind) {
            System.out.println("=== List of people ===");

            for (Integer e : keywords.get(search)) {
                System.out.println(data.get(e));
            }
        } else {
            System.out.println("No matching people found.");
        }
    }
}
