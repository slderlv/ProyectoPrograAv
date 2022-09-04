
public class DoublyLinkedListItem {
	private int data;
	private DoublyLinkedListItem prev, next;
	
	public DoublyLinkedListItem(int data) {
		this.data = data;
		prev = null;
		next = null;
	}
	public int getData() {
		return data;
	}
	public DoublyLinkedListItem getPrev() {
		return prev;
	}
	public void setPrev(DoublyLinkedListItem prev) {
		this.prev = prev;
	}
	public DoublyLinkedListItem getNext() {
		return next;
	}
	public void setNext(DoublyLinkedListItem next) {
		this.next = next;
	}
}
