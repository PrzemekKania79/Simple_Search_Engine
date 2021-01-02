package search;

import java.util.List;
import java.util.Map;

public class ContextSelection {
    private SearchStrategy search;

    public void setSearch(SearchStrategy search) {
        this.search = search;
    }

    public List<String> searchValue(List<String> data, Map<String, List<Integer>> keywords) {
        this.search.searchValue(data, keywords);
        return data;
    }

}
