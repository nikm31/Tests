import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArraysTest {
    private MainApp mainApp;
    private static final List<Arguments> out = new ArrayList<>();

    @BeforeEach
    public void createBody(){
        mainApp = new MainApp();
        System.out.println("Старт теста");
    }

    public static Stream<Arguments> dataForArray() {
        out.add(Arguments.arguments(new int[]{4, 5, 4, 9, 0}, new int[]{9, 0}));
        out.add(Arguments.arguments(new int[]{4, 1, 1, 1, 1, 1, 1, 1, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 0}));
        out.add(Arguments.arguments(new int[]{4, 1, 1, 1, 1, 1, 1, 1, 4}, new int[]{}));
        return out.stream();
    }

    public static Stream<Arguments> dataForArray2() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{0, 4, 0}));
        out.add(Arguments.arguments(new int[]{0, 0, 1, 0}));
        out.add(Arguments.arguments(new int[]{1, 1, 1}));
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForArray")
    @DisplayName("DZ #2")
    void testArray(int[] testArr, int[] expected) {
        Assert.assertArrayEquals(expected, mainApp.afterLastFourArray(testArr));
    }

    @ParameterizedTest
    @MethodSource("dataForArray2")
    @DisplayName("DZ #3")
    void testArray6(int[] testArr) {
        Assertions.assertTrue(mainApp.isOneOrFourInArray(testArr));
    }
}