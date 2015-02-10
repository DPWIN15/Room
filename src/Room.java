public abstract class Room
{
String description = "Plain Room";
    int numDoors;

public String getDescription()
{
   return description;
}


    public abstract int roomMenu();

    public abstract Room roomChange(Node nNode, int choice);
}