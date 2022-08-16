package trade_transaction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TransactionData {
    public static List<Transaction> getAll() {
        Trader raul = new Trader("Raul","Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader allie = new Trader("Allie", "Cambridge");
        Trader brenda = new Trader("Brenda", "Cambridge");
        return Arrays.asList(
                new Transaction(brenda,2011,300),
                new Transaction(raul,2012,1000),
                new Transaction(raul,2011,400),
                new Transaction(mario,2012,500),
                new Transaction(raul,2022,700),
                new Transaction(allie,2019,3300),
                new Transaction(raul,2020,4300)
                );
    }
}
