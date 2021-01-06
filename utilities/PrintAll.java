package search.utilities;

import search.strategies.*;

import java.util.List;
import java.util.Map;

public class PrintAll implements SearchStrategy {

    @Override
    public List<String> searchValue(List<String> data, Map<String, List<Integer>> keywords) {
        return data;
    }
}
