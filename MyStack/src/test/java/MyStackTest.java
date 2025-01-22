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
}
