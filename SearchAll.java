package search;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchAll implements SearchStrategy {

    public List<String> searchValue(List<String> data, Map<String, List<Integer>> keywords) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name or email to search all suitable people.");
        boolean isFind = false;
        List<Integer> temp = new ArrayList<>();
        String search = sc.nextLine();
        search = search.replaceAll("(^\\s+)|(\\s+$)", "");
        search = search.replaceAll("\\s+", " ");
        search = "(.*" + search.replaceAll("\\s", ".*)|(.*") + ".*)";
        for (String e : data) {
            if (search.length() == 1) break;
            if (e.toLowerCase().matches(search.toLowerCase())) {
                isFind = true;
                System.out.println(e);
                temp.add(data.indexOf(e));
            }
        }
        if (temp.size() != 0) {
            keywords.put(search, temp);
        }
        if (!isFind) {
            System.out.println("No matching people found.");
        }
        return data;
    }
}
