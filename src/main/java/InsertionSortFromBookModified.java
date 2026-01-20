import org.desu.portfolio.PortfolioHolding;
import java.lang.Comparable;
import java.util.Comparator;

public class InsertionSortFromBookModified {

    // Skillbuilder Part 1
    // TODO: insert code for insertionSort from book - Code Fragment 3.2.2
    // Copy and paste code into this method
    /** Insertion-sort of an array of characters into nondecreasing order */
    public static void insertionSort(char[] data) {
    }

    // SkillBuilder Part 2
    // TODO: reuse Base code for sorting (pasted in part 1 above)
    // Fix to handle int[] data type - another primitive types
    public static void insertionSort(int[] data) {
        // Insert body of code from Part 1 here and fix for int
    }

    // SkillBuilder Part 3
    // TODO: reuse Base code for sorting (pasted in part 1 above)
    // Implement using Character objects in the array instead of char primitives
    // This works because of "unboxing" - < or > still works
    public static void insertionSort(Character[] data) {
        // Insert body of code from Part 1 here and fix for Character
    }

    // Skillbuilder Part 4
    // TODO: copy base code from part 3 above (for Character)
    // Then modify for String[] type as input, fix all issues
    // Need to include compareTo as String comparator
    // data[j - 1].compareTo(cur) > 0
    public static void insertionSort(String[] data) {
        // Insert body of code from Part 3 here and fix for String
    }

    // Skillbuilder Part 5 - Test
    // TODO: copy base code from above (for String)
    // Then modify for PortfolioHolding[] type as input, fix all issues
    // Need to include compareTo as String comparator
    // data[j - 1].compareTo(cur) > 0
    public static void insertionSort(PortfolioHolding[] data) {
        // Insert body of code here and fix for String
    }

    // Skillbuilder Part 6: Do this generically using default comparator
    // TODO: copy code body from part 5, then edit to use generic Java object
    // Use Java generic framework

    public static <T extends Comparable<T>> void insertionSortGeneric(T[] data) {
        // Insert body of code from Part 3 here and fix for Generic (T)
        // Just need to change the line with cur to T cur
    }

    // Skillbuilder Part 7: Do this generically using default comparator above
    // TODO: copy code from part 6, then edit to use comparator objects
    // See "Alternate comparators for other factors" section of PortfolioHolding
    // Use Java generic framework
    // Can't pass in array of primitive types, just array of objects
    // Use T cur = data[k]
    // in the while statement: (comparator.compare(data[j-1], cur) > 0)
    public static <T> void insertionSort(T[] data, Comparator<T> comparator) {
        // Insert code here from previous part
    }

    public static void main (String [] args) {
        System.out.println("Hello from InsertionSortFromBookModified");
    }
}

