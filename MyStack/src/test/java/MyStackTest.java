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
}
