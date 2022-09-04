
public class App {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyLinkedListItem item1 = new DoublyLinkedListItem(1);
		DoublyLinkedListItem item2 = new DoublyLinkedListItem(2);
		DoublyLinkedListItem item3 = new DoublyLinkedListItem(3);
		DoublyLinkedListItem item4 = new DoublyLinkedListItem(4);
		DoublyLinkedListItem item5 = new DoublyLinkedListItem(5);
		DoublyLinkedListItem item6 = new DoublyLinkedListItem(6);
		list.addLast(item1);
		list.addLast(item2);
		list.addLast(item3);
		list.addLast(item4);
		list.addLast(item5);
		list.addLast(item6);

		print(list);
	}
	
	public static void print(DoublyLinkedList list) {
		DoublyLinkedListItem item = list.getFirst();
		while (item!=null) {
			System.out.println(item.getData());
			item = item.getNext();
		}
	}

}
