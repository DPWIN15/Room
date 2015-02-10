public class Node
{
   Node next;
   Room[] rooms;
   private Node()
   {
   }
   
   public Node(Room[] roomsIn)
   {
      this.rooms = roomsIn;
      this.next = null;
   }

}