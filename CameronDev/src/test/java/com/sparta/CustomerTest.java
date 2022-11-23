package com.sparta;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    @DisplayName("Testing equals and hashcode contracts")
    public void equalsHashCodeContracts() {
        EqualsVerifier.simple().forClass(Customer.class).withNonnullFields("firstName","lastName").verify();
    }

}