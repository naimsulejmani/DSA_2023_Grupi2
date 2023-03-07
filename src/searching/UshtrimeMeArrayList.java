package searching;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

public class UshtrimeMeArrayList {
    public static void main(String[] args) {
        ArrayList qanta = new ArrayList();
        qanta.add("Kimik");
        qanta.add("Laptop");
        qanta.add(10);
        qanta.add(20f);
        qanta.add(30.0D);
        qanta.add(true);
        qanta.add('A');
        qanta.add(LocalDate.now());
        qanta.add(LocalDateTime.now());
        qanta.add(LocalTime.now());

        String el1 = qanta.get(0).toString();
        String el2 = (String) qanta.get(1);
        int el3 = (int) qanta.get(2);
        System.out.println(el1);
        System.out.println(el2);
        System.out.println(el3);
        qanta.add(0, "Mausin");

        System.out.println("-------------------------");
        for (Object item : qanta) {
            System.out.println(item);
        }

        qanta.remove("Laptop");
        qanta.remove(0);

        System.out.println(qanta.contains("Kimik"));

        qanta.clear();
    }
}
