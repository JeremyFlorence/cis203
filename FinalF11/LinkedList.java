public class LinkedList<E>  {

    private ListNode<E> head;

    // post: constructs an empty linked list
    public LinkedList () {
        head = null;
    }
    
    public LinkedList(Integer [] a) {
	ListNode start = this.head;
	ListNode nextNode = new ListNode( 0, head );
	ListNode nullNode = new ListNode( 0, nextNode );
	head.next = nextNode;
	
	for(int i = 0; i < a.length; i++) {
	    nextNode = new ListNode( a[i], nullNode );
	    nextNode = nextNode.next;
	    nullNode = new ListNode( 0, nextNode );
	}
	nextNode.next = null;
    }


    // inner class
    private static class ListNode<E> {
        // data stored in this node
        E data; 

        // link to next node in the list
        public ListNode<E> next; 

        // post: constructs a node with given data and given link
        public ListNode(E data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

}
