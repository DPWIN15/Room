/*
was working on getting the correct menu to pull up and for the change room to work correctly
it seems as if in cases when we have no side rooms the room does not update correctly
 */

public class tester//
{
   public static void main(String[] args) throws Exception
   {
   int choice = 0;
   LinkedList temp = new LinkedList();
   temp.buildRoomList(10);
   Node nNode = temp.head;
   Room curRoom = temp.head.rooms[0];
   do
   {
   if((curRoom.getDescription()).substring(0, 9).compareTo("Main Room")==0)
      {
      System.out.print("\n\nThe group enters into a " + curRoom.getDescription());
      choice = curRoom.roomMenu();
      curRoom = curRoom.roomChange(nNode, choice);
      if(choice ==1)
         nNode = nNode.next;
      System.out.print("\n\nThe group enters into a " +curRoom.getDescription());   
      }
   else   
      if((curRoom.getDescription()).substring(0, 9).compareTo("Side Room")==0) //WE are In A side Room
         {
         curRoom = SideRoom.roomChange(nNode);
       //  System.out.print("\n\nThe group re-enters into a " + curRoom.getDescription());
         }
   
   
   }while(nNode.next!=null);//come up w/ condition
   }
}