package com.isolutions4u.onlineshopping.test;
import com.isolutions4u.onlineshopping.model.Cart;
import com.isolutions4u.onlineshopping.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    @DisplayName("setFirstName_StateUnderTest_ExpectedBehavior")
    public void setFirstName_ValidFirstName_CorrectFirstNameSet() {
        // Arrange
        String firstName = "John";

        // Act
        user.setFirstName(firstName);

        // Assert
        assertNotNull(user.getFirstName(), "First name should not be null");
        assertEquals(firstName, user.getFirstName(), "First name should be set correctly");
    }

    @Test
    @DisplayName("setLastName_StateUnderTest_ExpectedBehavior")
    public void setLastName_ValidLastName_CorrectLastNameSet() {
        // Arrange
        String lastName = "Doe";

        // Act
        user.setLastName(lastName);

        // Assert
        assertNotNull(user.getLastName(), "Last name should not be null");
        assertEquals(lastName, user.getLastName(), "Last name should be set correctly");
    }

    @Test
    @DisplayName("setEmail_StateUnderTest_ExpectedBehavior")
    public void setEmail_ValidEmail_CorrectEmailSet() {
        // Arrange
        String email = "john.doe@example.com";

        // Act
        user.setEmail(email);

        // Assert
        assertNotNull(user.getEmail(), "Email should not be null");
        assertEquals(email, user.getEmail(), "Email should be set correctly");
    }

    @Test
    @DisplayName("setContactNumber_StateUnderTest_ExpectedBehavior")
    public void setContactNumber_ValidContactNumber_CorrectContactNumberSet() {
        // Arrange
        String contactNumber = "1234567890";

        // Act
        user.setContactNumber(contactNumber);

        // Assert
        assertNotNull(user.getContactNumber(), "Contact number should not be null");
        assertEquals(contactNumber, user.getContactNumber(), "Contact number should be set correctly");
    }

    @Test
    @DisplayName("setPassword_StateUnderTest_ExpectedBehavior")
    public void setPassword_ValidPassword_CorrectPasswordSet() {
        // Arrange
        String password = "password123";

        // Act
        user.setPassword(password);

        // Assert
        assertNotNull(user.getPassword(), "Password should not be null");
        assertEquals(password, user.getPassword(), "Password should be set correctly");
    }

    @Test
    @DisplayName("setEnabled_StateUnderTest_ExpectedBehavior")
    public void setEnabled_Boolean_CorrectEnabledSet() {
        // Arrange
        boolean enabled = false;

        // Act
        user.setEnabled(enabled);

        // Assert
        assertEquals(enabled, user.isEnabled(), "Enabled status should be set correctly");
    }

    @Test
    @DisplayName("setCart_StateUnderTest_ExpectedBehavior")
    public void setCart_CartObject_CorrectCartSet() {
        // Arrange
        Cart cart = new Cart();

        // Act
        user.setCart(cart);

        // Assert
        assertNotNull(user.getCart(), "Cart should not be null");
        assertEquals(cart, user.getCart(), "Cart object should be set correctly");
    }
}