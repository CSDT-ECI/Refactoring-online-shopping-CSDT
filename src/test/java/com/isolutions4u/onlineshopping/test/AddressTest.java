package com.isolutions4u.onlineshopping.test;

import com.isolutions4u.onlineshopping.model.Address;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @Test
    public void setAddressLineOne_ValidAddressLineOne_Success() {
        // Arrange
        Address address = new Address();

        // Act
        address.setAddressLineOne("123 Main Street");

        // Assert
        assertEquals("123 Main Street", address.getAddressLineOne());
    }

    @Test
    public void setAddressLineTwo_ValidAddressLineTwo_Success() {
        // Arrange
        Address address = new Address();

        // Act
        address.setAddressLineTwo("Apt 456");

        // Assert
        assertEquals("Apt 456", address.getAddressLineTwo());
    }

    @Test
    public void setCity_ValidCity_Success() {
        // Arrange
        Address address = new Address();

        // Act
        address.setCity("New York");

        // Assert
        assertEquals("New York", address.getCity());
    }

    @Test
    public void setState_ValidState_Success() {
        // Arrange
        Address address = new Address();

        // Act
        address.setState("NY");

        // Assert
        assertEquals("NY", address.getState());
    }

    @Test
    public void setCountry_ValidCountry_Success() {
        // Arrange
        Address address = new Address();

        // Act
        address.setCountry("USA");

        // Assert
        assertEquals("USA", address.getCountry());
    }

    @Test
    public void setPostalCode_ValidPostalCode_Success() {
        // Arrange
        Address address = new Address();

        // Act
        address.setPostalCode("10001");

        // Assert
        assertEquals("10001", address.getPostalCode());
    }

    @Test
    public void setShipping_ValidShipping_Success() {
        // Arrange
        Address address = new Address();

        // Act
        address.setShipping(true);

        // Assert
        assertTrue(address.isShipping());
    }

    @Test
    public void setBilling_ValidBilling_Success() {
        // Arrange
        Address address = new Address();

        // Act
        address.setBilling(true);

        // Assert
        assertTrue(address.isBilling());
    }
}
