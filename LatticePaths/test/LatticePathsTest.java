import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LatticePathsTest {

    @Test
    public void testCreateGraph() throws Exception {
        assertEquals(21*21, LatticePaths.createGraph(21).size());
        assertEquals(1, LatticePaths.createGraph(21).get(4).getParents().size());
    }

    @Test
    public void testCalculateLatticePaths() throws Exception {
        assertEquals(137846528820l, LatticePaths.calculateLatticePaths(21));
        assertEquals(6, LatticePaths.calculateLatticePaths(3));
    }
}