package com.isolutions4u.onlineshopping.test;
import com.isolutions4u.onlineshopping.model.Address;
import com.isolutions4u.onlineshopping.model.RegisterModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RegisterModelTest {

    private RegisterModel registerModel;

    @BeforeEach
    public void setUp() {
        registerModel = new RegisterModel();
    }


    @Test
    @DisplayName("setBilling_StateUnderTest_ExpectedBehavior")
    public void setBilling_AddressObject_CorrectBillingAddressSet() {
        // Arrange
        Address billingAddress = new Address();
        billingAddress.setAddressLineOne("123 Main St");
        billingAddress.setCity("New York");
        billingAddress.setCountry("USA");

        // Act
        registerModel.setBilling(billingAddress);

        // Assert
        assertNotNull(registerModel.getBilling(), "Billing address should be set correctly");
        assertEquals(billingAddress, registerModel.getBilling(), "Billing address object should be set correctly");
    }
}