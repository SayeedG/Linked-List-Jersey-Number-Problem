public class LinkedList {
   private ListNode first; 
   private ListNode last; 
   private int length;
   
   public LinkedList () { //sets the LinkedList
         ListNode ln = new ListNode();
         first = ln;
         last = ln;
         length = 0;
      }
   /**
    * 
    * @param s
    */
   public void append (BaseballPlayer B) { //appends the data to a LinkedList
      ListNode n = new ListNode(B);
      LinkedListIterator lli = reset();
      ListNode temp = first;
     
      while(lli.hasNext()){ // If the Linked List Iterator has more data, it will get the data and compare it
    	  int toCompare = lli.getNode().data.getTheNumber();
    	  if(toCompare> n.data.getTheNumber()){
    		  n.next = lli.getNode();
    		  temp.next = n;
    		  return;
    	  }
    	  else if(toCompare<n.data.getTheNumber()){
    		  temp = temp.next;
    		  
    	  }
    	  
    	  lli.next();
      }
      
      last.next = n;
      last = n;
      length++;
   }
   
   public LinkedListIterator reset()   {
      return new LinkedListIterator(first.next);
   } 

}