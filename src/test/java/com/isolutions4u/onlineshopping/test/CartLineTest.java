package com.isolutions4u.onlineshopping.test;
import com.isolutions4u.onlineshopping.model.CartLine;
import com.isolutions4u.onlineshopping.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CartLineTest {

    private CartLine cartLine;

    @BeforeEach
    public void setUp() {
        cartLine = new CartLine();
    }

    @Test
    @DisplayName("setId_StateUnderTest_ExpectedBehavior")
    public void setId_CartLineId_CorrectIdSet() {
        // Arrange
        int id = 1;

        // Act
        cartLine.setId(id);

        // Assert
        assertEquals(id, cartLine.getId(), "CartLine ID should be set correctly");
    }

    @Test
    @DisplayName("setCartId_StateUnderTest_ExpectedBehavior")
    public void setCartId_CartId_CorrectCartIdSet() {
        // Arrange
        int cartId = 1;

        // Act
        cartLine.setCartId(cartId);

        // Assert
        assertEquals(cartId, cartLine.getCartId(), "Cart ID should be set correctly");
    }

    @Test
    @DisplayName("setTotal_StateUnderTest_ExpectedBehavior")
    public void setTotal_CartLineTotal_CorrectTotalSet() {
        // Arrange
        double total = 100.0;

        // Act
        cartLine.setTotal(total);

        // Assert
        assertEquals(total, cartLine.getTotal(), "CartLine total should be set correctly");
    }

    @Test
    @DisplayName("setProductCount_StateUnderTest_ExpectedBehavior")
    public void setProductCount_CartLineProductCount_CorrectProductCountSet() {
        // Arrange
        int productCount = 5;

        // Act
        cartLine.setProductCount(productCount);

        // Assert
        assertEquals(productCount, cartLine.getProductCount(), "CartLine product count should be set correctly");
    }

    @Test
    @DisplayName("setBuyingPrice_StateUnderTest_ExpectedBehavior")
    public void setBuyingPrice_CartLineBuyingPrice_CorrectBuyingPriceSet() {
        // Arrange
        double buyingPrice = 50.0;

        // Act
        cartLine.setBuyingPrice(buyingPrice);

        // Assert
        assertEquals(buyingPrice, cartLine.getBuyingPrice(), "CartLine buying price should be set correctly");
    }

    @Test
    @DisplayName("setAvailable_StateUnderTest_ExpectedBehavior")
    public void setAvailable_CartLineAvailability_CorrectAvailabilitySet() {
        // Arrange
        boolean available = true;

        // Act
        cartLine.setAvailable(available);

        // Assert
        assertEquals(available, cartLine.isAvailable(), "CartLine availability should be set correctly");
    }

    @Test
    @DisplayName("setProduct_StateUnderTest_ExpectedBehavior")
    public void setProduct_CartLineProduct_CorrectProductSet() {
        // Arrange
        Product product = new Product();

        // Act
        cartLine.setProduct(product);

        // Assert
        assertNotNull(cartLine.getProduct(), "Product should be set correctly in the cart line");
    }
}