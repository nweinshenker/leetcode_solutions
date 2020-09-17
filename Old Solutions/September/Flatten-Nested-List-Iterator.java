/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

public class NestedIterator implements Iterator<Integer> {

    private List<NestedInteger> list;
    private Queue<Integer> queue;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.list = nestedList;
        queue = new LinkedList<Integer>();
        createFlattenList(this.list);
    }

    public void createFlattenList(List<NestedInteger> nestedList) {
        if (nestedList.size() == 0) {
            return;
        }

        for (NestedInteger next : nestedList) {
            if (next.isInteger()) {
                queue.add(next.getInteger());
            } else {
                createFlattenList(next.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return queue.poll();
    }

    @Override
    public boolean hasNext() {
        if (queue.size() == 0)  return false;

        return true;

    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 *