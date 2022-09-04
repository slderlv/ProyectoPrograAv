
public class DoublyLinkedList {
	private DoublyLinkedListItem first, last;
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	public void addFirst(DoublyLinkedListItem item) {
		if(first==null) { first = item; last = item; }
		else {
			first.setPrev(item);
			item.setNext(first);
			first = item;
		}
	}
	public void addLast(DoublyLinkedListItem item) {
		if(last==null) { last = item; first = item; }
		else {
			last.setNext(item);
			item.setPrev(last);
			last = item;
		}
	}
	public void addAfter(DoublyLinkedListItem afterItem, DoublyLinkedListItem newItem) {
		DoublyLinkedListItem current = first;
		while(current!=null) {
			if(current==afterItem) {
				if(current.getNext()!=null) {
					current.getNext().setPrev(newItem);
				}
				newItem.setNext(current.getNext());
				newItem.setPrev(current);
				current.setNext(newItem);
			}
			current = current.getNext();
		}
	}
	public void addBefore(DoublyLinkedListItem beforeItem, DoublyLinkedListItem newItem) {
		DoublyLinkedListItem current = first;
		while(current!=null) {
			if(current==beforeItem) {
				if(current.getPrev()!=null) {
					current.getPrev().setNext(newItem);
				}
				newItem.setPrev(current.getPrev());
				newItem.setNext(current);
				current.setPrev(newItem);
			}
			current = current.getNext();
		}
	}
	public void Clear() {
		first = null;
		last = null;
	}
	public boolean Contains(DoublyLinkedListItem item) {
		DoublyLinkedListItem current = first;
		while(current!=null) {
			if(current==item) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	public void Remove(DoublyLinkedListItem item) {
		item.getPrev().setNext(item.getNext());
		item.getNext().setPrev(item.getPrev());
		item = null;
	}
	public void RemoveFirst() {
		first.getNext().setPrev(null);
		first = first.getNext();
	}
	public void RemoveLast() {
		last.getPrev().setNext(null);
		last = last.getPrev();
	}
	public DoublyLinkedListItem getFirst() {
		return first;
	}
	public DoublyLinkedListItem getLast() {
		return last;
	}
}
