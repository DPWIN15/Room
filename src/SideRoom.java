public class SideRoom extends Room
{
   public SideRoom()
   {
      this.description = "Side Room";
   }
   public String getDescription()
   {
      return this.description;
   }
   
   public static Room roomChange(Node cur)
      {
         return cur.rooms[0];
      }

    @Override
    public int roomMenu()
    {
        return 0;
    }

    @Override
    public Room roomChange(Node nNode, int choice) {
        return null;
    }
}

