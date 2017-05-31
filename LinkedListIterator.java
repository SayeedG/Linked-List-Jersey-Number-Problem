
public class LinkedListIterator {

   private ListNode node;
   public LinkedListIterator(ListNode first)  {
        node = first;
   }
   public ListNode getNode(){
	   return node;
   }
   public boolean hasNext()  {
      return ( node != null );
   }
   
   public BaseballPlayer next()  {
      if ( node == null )
         throw new NullPointerException("The Linked list empty");
      BaseballPlayer currentData = node.data;
      node = node.next;
      return currentData;
   }
   public void setNode(ListNode set){
	   node = set;
   }
}