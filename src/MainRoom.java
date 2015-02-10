import java.util.Scanner;
public class MainRoom extends Room
{
   public MainRoom()
   {
      this.description = "Main Room with a 2 side rooms and a door that leads further into the castle.";
   }
   public String getDescription()
   {
      if (this ==null)
         return "\nLOLWHAT";
      return this.description;
   }
   
   public int roomMenu() //NEED TO MAKE THIS WORK INDEPENDANT OF ROOM LAYOUT. IE it needs to know based on the # of elements in room array
   {
      int choice;
      Scanner kb = new Scanner(System.in);
      System.out.print("\nWhich room would you like to explore?");
       System.out.print("\n1-->The door that leads further into the castle");
       System.out.print("\n2-->Left Side Room");
      System.out.print("\n3-->Right Side Room\n");
      choice = kb.nextInt();
      while(choice<1 || choice>3)
      {
         System.out.print("\nInvalid Choice, try again!");
         System.out.print("\nWhich room would you like to explore?");
         System.out.print("\n1-->The door that leads further into the castle");
         System.out.print("\n2-->Left Side Room");
         System.out.print("\n3-->Right Side Room\n");
      choice = kb.nextInt();
      }
      return choice;
   }
   
   public  Room roomChange(Node cur, int choice)
   {
      if(cur.next == null)
         return null;
      if(choice ==1)
         {
             Room rt = cur.next.rooms[0];
             return rt;

         }      
      else
         if(choice ==2)
            {
                Room rt = cur.rooms[1];
                return rt;
            }
         else
            {
               Room rt = cur.rooms[2];
               return rt;
            }
   
   }

}