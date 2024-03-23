package com.lingh;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledInNativeImage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionLevelTest {
    @Test
    @EnabledInNativeImage
    void testOnFunction() {
        assertEquals(1 + 2, 3);
    }
}
