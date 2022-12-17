public class NodeTest {
	public static void main(String[] args) {
		Node first = new Node(null, new Employee("smith"), null);
		Node second = new Node(first, new Employee("milan"), null);
		Node third = new Node(second, new Employee("peter"), null);

		first.setNext(second);
		second.setNext(third);
		
		while (first != null) {
			System.out.println(first);
			first = first.getNext();
		}
		
		second.setNext(null);
		second.setPrev(null);
		first.setNext(third);
		third.setPrev(first);
		System.out.println("\n删除second后");
		while (first != null) {
			System.out.println(first);
			first = first.getNext();
		}
	}
}

class Node {
	private Node prev = null;
	private Employee emp = null;
	private Node next = null;
	
	public Node(Node prev, Employee emp, Node next) {
		this.prev = prev;
		this.emp = emp;
		this.next = next;
	}
	
	public String toString() {
		return emp.getName();
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public Node getNext() {
		return this.next;
	}
}
	
class Employee {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}