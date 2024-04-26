package com.isolutions4u.onlineshopping.test;
import com.isolutions4u.onlineshopping.model.Cart;
import com.isolutions4u.onlineshopping.model.UserModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserModelTest {

    private UserModel userModel;

    @BeforeEach
    public void setUp() {
        userModel = new UserModel();
    }

    @Test
    @DisplayName("setId_StateUnderTest_ExpectedBehavior")
    public void setId_Id_CorrectIdSet() {
        // Arrange
        int id = 1;

        // Act
        userModel.setId(id);

        // Assert
        assertEquals(id, userModel.getId(), "Id should be set correctly");
    }

    @Test
    @DisplayName("setFullName_StateUnderTest_ExpectedBehavior")
    public void setFullName_FullName_CorrectFullNameSet() {
        // Arrange
        String fullName = "John Doe";

        // Act
        userModel.setFullName(fullName);

        // Assert
        assertEquals(fullName, userModel.getFullName(), "Full name should be set correctly");
    }

    @Test
    @DisplayName("setEmail_StateUnderTest_ExpectedBehavior")
    public void setEmail_Email_CorrectEmailSet() {
        // Arrange
        String email = "john.doe@example.com";

        // Act
        userModel.setEmail(email);

        // Assert
        assertEquals(email, userModel.getEmail(), "Email should be set correctly");
    }

    @Test
    @DisplayName("setRole_StateUnderTest_ExpectedBehavior")
    public void setRole_Role_CorrectRoleSet() {
        // Arrange
        String role = "ROLE_USER";

        // Act
        userModel.setRole(role);

        // Assert
        assertEquals(role, userModel.getRole(), "Role should be set correctly");
    }

    @Test
    @DisplayName("setCart_StateUnderTest_ExpectedBehavior")
    public void setCart_Cart_CorrectCartSet() {
        // Arrange
        Cart cart = new Cart();

        // Act
        userModel.setCart(cart);

        // Assert
        assertNotNull(userModel.getCart(), "Cart should be set correctly");
        assertEquals(cart, userModel.getCart(), "Cart object should be set correctly");
    }
}