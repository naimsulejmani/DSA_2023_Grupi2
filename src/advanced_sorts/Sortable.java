package advanced_sorts;

// Single Abstract Method - SAM Interface
// Functional Interface
@FunctionalInterface
public interface Sortable<T extends Comparable<T>> {
    void sort(T[] array);
}
