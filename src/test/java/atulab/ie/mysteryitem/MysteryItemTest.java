/**
 * 
 */
package atulab.ie.mysteryitem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class MysteryItemTest {

	/**
	 * Test method for {@link atulab.ie.mysteryitem.MysteryItem#getName()}.
	 */
	@Test
	final void testGetName() {
        MysteryItem item = new MysteryItem(null, null);
        item.setName("Ancient Amulet");
        String name = item.getName();
        assertEquals("Ancient Amulet", name);
    }
	/**
	 * Test method for {@link atulab.ie.mysteryitem.MysteryItem#setName(java.lang.String)}.
	 */
	@Test
	final void testSetName() {
        MysteryItem item = new MysteryItem(null, null);
        item.setName("Silver Sword");
        String name = item.getName();
        assertEquals("Silver Sword", name);
    }
	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	final void testToString() {
		
        MysteryItem item = new MysteryItem(null, null);
        item.setName("Silver Sword");
        String toStringOutput = item.toString();
        assertTrue(toStringOutput.contains("Silver Sword"));
    }

}
