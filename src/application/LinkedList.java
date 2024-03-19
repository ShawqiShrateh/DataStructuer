package application;

public class LinkedList<T extends Comparable<T>> {
	Node <T> head ;
	
	public void insert(T data) {
		Node<T> nono= new Node<>(data);
		if(head  == null) {// if list empty
			head = nono; 
			
		}
		else {
			Node<T>  prev = null , curr = head; 
			for( ; curr != null  && curr.getData().compareTo(data) < 0 ; prev=curr ,curr = curr.getNext() );
			if(prev == null ) {//add first
				nono.setNext(curr);
				head = nono ; 
				
			}
			else if(curr == null ) {// add last
				prev.setNext(nono);
			}
			else {//add between
				nono.setNext(curr);
				prev.setNext(nono);
			}
			
		}
	}
	public Node<T> delete (T data){
		if(head != null ) {
			Node<T> prev = null , curr = head;
			for( ; curr != null && curr.getData().compareTo(data)<0 ; prev = curr , curr = curr.getNext());
			if(curr != null &&curr.getData().compareTo(data) == 0) {// to know if we founded data
				if(head == curr ) {
					head = curr.getNext();
				}
				else if (curr.getNext() == null ) {
					prev.setNext(null);
				}
				else {
					prev.setNext(curr.getNext());
					return curr;
				}
				
			}
		}
		System.out.println("item not found !");
		return null;
		
	}
	
/*	public  Node<T> find(T data ){
		Node<T> prev =null , curr = head;
		if( curr != null && curr.getData().compareTo(data)<0 )
			prev = curr ;
			curr = curr.getNext();
		if(curr != null &&curr.getData().compareTo(data) == 0) {
			return curr;
		}
		
		return find((T) curr.getNext());
		
	}
	*/
	
	public boolean find(T data, Node<T> head2) {
		return find(data , head);
	}
	
	public javafx.scene.Node trasverse() {
		Node < T> curr = head ; 
		System.out.print("HEAD ---> ");
		while(curr != null) {
			System.out.print(curr + "---->");
		curr = curr.getNext();
		}
		System.out.println("null");
		return null;
	}
	
	public void rev(){
		if(head  == null) {// if list empty
			System.out.println("list is empty can not be reversed"); 
			
		}
		else {
			Node<T>  prev = null , curr = head ,next = null; 
			while(curr != null) {
				next=curr.getNext();
				curr.setNext(prev);
				prev = curr;
				curr=next;
				
			}
			head = prev;
		}
		
		
	}
	
	/*public void revt() {
		Node<T>  prev = null , curr = head ,next = null; 
		while(curr.getData().compareTo((T) next)<0){
			curr.setNext(prev);
		}
	}
	*/

}


