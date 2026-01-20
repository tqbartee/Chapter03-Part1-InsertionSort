import java.util.Arrays;
import org.desu.portfolio.*;

public class JavaUtilArraysExamples {

    // Skillbuilder Part 8
    // Use java.utils.Arrays to sort in this example
    public static String skillBuilderPart8() {

        System.out.println("Part 8 output begins here...");

        char[] testArray = {'S', 'A', 'M', 'P', 'L', 'E'};
        Arrays.sort(testArray);
        String testArrayOutputString = Arrays.toString(testArray);
        System.out.println("Sorted testArray is: " + testArrayOutputString);

        // Now see if this works with String object type
        String[] testArray2 = {"Rene", "Joseph", "Janet", "Jonas", "Helen", "Virginia"};
        Arrays.sort(testArray2);
        testArrayOutputString = java.util.Arrays.toString(testArray2);
        System.out.println("Sorted testArray is: " + testArrayOutputString);

        // Try the portfolio object example
        // Build the portfolio
        PortfolioHolding[] ourHoldings = PortfolioUtilities.buildExamplePortfolio();
        String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("Before sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Now sort
        // TODO: put in sorting code here - see previous - don't overthink)

        // Now reprint
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        //JSONUtilities.printObjectAsJson(ourHoldings);
        return portfolioString;
    }

    // Skillbuilder Part 9
    // Use arrays.sort to sort, using Java
    public static String skillBuilderPart9() {
        // Build portfolio
        PortfolioHolding[] ourHoldings = PortfolioUtilities.buildExamplePortfolio();
        String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("Before sort, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Now sort by shares
        Arrays.sort(ourHoldings, PortfolioHolding.sharesComparator);
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by shares, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Now sort by price
        // TODO: Sort by price here (one-line - see above) - use priceComparator
        Arrays.sort(ourHoldings, PortfolioHolding.priceComparator);
        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by price, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        // Next sort by symbol in reverse
        portfolioString = "Not sorted yet";
        // TODO: Sort by symbol reverse here (use symbolComparatorZtoA, see previous - just one line

        portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        System.out.println("After sort by symbol decreasing, PortfolioHoldings are: ");
        System.out.println(portfolioString);
        return portfolioString;
    }
}
