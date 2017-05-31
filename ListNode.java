public class ListNode { //ListNode Class
   BaseballPlayer data;
   ListNode next;
   
   /**
    * 
    * @param data
    * @param next
    */
   public ListNode(BaseballPlayer data, ListNode next)  {
      this.data = data;
      this.next = next;
   }  
   
   public ListNode()  {
      this.data = null;
      this.next = null;
   }  
   
   public ListNode(BaseballPlayer data)  {
      this.data = data;
      this.next = null;
   } 

}