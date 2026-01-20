import java.util.ArrayList;
import java.util.Collections;

public class JavaUtilArrayListExample {

    public static String skillBuilderPart10() {

        ArrayList<String> testArrayList = new ArrayList<>();
        testArrayList.add("Rene");
        // TODO: Add names for "Joseph" "Janet" "Jonas" "Helen" and "Virginia"
        // to the testArrayList
        // Note these are not added by any array index

        String testArrayOutputString = testArrayList.toString();
        System.out.println("testArrayList is: " + testArrayOutputString);
        // Use static sort method in Collections and pass in testArrayList
        Collections.sort(testArrayList);
        testArrayOutputString = testArrayList.toString();
        System.out.println("Sorted testArray is: " + testArrayOutputString);

        // FUTURE: make portfolio examples work with ArrayList
        return testArrayOutputString;
    }

    public static void main (String[] args) {
        skillBuilderPart10();
    }
}
