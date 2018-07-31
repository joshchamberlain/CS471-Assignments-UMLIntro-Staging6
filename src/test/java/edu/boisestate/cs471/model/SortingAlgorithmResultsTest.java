package edu.boisestate.cs471.model;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

public class SortingAlgorithmResultsTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @Test
    public final void testFoo() {
        fail("Not yet implemented"); // TODO
    }

    public final void testBubbleSort() {
        int n = 10;
        BubbleSort sort = new BubbleSort(10);
        sort.randomize();
        for (int i = 0; i < (n*n); i++) {
            sort.doSortIteration();
            if (sort.isSorted()) {
                break;
            }
        }
        assertTrue(sort.isSorted());
    }

}
