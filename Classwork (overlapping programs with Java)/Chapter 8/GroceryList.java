import java.util.*;
public class GroceryList
{
    public GroceryItemOrder[] groceries = new GroceryItemOrder[9];;
    public int size = 0;
    
    /*
     * Constructs a new empty grocery list.
     */
    public GroceryList()
    {
    }
    
    /*
     * Adds the given item order to this list if the list has fewer than 10 
     * items.
     */
    public void add(GroceryItemOrder item)
    {
        if (size < 9)
        {
            groceries[size] = item;
            size++;
        }
    }
    
    /*
     * Returns the total sum cost of all grocery item orders in this list
     */
    public double getTotalCost()
    {
        double sum = 0.0;
        for (int i = 0; i < size; i++)
        {
            sum += (double) groceries[i].getCost();
        }
        return sum;
    }
    
    public String toString()
    {
        return Arrays.toString(groceries);
    }
}
