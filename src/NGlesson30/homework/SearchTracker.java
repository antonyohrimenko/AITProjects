package NGlesson30.homework;

import java.util.HashMap;

public class SearchTracker {
    private static final int MAX_COUNT = 100; // без магичесих чисел =)
    private HashMap<String, Integer> searchCounts;

    public SearchTracker() {
        this.searchCounts = new HashMap<>();
    }

    // Метод для добавления нового запроса и возврата его текущего количества
    public int addSearchQuery(String query) {
        if (searchCounts.containsKey(query)) {
            int currentCount = searchCounts.get(query);
            if (currentCount < MAX_COUNT) {
                searchCounts.put(query, currentCount + 1);
            }
        } else {
            searchCounts.put(query, 1);
        }
        return searchCounts.get(query);
    }

    // Метод для получения текущего количества запросов
    public int getSearchCount(String query) {
        return searchCounts.getOrDefault(query, 0);
    }
}
