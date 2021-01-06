package search.strategies;

import java.util.List;
import java.util.Map;

public interface SearchStrategy {
    public List<String> searchValue(List<String> data, Map<String, List<Integer>> keywords);
}
