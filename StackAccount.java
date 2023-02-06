package ObjectOrientedPrograms;
import java.util.Scanner;

    public class StackAccount {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of stocks: ");
            int numStocks = input.nextInt();
            String[] stockNames = new String[numStocks];
            int[] numShares = new int[numStocks];
            double[] sharePrices = new double[numStocks];
            double[] stockValues = new double[numStocks];
            double totalValue = 0.0;

            for (int i = 0; i < numStocks; i++) {
                System.out.print("Enter stock name: ");
                stockNames[i] = input.next();
                System.out.print("Enter number of shares: ");
                numShares[i] = input.nextInt();
                System.out.print("Enter price per share: ");
                sharePrices[i] = input.nextDouble();
                stockValues[i] = numShares[i] * sharePrices[i];
                totalValue += stockValues[i];
            }

            System.out.println("Stock Report:");
            System.out.println("-------------");
            for (int i = 0; i < numStocks; i++) {
                System.out.println("Stock Name: " + stockNames[i]);
                System.out.println("Number of Shares: " + numShares[i]);
                System.out.println("Price per Share: $" + sharePrices[i]);
                System.out.println("Stock Value: $" + stockValues[i]);
                System.out.println();
            }
            System.out.println("Total Value of Stocks: $" + totalValue);
        }
    }

