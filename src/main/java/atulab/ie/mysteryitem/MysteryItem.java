/**
 * MysteryItem.java
 */
package atulab.ie.mysteryitem;

/**
 * MysteryItem class
 * MysteryItem class Holds item attributes
 * 
 * @author Ante Jelavic
 */
public class MysteryItem {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MysteryItem [name=" + name + "]";
	}

}
