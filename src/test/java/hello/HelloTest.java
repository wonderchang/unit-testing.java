package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    public void sayHelloTo() {
        Hello hello = new Hello();
        String message = hello.sayHelloTo("Wonder and Shelley");
        assertEquals("Hello, Wonder and Shelley!", message);
    }

}

// vi:et:ts=4:sw=4:cc=80
