package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {
    IsUnique isUnique = new IsUnique();

    @Test
    void isUnique(){
        isUnique.checkIsUnique("Goldman Sachs");
    }

    @Test
    void testIsUnique() {
        assertAll("",
                () -> Assertions.assertTrue(isUnique.checkIsUnique("Method")),
                () -> Assertions.assertFalse(isUnique.checkIsUnique("Advanced"))
        );


    }
}