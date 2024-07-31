package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void uniquePathsTest() {
        Solution solution = new Solution();
        assertEquals(28, solution.uniquePaths(3, 7));
        assertEquals(3, solution.uniquePaths(3, 2));
        assertEquals(35, solution.uniquePaths(5, 4));
        assertEquals(462, solution.uniquePaths(6, 7));
        assertEquals(8, solution.uniquePaths(2, 8));
    }

}