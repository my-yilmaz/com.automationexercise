Feature: TC08 Verify all products and product detail page
  @products
  Scenario: TC08 Verify all products and product detail page
    Given Navigate to url "automationexerciseUrl"
     * Verify that home page is visible successfully
     * Click on Products button
     * Verify user is navigated to ALL PRODUCTS page successfully
     * The products list is visible
     * Click on View Product of first product
     * User is landed to product detail page
     * Verify that detail detail is visible: product name, category, price, availability, condition, brand