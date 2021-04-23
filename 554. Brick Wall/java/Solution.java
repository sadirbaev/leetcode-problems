class Solution {
  public int leastBricks(List < List < Integer >> wall) {

    Map < Integer,
    Integer > map = new HashMap < >();

    for (List < Integer > row: wall) {
      int sum = 0;
      int index = 0;
      for (Integer brick: row) {
        if (index + 1 < row.size()) {
          sum += brick;
          map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        index++;
      }
    }

    int max = 0;
    for (Integer val: map.values()) {
      max = Math.max(max, val);
    }
    return wall.size() - max;
  }
}
