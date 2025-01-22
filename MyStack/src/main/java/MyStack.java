import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

public class MyStack<T> implements Iterable<T> {
    private final List<T> elements;

    public MyStack() {
        this.elements = new ArrayList<>();
    }

    /**
     * Добавляет элемент в верх стека.
     */
    public void push(T item) {
        elements.add(item);
    }

    /**
     * Извлекает верхний элемент стека.
     * @return верхний элемент
     * @throws EmptyStackException если стек пуст
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // удаляем элемент с конца списка (верх стека)
        return elements.removeLast();
    }

    /**
     * Возвращает верхний элемент стека, не удаляя его.
     * @return верхний элемент
     * @throws EmptyStackException если стек пуст
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.getLast();
    }

    /**
     * Проверяет, пуст ли стек.
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Возвращает текущий размер стека.
     */
    public int size() {
        return elements.size();
    }

    /**
     * Проверяет, содержится ли элемент в стеке.
     */
    public boolean contains(T item) {
        return elements.contains(item);
    }

    /**
     * Для соответствия требованиям:
     * Аналог push (добавляем элемент в стек).
     */
    public boolean add(T item) {}

    /**
     * Удаляет из стека первый встретившийся элемент.
     */
    public boolean remove(Object o) {}

    /**
     * Возвращает итератор по элементам стека (от первого добавленного к последнему).
     */
    @Override
    public Iterator<T> iterator() {}

    /**
     * Дополнительный метод, если нужно получить элемент по индексу.
     */
    public T get(int index) {}
}
