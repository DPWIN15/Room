/**
 * Created by max on 1/29/15.
 */
import java.io.FileNotFoundException;
import java.util.*;
public class Group {
    private ArrayList <Enemy> group = new ArrayList<Enemy>();

    public Group() throws FileNotFoundException {
        ArrayList<String> list = Utility.loadList("monster.csv");
        Random rand = new Random();
        int partySize = rand.nextInt(5) + 1;

        for (int i = 0; i < partySize; i++)
        {
            int index = rand.nextInt(list.size()/4) * 4;
            String name = list.get(index);
            index++;
            int hp = Integer.parseInt(list.get(index));
            index++;
            double attackSpeed = Double.parseDouble(list.get(index));
            index++;
            int damage = Integer.parseInt(list.get(index));
            group.add(new Enemy(name, hp, attackSpeed, damage));
        }
    }

    public ArrayList<Enemy> getGroup() {
        return group;
    }

    public void printEnemies(){
        for (int i = 0; i < this.group.size(); i++){
            System.out.println(group.get(i));
        }
    }


    public String getEnemies()
    {
        String rt = "";
        for(int i = 0; i<this.group.size(); i++)
        {
            rt += (group.get(i) + "\n ");
        }
        return rt;
    }
}
