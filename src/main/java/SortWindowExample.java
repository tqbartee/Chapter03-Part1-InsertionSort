import org.desu.portfolio.PortfolioHolding;
import org.desu.portfolio.PortfolioUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SortWindowExample {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Sort Window Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        // Create multi-line, non-editable text area inside scroll pane
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create buttons
        JButton sortBySymbolButton = new JButton("Sort by Symbol");
        JButton sortBySharesButton = new JButton("Sort by Shares");
        JButton sortByPriceButton = new JButton("Sort by Price");
        JButton sortByTotalButton = new JButton("Sort by Total");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(sortBySymbolButton);
        buttonPanel.add(sortBySharesButton);
        buttonPanel.add(sortByPriceButton);
        buttonPanel.add(sortByTotalButton);

        // Add components to frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Example text for demonstration
        // Generated code
        //textArea.setText("AAPL, 50, $150.12\nGOOG, 10, $2729.25\nTSLA, 5, $688.72");

        // TB added code here
        PortfolioHolding[] ourHoldings = PortfolioUtilities.buildExamplePortfolio();
        String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
        textArea.setText(portfolioString);

        // Action Listeners for buttons
        sortBySymbolButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Stub: Replace with a call to sort by symbol and display in text area
                // Example:
                // String sortedText = sortBySymbol();
                // textArea.setText("SAMPLE: Sorted by Symbol\nAAPL, 50, $150.12\nGOOG, 10, $2729.25\nTSLA, 5, $688.72");
                // textArea.setText(sortedText);

                // TB added code here
                InsertionSortFromBookModified.insertionSort(ourHoldings, PortfolioHolding.symbolComparator);
                String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
                textArea.setText(portfolioString);
            }
        });

        sortBySharesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Stub: Replace with a call to sort by shares and display in text area
                // Example:
                // String sortedText = sortByShares();
                // textArea.setText(sortedText);
                // textArea.setText("SAMPLE: Sorted by Shares\nTSLA, 5, $688.72\nGOOG, 10, $2729.25\nAAPL, 50, $150.12");

                // TB Added code here
                InsertionSortFromBookModified.insertionSort(ourHoldings, PortfolioHolding.sharesComparator);
                String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
                textArea.setText(portfolioString);
            }
        });

        sortByPriceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Stub: Replace with a call to sort by price and display in text area
                // Example:
                // String sortedText = sortByPrice();
                // textArea.setText(sortedText);
                //textArea.setText("SAMPLE: Sorted by Price\nAAPL, 50, $150.12\nTSLA, 5, $688.72\nGOOG, 10, $2729.25");

                // TB Added code here
                InsertionSortFromBookModified.insertionSort(ourHoldings, PortfolioHolding.priceComparator);
                String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
                textArea.setText(portfolioString);

            }
        });

        sortByTotalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Stub: Replace with a call to sort by price and display in text area
                // Example:
                // String sortedText = sortByPrice();
                // textArea.setText(sortedText);
                //textArea.setText("SAMPLE: Sorted by Price\nAAPL, 50, $150.12\nTSLA, 5, $688.72\nGOOG, 10, $2729.25");

                // TB Added code here
                InsertionSortFromBookModified.insertionSort(ourHoldings, PortfolioHolding.totalComparator);
                String portfolioString = PortfolioUtilities.buildDisplayString(ourHoldings, '\n');
                textArea.setText(portfolioString);

            }
        });

        // Show the frame
        frame.setVisible(true);
    }

}
