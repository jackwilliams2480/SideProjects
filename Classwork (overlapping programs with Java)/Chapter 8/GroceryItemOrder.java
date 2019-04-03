import java.text.NumberFormat;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Locale;

public class GroceryItemOrder
{
    public String name;
    public int quantity;
    public double pricePerUnit;

    /*
     * Constructs an item order to purchase the item with the given name, 
     * in the given quantity, which costs the given price
     * per unit.
     */
    public GroceryItemOrder(String name, int quantity, double pricePerUnit)
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    /* 
     * Returns the total cost of this item in its given quantity. For example,
     * four boxes of cookies that cost 2.30 per unit
     * have a total cost of 9.20
     */
    public double getCost()
    {
        return (double) pricePerUnit * quantity;
    }

    /*
     * Sets this grocery item’s quantity to be the given value
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public String toString()
    {
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);                      

        return "Item Name: " + name +
        "\t Quantity: " + quantity +
        "\t Price Per Unit: $" + pricePerUnit +
        "\t Cost: " + moneyFormat.format(getCost());
    }

}
