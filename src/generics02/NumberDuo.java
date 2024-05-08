package generics02;

public class NumberDuo<E extends Number> {
    private E first;
    private E second;

    public NumberDuo(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void swap() {
        E temp = second;
        second = first;
        first = temp;
    }
}
