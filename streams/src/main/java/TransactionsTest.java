import org.testng.annotations.Test;
import trade_transaction.Trader;
import trade_transaction.Transaction;
import trade_transaction.TransactionData;

import java.util.Comparator;

public class TransactionsTest {

    @Test
    public void example1() {//1- Find all transactions in 2011 and sort by value
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
    }

    @Test
    public void example2() {//2- What are all the unique cities where the traders work?
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

    }

    @Test
    public void example3() {//3- Find all traders from Cambridge and sort them by name
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
    }

    @Test
    public void example4() {//4- Display all traders name in a single string sorted alphabetically
        System.out.println(
                TransactionData.getAll().stream()
                        .map(Transaction::getTrader)
                        .distinct()
                        .map(Trader::getName)
                        .sorted()
                        .reduce("", (a, b) -> a + b + " ")
        );

    }

    @Test
    public void example5() {//5- Display any trader that is based in Milan
        System.out.println(
                TransactionData.getAll().stream()
                        .map(Transaction::getTrader)
                        .distinct()
                        .filter(trader -> trader.getCity().equals("Milan"))
                        .findAny()
                        .get()
        );

    }

    @Test
    public void example6(){//6- Were any transactions made by a trader in Milan?
        boolean transactionMadeInMilanWasFound = TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .anyMatch(city -> city.equals("Milan"));
        System.out.println(transactionMadeInMilanWasFound);
    }

    @Test
    public void example7() {//7-What is the highest value of all transactions
        int highestValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(0, (a,b) -> a > b ? a : b );

        System.out.println(highestValue);

        highestValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                        .get();

        System.out.println(highestValue);
    }

    @Test
    public void example8(){//Find the transaction with the smallest value
        System.out.println(
                TransactionData.getAll().stream()
                .reduce((tr1, tr2) -> tr1.getValue() < tr2.getValue() ? tr1 : tr2)
                .get()
        );

        System.out.println(
                TransactionData.getAll().stream()
                        .min(Comparator.comparing(Transaction::getValue))
                        .get()
        );

    }

}
