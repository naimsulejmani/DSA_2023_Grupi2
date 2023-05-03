package hashtables;

import java.time.LocalDate;

public class TestHashCode {
    public static void main(String[] args) {
        CounterTerrorist babaQer =
                new CounterTerrorist(7, "babaQer", LocalDate.now(), 0.15f);
        CounterTerrorist anhilation =
                new CounterTerrorist(7, "babaQer", LocalDate.now(), 0.15f);

        System.out.println(babaQer.equals(anhilation));
        System.out.println(babaQer.hashCode() == anhilation.hashCode());
        System.out.println(babaQer.hashCode());
        System.out.println("naim".hashCode());
        System.out.println("nikolin".hashCode());
        System.out.println("taulanti".hashCode());

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(hash(Integer.MIN_VALUE, 16));
        System.out.println(hash(Integer.MIN_VALUE + 1, 16));
    }

    public static int hash(int hashCode, int modulus) {
        return (hashCode & 0x7FFFFFFF) % modulus;
    }
}
