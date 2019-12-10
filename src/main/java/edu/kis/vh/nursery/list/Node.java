package edu.kis.vh.nursery.list;
/**
 * Class Node kept in IntLinkedList.
 */
public class Node {
	/**
	 * Value stored in single node
	 */
	public int value;
	/**
	 * prev holds reference to previous list element
	 * next holds reference to next list element
	 */
	public Node prev, next;
	/**
	 * @param i value to assign and hold in node
	 */
	public Node(int i) {
		value = i;
	}
	
}
