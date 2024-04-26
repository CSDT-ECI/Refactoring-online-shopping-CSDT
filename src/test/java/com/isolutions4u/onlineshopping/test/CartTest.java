package com.isolutions4u.onlineshopping.test;

import com.isolutions4u.onlineshopping.model.Cart;
import com.isolutions4u.onlineshopping.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CartTest {

    private Cart cart;

    @BeforeEach
    public void setUp() {
        cart = new Cart();
    }

    @Test
    @DisplayName("setId_StateUnderTest_ExpectedBehavior")
    public void setId_CartId_CorrectIdSet() {
        // Arrange
        int id = 1;

        // Act
        cart.setId(id);

        // Assert
        assertEquals(id, cart.getId(), "Cart ID should be set correctly");
    }

    @Test
    @DisplayName("setGrandTotal_StateUnderTest_ExpectedBehavior")
    public void setGrandTotal_CartGrandTotal_CorrectGrandTotalSet() {
        // Arrange
        double grandTotal = 100.0;

        // Act
        cart.setGrandTotal(grandTotal);

        // Assert
        assertEquals(grandTotal, cart.getGrandTotal(), "Cart grand total should be set correctly");
    }

    @Test
    @DisplayName("setCartLines_StateUnderTest_ExpectedBehavior")
    public void setCartLines_CartLines_CorrectCartLinesSet() {
        // Arrange
        int cartLines = 5;

        // Act
        cart.setCartLines(cartLines);

        // Assert
        assertEquals(cartLines, cart.getCartLines(), "Cart lines should be set correctly");
    }

    @Test
    @DisplayName("setUser_StateUnderTest_ExpectedBehavior")
    public void setUser_User_CorrectUserSet() {
        // Arrange
        User user = new User();

        // Act
        cart.setUser(user);

        // Assert
        assertNotNull(cart.getUser(), "User should be set correctly in the cart");
    }
}