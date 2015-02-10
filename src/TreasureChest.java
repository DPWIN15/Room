public class TreasureChest extends RoomDecorator
{
   Room room;
   public TreasureChest(Room room)
   {
      this.room = room;
   }

   public String getDescription()
   {
      return room.getDescription() + " with a treasure chest!";
   }

    @Override
    public int roomMenu() {
        return room.roomMenu();
    }

    @Override
    public Room roomChange(Node nNode, int choice) {
        return null;
    }
}