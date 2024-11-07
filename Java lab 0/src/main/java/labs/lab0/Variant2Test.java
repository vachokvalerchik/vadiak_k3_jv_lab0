package labs.lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Variant2Test {

    @Test(priority = 1, dataProvider = "inputProvider")
    public void inputTest(int p1, int p3) {
        assertEquals(new Variant2().inputOutputTask(p1), p3);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][] { { 3, 27 }, { 2, 8 }, { 4, 64 }, { 5, 125 } };
    }

    //////////////////////////////////////////

    @Test(priority = 2, dataProvider = "integerProvider")
    public void integerNumbersTest(int p1, int p3) {
        assertEquals(new Variant2().integerNumbersTask(p1), p3);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 3000, 3 }, { 1500, 1 }, { 10000, 10 }, { 999, 0 } };
    }

    //////////////////////////////////////////

    @Test(priority = 3, dataProvider = "booleanProvider")
    public void booleanTest(int p1, boolean p3) {
        assertEquals(new Variant2().booleanTask(p1), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 5, true }, { 8, false }, { 3, true }, { 2, false } };
    }

    //////////////////////////////////////////

    @Test(priority = 4, dataProvider = "ifProvider")
    public void ifTest(int p1, int p3) {
        assertEquals(new Variant2().ifTask(p1), p3);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 2, 3 }, { -5, -7 }, { 0, -2 }, { 10, 11 } };
    }

    //////////////////////////////////////////

    @Test(priority = 5, dataProvider = "switchProvider")
    public void switchTest(int p1, String p3) {
        assertEquals(new Variant2().switchTask(p1), p3);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { 3, "задовільно" }, { 1, "погано" }, { 4, "добре" }, { 6, "помилка" } };
    }

    //////////////////////////////////////////

    @Test(priority = 6, dataProvider = "forProvider")
    public void forTest(int p1, int p2) {
        assertEquals(new Variant2().forTask(p1, p2), p2);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] { { 3, 3 }, { 5, 5 }, { 10, 10 } };
    }

    //////////////////////////////////////////

    @Test(priority = 7, dataProvider = "whileProvider")
    public void whileTest(int A, int B, int count) {
        assertEquals(new Variant2().whileTask(A, B), count);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { { 32, 5, 6 }, { 10, 3, 3 }, { 50, 7, 7 } };
    }

    //////////////////////////////////////////

    @Test(priority = 8, dataProvider = "arrayProvider")
    public void arrayTest(int[] expected, int N) {
        assertEquals(new Variant2().arrayTask(N), expected);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] {
                { new int[] { 1, 2, 4, 8, 16 }, 5 },
                { new int[] { 1, 2, 4 }, 3 },
                { new int[] { 1, 2, 4, 8, 16, 32 }, 6 }
        };
    }

    //////////////////////////////////////////

    @Test(priority = 9, dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int M, int N, int[][] expected) {
        assertEquals(new Variant2().twoDimensionArrayTask(M, N), expected);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        return new Object[][] {
                { 3, 3, new int[][] { { 5, 10, 15 }, { 5, 10, 15 }, { 5, 10, 15 } } },
                { 2, 4, new int[][] { { 5, 10, 15, 20 }, { 5, 10, 15, 20 } } }
        };
    }

}
