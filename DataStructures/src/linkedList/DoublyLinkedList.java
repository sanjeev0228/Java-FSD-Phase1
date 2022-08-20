package linkedList;
import LinkedList.Node;

public class DoublyLinkedList {

	Node head;//head of first (first node address)
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			prev = null;
			data =d;
			next = null;
			
		}
	}
	
	public static DoublyLinkedList insert(DoublyLinkedList list ,int data) {
		Node new_node = new Node(data);
		if(list.head == null) {
			list.head=new_node;
		}
		
		else
		{
			
			Node last;
			//move pointer to last node to insert new node
			for(last=list.head;last.next!=null;last=last.next) {}
			last.next=new_node;
			new_node.prev=last;
			
			
		}
		return list;
		/*
		 * for(Node last=list.head;last.next!=null;last=last.next);
		 * last.next=new_node;
		 */

	}
	
	public static void printList(DoublyLinkedList list) {
		for(Node last = list.head;last!=null;last=last.next) {
			System.out.println(last.data+" ");
		}
		System.out.println();
	}
	
	
	public static void printListReverse(DoublyLinkedList list) {
		Node last = list.head;
		
		System.out.println("Reverse LinkedList: ");
		
		//transerse through linkedList and stop at end node
		for (last=list.head;last.next != null;last = last.next) {}
		for (;last != null;last = last.prev) {
			// Print the data at current node
			System.out.print(last.data + " ");
			// Go to next node
			
		}

		
	}
	
	//method to delete  a node in the LinkedLisgt by key
	
	public static DoublyLinkedList deleteByKey(DoublyLinkedList list, int key) {
		// Store head node
		Node last = list.head, prev = null;
		
		
		
		
		
			while(last!=null && key!=last.data){
				last=last.next;
				
			}
			
			if(last!=null){
				if(last.next!=null)
				last.next.prev=last.prev;
				if(last.prev!=null)
				last.prev.next=last.next;
				System.out.println("Key Deleted");
			}
		
			if(last==null)
				System.out.println("Key not found"+key);
			
		
		
		
		return list;
	}
		
		// method to create a Singly linked list with n nodes
		public static void main(String[] args) {
			/* Start with the empty list. */
			DoublyLinkedList list = new DoublyLinkedList();
			// Insert the values
			list = insert(list, 1);
			list = insert(list, 2);
			list = insert(list, 3);
			list = insert(list, 4);
			list = insert(list, 5);
			list = insert(list, 6);
			list = insert(list, 7);
			list = insert(list, 8);
			// Print the LinkedList
			printList(list);
			// Delete node with value 1
			deleteByKey(list, 1);
			// Print the LinkedList
			//printList(list);
			// Delete node with value 4
			deleteByKey(list, 8);
			// Print the LinkedList
			printList(list);
			// Delete node with value 10
			deleteByKey(list, 10);
			// Print the LinkedList
			printListReverse(list);
		
	}
	
	
	}
	
	

