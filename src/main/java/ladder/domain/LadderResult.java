package ladder.domain;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LadderResult {
    private final Map<String, String> ladderResult;

    private LadderResult(List<String> results, List<String> names) {
        ladderResult = new LinkedHashMap<>();
        for (int i = 0; i < results.size(); i++) {
            ladderResult.put(names.get(i), results.get(i));
        }

    }

    public static LadderResult of(List<String> results, List<String> names) {
        return new LadderResult(results, names);
    }

    public Map<String, String> getLadderResult() {
        return ladderResult;
    }
}
