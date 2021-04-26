class Solution {
  public int maxDistToClosest(int[] seats) {
    boolean isStarted = false;
    int startedIndex = 0;
    Map < Integer, Integer > contEmptySeats = new HashMap < > ();
    for (int i = 0; i < seats.length; i++) {
      if (seats[i] == 0) {
        if (isStarted) {
          contEmptySeats.put(startedIndex, contEmptySeats.get(startedIndex) + 1);
        } else {
          isStarted = true;
          startedIndex = i;
          contEmptySeats.put(startedIndex, 1);
        }
      } else {
        isStarted = false;
      }
    }
    int res = 0;
    for (Map.Entry < Integer, Integer > entry: contEmptySeats.entrySet()) {
      if (entry.getKey() == 0) {
        res = Math.max(res, entry.getValue());
        continue;
      }
      if (entry.getKey() + entry.getValue() == seats.length) {
        res = Math.max(res, entry.getValue());
        continue;
      }
      res = Math.max(res, (int) Math.ceil(1.0 * entry.getValue() / 2));
    }
    return res;
  }
}
