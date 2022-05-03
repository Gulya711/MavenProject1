import org.junit.jupiter.api.*;

@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class AscendingSequenceTest {
    @Order(1)
    @Test
    public void testAscendingSequenceHappyPath(){
        // 0,1,2,3,4,5
        int start = 0;
        int end =5;
        int step =1;
        int[] expectedResult = {0,1,2,3,4,5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
