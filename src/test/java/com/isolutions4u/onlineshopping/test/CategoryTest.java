package com.isolutions4u.onlineshopping.test;
import com.isolutions4u.onlineshopping.model.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CategoryTest {

    private Category category;

    @BeforeEach
    public void setUp() {
        category = new Category();
    }

    @Test
    @DisplayName("setId_StateUnderTest_ExpectedBehavior")
    public void setId_CategoryId_CorrectIdSet() {
        // Arrange
        int id = 1;

        // Act
        category.setId(id);

        // Assert
        assertEquals(id, category.getId(), "Category ID should be set correctly");
    }

    @Test
    @DisplayName("setName_StateUnderTest_ExpectedBehavior")
    public void setName_CategoryName_CorrectNameSet() {
        // Arrange
        String name = "Electronics";

        // Act
        category.setName(name);

        // Assert
        assertEquals(name, category.getName(), "Category name should be set correctly");
    }

    @Test
    @DisplayName("setDescription_StateUnderTest_ExpectedBehavior")
    public void setDescription_CategoryDescription_CorrectDescriptionSet() {
        // Arrange
        String description = "Electronics category description";

        // Act
        category.setDescription(description);

        // Assert
        assertEquals(description, category.getDescription(), "Category description should be set correctly");
    }

    @Test
    @DisplayName("setImageUrl_StateUnderTest_ExpectedBehavior")
    public void setImageUrl_CategoryImageUrl_CorrectImageUrlSet() {
        // Arrange
        String imageUrl = "http://example.com/electronics.jpg";

        // Act
        category.setImageUrl(imageUrl);

        // Assert
        assertEquals(imageUrl, category.getImageUrl(), "Category image URL should be set correctly");
    }

    @Test
    @DisplayName("setActive_StateUnderTest_ExpectedBehavior")
    public void setActive_CategoryActiveStatus_CorrectActiveStatusSet() {
        // Arrange
        boolean active = true;

        // Act
        category.setActive(active);

        // Assert
        assertEquals(active, category.isActive(), "Category active status should be set correctly");
    }

    @Test
    @DisplayName("toString_StateUnderTest_ExpectedBehavior")
    public void toString_CategoryString_CorrectStringRepresentation() {
        // Arrange
        category.setId(1);
        category.setName("Electronics");
        category.setDescription("Electronics category description");
        category.setImageUrl("http://example.com/electronics.jpg");
        category.setActive(true);

        // Act
        String categoryString = category.toString();

        // Assert
        assertNotNull(categoryString, "Category toString should not be null");
    }
}