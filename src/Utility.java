
/**
 * Created by max on 1/29/15.
 */
import java.util.*;
import java.io.*;

public class Utility {

    public static ArrayList<String> loadList(String name) throws FileNotFoundException {

        Scanner fin;
        fin = new Scanner(new File(name));
        ArrayList <String> myList = new ArrayList<String>();
        while (fin.hasNextLine())
        {
            myList.add(fin.nextLine());
        }
        fin.close();
        return myList;
    }
}
