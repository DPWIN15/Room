public class LinkedList
{
   Node head;
   int length;
   public LinkedList()
   {
      this.head= null;
      length = 0;   
   }
   
   public void addFirst(Node inc)
   {
      if(this.length ==0)
      {
         this.head = inc;
         this.length ++;  
      }
      else
         {
         inc.next = this.head;
         this.head = inc;
         this.length ++;
         }
   }
   
   public void buildRoomList(int length) throws Exception //Code to build room list
   {
      Node nNode;
      double ranDouble;
      double numberOfRooms;
      Room[] room1 = null;
      for(int x = 0; x< length; x++)
      {
          ranDouble = Math.random();
          numberOfRooms =ranDouble*3;
          if(numberOfRooms <1)
          {
              room1 = new Room[1];
              room1[0] = new MainRoomNoDoor();
          }
          if(numberOfRooms >1 && numberOfRooms <2)
          {
              room1 = new Room[2];
              room1[0] = new MainRoomOneDoor();
              room1[1] = new SideRoom();
              room1[1] = new TreasureChest((room1[1]));
          }
          if(numberOfRooms>2)
          {
              room1 = new Room[3];
              room1[0] = new MainRoom();
              room1[1] = new SideRoom();
              room1[1] = new TreasureChest(room1[1]);
              room1[2] = new SideRoom();
              try {
                  room1[2] = new EnemyGroupRoom(room1[2]);
              } catch (Exception e) {
                  room1[2] = new EnemyGroupRoom(room1[2]);
              }

          }
          nNode = new Node(room1);
          addFirst(nNode);
      }
   }
}