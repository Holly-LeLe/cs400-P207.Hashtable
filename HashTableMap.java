import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashTableMap<KeyType, ValueType>
    implements MapADT<KeyType, ValueType> {


    protected class Pair {

        public KeyType key;
        public ValueType value;

        public Pair(KeyType key, ValueType value) {
            this.key = key;
            this.value = value;
        }

    }


    protected LinkedList<Pair>[] table;


    @SuppressWarnings("unchecked")
    public HashTableMap(int capacity) {

        table = (LinkedList<Pair>[]) new LinkedList[capacity];

    }


    public HashTableMap() {

        this(64);

    }
    public void put(KeyType key, ValueType value) {

    }


    public boolean containsKey(KeyType key) {

        return false;

    }


    public ValueType get(KeyType key) {

        return null;

    }


    public ValueType remove(KeyType key) {

        return null;

    }


    public void clear() {

    }


    public int getSize() {

        return 0;

    }


    public int getCapacity() {

        return table.length;

    }


    public List<KeyType> getKeys() {

        return null;

    }
    /**
     * Tests that default constructor creates capacity 64.
     */
    @Test
    public void testDefaultCapacity() {

        HashTableMap<String,Integer> map =
            new HashTableMap<>();

        assertEquals(64, map.getCapacity());

    }


    /**
     * Tests that custom constructor creates correct capacity.
     */
    @Test
    public void testCustomCapacity() {

        HashTableMap<String,Integer> map =
            new HashTableMap<>(10);

        assertEquals(10, map.getCapacity());

    }


    /**
     * Tests that a new map starts empty.
     */
    @Test
    public void testInitialSize() {

        HashTableMap<String,Integer> map =
            new HashTableMap<>();

        assertEquals(0, map.getSize());

    }


    /**
     * Tests containsKey on an empty map.
     */
    @Test
    public void testContainsKeyEmpty() {

        HashTableMap<String,Integer> map =
            new HashTableMap<>();

        assertFalse(map.containsKey("apple"));

    }


    /**
     * Tests getKeys on a new empty map.
     */
    @Test
    public void testGetKeysEmpty() {

        HashTableMap<String,Integer> map =
            new HashTableMap<>();

        assertNull(map.getKeys());

    }


}