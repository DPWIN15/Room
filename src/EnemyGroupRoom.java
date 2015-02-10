import java.io.FileNotFoundException;

/**
 * Created by seach_000 on 2/6/2015.
 */
import java.io.FileNotFoundException;
public class EnemyGroupRoom extends RoomDecorator
{
    Room room;
    Group group;

    public EnemyGroupRoom(Room room) throws Exception
    {
        this.room = room;
        try {
            group = new Group();
            }
        catch(Exception e)
        {
            System.out.println("\nSorry\n");
        }
    }

    public String getDescription()
    {
        return room.getDescription() + " with a group of enemies containing \n" + group.getEnemies();
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
