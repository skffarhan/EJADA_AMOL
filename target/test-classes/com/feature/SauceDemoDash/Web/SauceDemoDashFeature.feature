Feature: SaucesDemo TestCase

  Background: 
    Given Load "Sauce" TestData in Specific Excel Sheet"SauceDemo".
    When Navigate To Specific Portal : "WebURl"

  @ResourceName_Amol @High  @P1 @smoke @TC_001_SauceDemo
  Scenario: TC_001_SauceDemo
  
   Then Fill the "USERNAME" and "PASSWORD" and click on "Login" button in SauceDemo Login Page
   Then Verify that you’ve been logged in successfully and navigated to the products page "https://www.saucedemo.com/inventory.html"
   Then Select "product_sort_container" dropdown and option "Price (high to low)"  to Add the most expensive products to your cart.
   Then Add the most expensive two products "Sauce Labs Fleece Jacket" and "Sauce Labs Backpack" to Cart
   Then Click on  cart button
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/cart.html" page.
   Then Verify that the previously selected products "Sauce Labs Fleece Jacket" and "Sauce Labs Backpack" are displayed at the page.
   Then Click on the "checkout" button
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/checkout-step-one.html" page.
   Then Fill "FIRSTNAME" and "LASTNAME" and "POSTALCODE" on information page.
   Then Click on the continue button
   Then Verify that you’ve been navigated to the “Overview” page
   Then Verify the Items total amount before taxes for "Price (high to low)"
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/checkout-step-two.html" page.
   Then Click on the "finish" button
   Then Verify "Thank you for your order!" and "Your order has been dispatched, and will arrive just as fast as the pony can get there!" messages
  
  
   @ResourceName_Amol @High  @P1 @smoke @TC_002_SauceDemo
  Scenario: TC_002_SauceDemo
  
   Then Fill the "USERNAME" and "PASSWORD" and click on "Login" button in SauceDemo Login Page
   Then Verify that you’ve been logged in successfully and navigated to the products page "https://www.saucedemo.com/inventory.html"
   Then Select "product_sort_container" dropdown and option "Price (low to high)"  to Add the most expensive products to your cart.
   Then Add the less expensive two products "Sauce Labs Onesie" and "Sauce Labs Bike Light" to Cart
   Then Click on  cart button
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/cart.html" page.
   Then Verify that the previously selected products "Sauce Labs Onesie" and "Sauce Labs Bike Light" are displayed at the page.
   Then Click on the "checkout" button
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/checkout-step-one.html" page.
   Then Fill "FIRSTNAME" and "LASTNAME" and "POSTALCODE" on information page.
   Then Click on the continue button
   Then Verify that you’ve been navigated to the “Overview” page
   Then Verify the Items total amount before taxes for Price (low to high)
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/checkout-step-two.html" page.
   Then Click on the "finish" button
   Then Verify "Thank you for your order!" and "Your order has been dispatched, and will arrive just as fast as the pony can get there!" messages
  
    @ResourceName_Amol @High  @P1 @smoke @TC_003_SauceDemo
  Scenario: TC_003_SauceDemo
  
   Then Fill the "USERNAME" and "PASSWORD" and click on "Login" button in SauceDemo Login Page
   Then Verify that you’ve been logged in successfully and navigated to the products page "https://www.saucedemo.com/inventory.html"
   Then Select "product_sort_container" dropdown and option "Name (Z to A)"  to Add the most expensive products to your cart.
   Then Add Z to A  two products "Test.allTheThings() T-Shirt (Red)" and "Sauce Labs Onesie" to Cart
   Then Click on  cart button
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/cart.html" page.
   Then Verify that the previously selected products "Test.allTheThings() T-Shirt (Red)" and "Sauce Labs Onesie" are displayed at the page.
   Then Click on the "checkout" button
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/checkout-step-one.html" page.
   Then Fill "FIRSTNAME" and "LASTNAME" and "POSTALCODE" on information page.
   Then Click on the continue button
   Then Verify that you’ve been navigated to the “Overview” page
   Then Verify the Items total amount before taxes Name (Z to A)
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/checkout-step-two.html" page.
   Then Click on the "finish" button
   Then Verify "Thank you for your order!" and "Your order has been dispatched, and will arrive just as fast as the pony can get there!" messages
  
   
    @ResourceName_Amol @High  @P1 @smoke @TC_004_SauceDemo
  Scenario: TC_004_SauceDemo
  
   Then Fill the "USERNAME" and "PASSWORD" and click on "Login" button in SauceDemo Login Page
   Then Verify that you’ve been logged in successfully and navigated to the products page "https://www.saucedemo.com/inventory.html"
   Then Select "product_sort_container" dropdown and option "Name (A to Z)"  to Add the most expensive products to your cart.
   Then Add Name (A to Z)  two products "Sauce Labs Backpack" and "Sauce Labs Bike Light" to Cart
   Then Click on  cart button
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/cart.html" page.
   Then Verify that the previously selected products "Sauce Labs Backpack" and "Sauce Labs Bike Light" are displayed at the page.
   Then Click on the "checkout" button
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/checkout-step-one.html" page.
   Then Fill "FIRSTNAME" and "LASTNAME" and "POSTALCODE" on information page.
   Then Click on the continue button
   Then Verify that you’ve been navigated to the “Overview” page
   Then Verify the Items total amount before taxes Name (A to Z)
   Then Verify that you’ve been navigated to "https://www.saucedemo.com/checkout-step-two.html" page.
   Then Click on the "finish" button
   Then Verify "Thank you for your order!" and "Your order has been dispatched, and will arrive just as fast as the pony can get there!" messages
  