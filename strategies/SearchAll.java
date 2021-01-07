package search.strategies;

import java.util.*;

import search.utilities.*;

public class SearchAll implements SearchStrategy {
    boolean isFind = false;

    public List<String> searchValue(List<String> data, Map<String, List<Integer>> keywords) {
        Scanner sc = new Scanner(System.in);
        SearchingEngine searchingEngine = new SearchingEngine();
        PrintPerson printPerson = new PrintPerson();
        System.out.println("Enter a name or email to search all suitable people.");
        String search = sc.nextLine();
        search = search.replaceAll("(^\\s+)|(\\s+$)", "");
        search = search.replaceAll("\\s+", " ");
        search = ".*(?=.*" + search.replaceAll("\\s", ").*(?=.*") + ").*";
        try {
            if (keywords.containsKey(search)) {
                isFind = true;
                printPerson.printPerson(data, keywords, isFind, search);
            } else {
                searchingEngine.addKeywordList(data, keywords, isFind, search);
                printPerson.printPerson(data, keywords, searchingEngine.getIsFind(isFind), search);
            }
        } catch (NullPointerException | ClassCastException e) {
        }
        return data;
    }
}
