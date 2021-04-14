public class NestedIterator implements Iterator < Integer > {

    List < Integer > res = new ArrayList();
    int index = 0;
    public NestedIterator(List < NestedInteger > nestedList) {
        iterate(res, nestedList);
    }

    private void iterate(List < Integer > list, List < NestedInteger > nestedList) {
        for (NestedInteger nestedInteger: nestedList) {
            if (nestedInteger.isInteger()) {
                list.add(nestedInteger.getInteger());
            } else {
                iterate(list, nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        int currentIndex = index;
        index++;
        return res.get(currentIndex);
    }

    @Override
    public boolean hasNext() {
        return index < res.size();
    }
}
