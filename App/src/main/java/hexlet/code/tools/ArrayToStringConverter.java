package hexlet.code.tools;

public class ArrayToStringConverter {

    public static String[] convertIntArrayToStringArray(int[] intArray) {
        String[] stringArray = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            stringArray[i] = String.valueOf(intArray[i]);
        }
        return stringArray;
    }
}
