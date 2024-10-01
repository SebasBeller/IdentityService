package com.example.examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentityServiceTest {

    @Test
    @DisplayName("Verify an existent ci")
    void verifyExistence() {
        //arrange
        IdentityService identityService = new IdentityService();
        //act
        boolean response=identityService.verifyExistence(1);
        //ASSERT
        assertEquals(response, true);
    }
    @Test
    @DisplayName("Verify an not existent ci")
    void verifyUnExistence() {
        //arrange
        IdentityService identityService = new IdentityService();
        //act
        boolean response=identityService.verifyExistence(10);
        //ASSERT
        assertEquals(response, false);
    }
}