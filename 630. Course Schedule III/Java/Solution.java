class Solution {
  public int scheduleCourse(int[][] courses) {

    Arrays.sort(courses, (a, b) -> a[1] - b[1]);
    PriorityQueue < Integer > selectedDurations = new PriorityQueue < Integer > (Collections.reverseOrder());
    int totalDuration = 0;
    for (int[] course: courses) {
      if (totalDuration + course[0] <= course[1]) {
        totalDuration += course[0];
        selectedDurations.add(course[0]);
      } else {
        if (!selectedDurations.isEmpty() && selectedDurations.peek() > course[0]) {
          totalDuration += (course[0] - selectedDurations.peek());
          selectedDurations.poll();
          selectedDurations.add(course[0]);
        }
      }
    }
    return selectedDurations.size();
  }
}