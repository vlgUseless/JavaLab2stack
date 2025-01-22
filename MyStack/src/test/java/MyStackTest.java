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
}
