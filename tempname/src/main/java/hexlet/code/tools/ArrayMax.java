package hexlet.code.tools;

public class ArrayMax {

    public static Integer findMax(Integer[] array) {
        Integer max = array[0];
        for (Integer value : array) {
            if (value != null && value > max) {
                max = value;
            }
        }
        return max;
    }
}
