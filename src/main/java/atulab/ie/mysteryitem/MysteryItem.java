package atulab.ie.mysteryitem;

/**
 * MysteryItem class
 * This class holds attributes for a mystery item
 * 
 * 
 * @author Ante Jelavic
 */
public class MysteryItem {
    private String name;
    private String lore;  // Added lore attribute to describe each item

    /**
     * Constructor to initialize a mystery item with a name and lore.
     * 
     * @param name the name of the mystery item
     * @param lore the lore of the mystery item
     */
    public MysteryItem(String name, String lore) {
        this.name = name;
        this.lore = lore;
    }

    /**
     * Gets the name of the mystery item.
     * 
     * @return the name of the mystery item
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the mystery item.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the lore of the mystery item.
     * 
     * @return the lore of the mystery item
     */
    public String getLore() {
        return lore;
    }

    /**
     * Sets the lore of the mystery item.
     * 
     * @param lore the lore to set
     */
    public void setLore(String lore) {
        this.lore = lore;
    }

    @Override
    public String toString() {
        return "MysteryItem [name=" + name + ", lore=" + lore + "]";
    }
}
