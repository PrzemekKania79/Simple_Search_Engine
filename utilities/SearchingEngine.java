package search.utilities;

import java.util.*;

public class SearchingEngine {
    private Boolean isFind;


    public void addKeywordList(List<String> data, Map<String, List<Integer>> keywords, Boolean isFind, String search) {
        this.isFind = isFind;
        List<Integer> temp = new ArrayList<>();
        for (String e : data) {
            if (search.length() <= 1) break;
            if (e.toLowerCase().matches(search.toLowerCase())) {
                this.isFind = true;
                System.out.println(e);
                temp.add(data.indexOf(e));
            }
        }
        if (temp.size() != 0) {
            keywords.put(search, temp);
        }
    }

    public Boolean getIsFind(Boolean isFind) {
        return this.isFind;
    }
}