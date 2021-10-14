import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTask {

    public static void reverseArray(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);
    }
}
