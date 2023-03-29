package adts;

import java.time.LocalDate;

public class TransactionTest {
    public static void main(String[] args) {
        Transaction aldiTransaction =
                new Transaction("Aldi", LocalDate.now(), 22.45);
        System.out.println(aldiTransaction);

        Transaction blendiTransaction =
                new Transaction("Blendi", LocalDate.of(2023, 1, 1), 50);
        System.out.println(blendiTransaction);

        System.out.println(aldiTransaction.compareTo(blendiTransaction));
        System.out.println(blendiTransaction.compareTo(aldiTransaction));

        Transaction profaTransaction = new Transaction("Profa;2023-03-29;65");
        System.out.println(profaTransaction.who());
        System.out.println(profaTransaction.when());
        System.out.println(profaTransaction.amount());
        System.out.println(profaTransaction);

        Transaction t1 = new Transaction("Ardit;Gjukaj;2023-01-01;76");
        System.out.println(t1);

    }
}









