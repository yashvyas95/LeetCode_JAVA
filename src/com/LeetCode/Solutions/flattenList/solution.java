
/**
 * public class NestedIterator {
 * private List<Integer> flattened;
 * private int index;
 * <p>
 * public NestedIterator(List<NestedInteger> nestedList) {
 * flattened = new ArrayList<>();
 * index = 0;
 * flattened = flatten(nestedList);
 * }
 * <p>
 * private List<Integer> flatten(List<NestedInteger> nested) {
 * List<Integer> result = new ArrayList<>();
 * for (NestedInteger ni : nested) {
 * if (ni.isInteger()) {
 * result.add(ni.getInteger());
 * } else {
 * result.addAll(flatten(ni.getList()));
 * }
 * }
 * return result;
 * }
 * <p>
 * public int next() {
 * return flattened.get(index++);
 * }
 * <p>
 * public boolean hasNext() {
 * return index < flattened.size();
 * }
 * }
 */