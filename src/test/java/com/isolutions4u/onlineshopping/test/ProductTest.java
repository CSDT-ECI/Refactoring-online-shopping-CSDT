package com.isolutions4u.onlineshopping.test;
import com.isolutions4u.onlineshopping.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    @DisplayName("setId_StateUnderTest_ExpectedBehavior")
    public void setId_ProductId_CorrectIdSet() {
        // Arrange
        int id = 1;

        // Act
        product.setId(id);

        // Assert
        assertEquals(id, product.getId(), "Product ID should be set correctly");
    }

    @Test
    @DisplayName("setName_StateUnderTest_ExpectedBehavior")
    public void setName_ProductName_CorrectNameSet() {
        // Arrange
        String name = "Laptop";

        // Act
        product.setName(name);

        // Assert
        assertEquals(name, product.getName(), "Product name should be set correctly");
    }

    @Test
    @DisplayName("setBrand_StateUnderTest_ExpectedBehavior")
    public void setBrand_ProductBrand_CorrectBrandSet() {
        // Arrange
        String brand = "Dell";

        // Act
        product.setBrand(brand);

        // Assert
        assertEquals(brand, product.getBrand(), "Product brand should be set correctly");
    }

    @Test
    @DisplayName("setDescription_StateUnderTest_ExpectedBehavior")
    public void setDescription_ProductDescription_CorrectDescriptionSet() {
        // Arrange
        String description = "Powerful laptop with high-performance specs";

        // Act
        product.setDescription(description);

        // Assert
        assertEquals(description, product.getDescription(), "Product description should be set correctly");
    }

    @Test
    @DisplayName("setUnitPrice_StateUnderTest_ExpectedBehavior")
    public void setUnitPrice_ProductUnitPrice_CorrectUnitPriceSet() {
        // Arrange
        double unitPrice = 999.99;

        // Act
        product.setUnitPrice(unitPrice);

        // Assert
        assertEquals(unitPrice, product.getUnitPrice(), 0.001, "Product unit price should be set correctly");
    }

    @Test
    @DisplayName("setQuantity_StateUnderTest_ExpectedBehavior")
    public void setQuantity_ProductQuantity_CorrectQuantitySet() {
        // Arrange
        int quantity = 10;

        // Act
        product.setQuantity(quantity);

        // Assert
        assertEquals(quantity, product.getQuantity(), "Product quantity should be set correctly");
    }

    @Test
    @DisplayName("setActive_StateUnderTest_ExpectedBehavior")
    public void setActive_ProductActiveStatus_CorrectActiveStatusSet() {
        // Arrange
        boolean active = true;

        // Act
        product.setActive(active);

        // Assert
        assertEquals(active, product.isActive(), "Product active status should be set correctly");
    }

    @Test
    @DisplayName("setCategoryId_StateUnderTest_ExpectedBehavior")
    public void setCategoryId_ProductCategoryId_CorrectCategoryIdSet() {
        // Arrange
        int categoryId = 2;

        // Act
        product.setCategoryId(categoryId);

        // Assert
        assertEquals(categoryId, product.getCategoryId(), "Product category ID should be set correctly");
    }

    @Test
    @DisplayName("setSupplierId_StateUnderTest_ExpectedBehavior")
    public void setSupplierId_ProductSupplierId_CorrectSupplierIdSet() {
        // Arrange
        int supplierId = 3;

        // Act
        product.setSupplierId(supplierId);

        // Assert
        assertEquals(supplierId, product.getSupplierId(), "Product supplier ID should be set correctly");
    }

    @Test
    @DisplayName("setPurchases_StateUnderTest_ExpectedBehavior")
    public void setPurchases_ProductPurchases_CorrectPurchasesSet() {
        // Arrange
        int purchases = 50;

        // Act
        product.setPurchases(purchases);

        // Assert
        assertEquals(purchases, product.getPurchases(), "Product purchases should be set correctly");
    }

    @Test
    @DisplayName("setViews_StateUnderTest_ExpectedBehavior")
    public void setViews_ProductViews_CorrectViewsSet() {
        // Arrange
        int views = 100;

        // Act
        product.setViews(views);

        // Assert
        assertEquals(views, product.getViews(), "Product views should be set correctly");
    }

    @Test
    @DisplayName("toString_StateUnderTest_ExpectedBehavior")
    public void toString_ProductString_CorrectStringRepresentation() {
        // Arrange
        product.setId(1);
        product.setName("Laptop");
        product.setBrand("Dell");
        product.setDescription("Powerful laptop with high-performance specs");
        product.setUnitPrice(999.99);
        product.setQuantity(10);
        product.setActive(true);
        product.setCategoryId(2);
        product.setSupplierId(3);
        product.setPurchases(50);
        product.setViews(100);

        // Act
        String productString = product.toString();

        // Assert
        assertNotNull(productString, "Product toString should not be null");
    }
}