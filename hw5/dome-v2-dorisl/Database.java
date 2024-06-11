import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public void list()
    {
        for(Iterator iter = items.iterator(); iter.hasNext(); )
        {
            Item item = (Item)iter.next();
            item.print();
            System.out.println();   // empty line between items
        }
    }
    
    public Item searchByTitle(String theTitle) {
        Pattern p = Pattern.compile(theTitle);        
        for (Item item : items) {
            Matcher m = p.matcher(item.getTitle());
            if (m.matches()) {
                return item;
            }
        }
        return null;
    }

    public Item searchByTitlePattern(String pat) {
        Pattern p = Pattern.compile(pat);        
        for (Item item : items) {
            Matcher m = p.matcher(item.getTitle());
            if (m.find()) {
                return item;
            }
        }
        return null;
    }

    public Item searchByPattern(String pat) {
        boolean result = false;
        Pattern p = Pattern.compile(pat);        
        for (Item item : items) {
            Matcher m;
            for (String field: item.getFields()) {
                m = p.matcher(field);
                result |= m.find();
            }
            
            if (result) {
                return item;
            }
        }
        return null;
    }

    
}
