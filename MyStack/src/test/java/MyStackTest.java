import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    private MyStack<Integer> myStack;
    private Stack<Integer> javaStack;

    @BeforeEach
    void setUp() {
        // Инициализируем перед каждым тестом
        myStack = new MyStack<>();
        javaStack = new Stack<>();
    }

    @Test
    @DisplayName("Проверка push и сравнение с java.util.Stack")
    void testPush() {
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        javaStack.push(10);
        javaStack.push(20);
        javaStack.push(30);

        // Сравниваем размеры
        assertEquals(javaStack.size(), myStack.size());

        // Сравним верхние элементы
        assertEquals(javaStack.peek(), myStack.peek());
    }

    @Test
    @DisplayName("Проверка pop и сравнение с java.util.Stack")
    void testPop() {
        myStack.push(1);
        myStack.push(2);

        javaStack.push(1);
        javaStack.push(2);

        // Сначала удалим верхний элемент и сравним
        assertEquals(javaStack.pop(), myStack.pop());
        // И второй
        assertEquals(javaStack.pop(), myStack.pop());

        // Проверим, что оба стека теперь пустые
        assertTrue(myStack.isEmpty());
        assertTrue(javaStack.isEmpty());

        // Убедимся, что при pop из пустого стека бросается EmptyStackException
        assertThrows(EmptyStackException.class, () -> myStack.pop());
        assertThrows(EmptyStackException.class, () -> javaStack.pop());
    }

    @Test
    @DisplayName("Проверка isEmpty и size")
    void testIsEmptyAndSize() {
        // Изначально пустые
        assertTrue(myStack.isEmpty());
        assertTrue(javaStack.isEmpty());
        assertEquals(javaStack.size(), myStack.size());

        // Добавим элемент
        myStack.push(999);
        javaStack.push(999);

        // Теперь оба стека не пустые
        assertFalse(myStack.isEmpty());
        assertFalse(javaStack.isEmpty());
        assertEquals(javaStack.size(), myStack.size());

        // Удалим элемент
        myStack.pop();
        javaStack.pop();

        // Снова должны быть пустые
        assertTrue(myStack.isEmpty());
        assertTrue(javaStack.isEmpty());
    }

    @Test
    @DisplayName("Проверка contains")
    void testContains() {
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        javaStack.push(10);
        javaStack.push(20);
        javaStack.push(30);

        // Проверяем присутствие
        assertEquals(javaStack.contains(10), myStack.contains(10));
        assertEquals(javaStack.contains(20), myStack.contains(20));
        assertEquals(javaStack.contains(30), myStack.contains(30));

        // Проверяем отсутствие
        assertEquals(javaStack.contains(40), myStack.contains(40));
    }

}
