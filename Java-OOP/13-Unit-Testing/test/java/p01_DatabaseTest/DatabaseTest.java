package p01_DatabaseTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    private static final Integer[] NUMBERS = {1, 2, 3, 4};
    private Database database;

    @Before
    public void prepare() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void testConstructorShouldCreateValidDatabase() throws OperationNotSupportedException {
        Integer[] dbElements = database.getElements();
        Assert.assertArrayEquals(dbElements, NUMBERS);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowsExceptionForMoreThanSixtenElements() throws OperationNotSupportedException {
        Integer[] largeArray = new Integer[17];
        new Database(largeArray);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowsExceptionForLessThanOneElement() throws OperationNotSupportedException {
        Integer[] smallArray = new Integer[0];
        new Database(smallArray);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddThrowExceptionWithNullArgument() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testAddShouldAddElement() throws OperationNotSupportedException {
        database.add(6);
        Integer[] dbElements = database.getElements();

        Assert.assertEquals(NUMBERS.length + 1, dbElements.length);
        Assert.assertEquals(Integer.valueOf(6), dbElements[dbElements.length -1]);
    }

    @Test
    public void testRemoveShouldRemoveLastElement() throws OperationNotSupportedException {
        database.remove();

        Integer[] dbElements = database.getElements();
        Assert.assertEquals(NUMBERS.length - 1, dbElements.length);
        Assert.assertEquals(Integer.valueOf(3), dbElements[dbElements.length - 1]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowException() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        database.remove();
    }
}
