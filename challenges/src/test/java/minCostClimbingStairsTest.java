import org.example.minCostClimbingStairs.minCostClimbingStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class minCostClimbingStairsTest {

    @Test
    void testExample1() {
        minCostClimbingStairs solver = new minCostClimbingStairs();
        int[] cost = {10, 15, 20};
        int expected = 15;
//        assertEquals(expected, solver.minCost(cost));
        assertEquals(expected,solver.minCostOptimised(cost));
    }

    @Test
    void testExample2() {
        minCostClimbingStairs solver = new minCostClimbingStairs();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
//        assertEquals(expected, solver.minCost(cost));
        assertEquals(expected, solver.minCostOptimised(cost));
    }
}
