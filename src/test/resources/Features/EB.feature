Feature: Purchasing a product from Eddie Bauer site

  Scenario Outline: Purchase a product from Eddie Bauer site and generate the order ID
    Given User is on Eddie Bauer Home page
    When User clicks on Settings option and clicks sign in and enters "<email>" and "<pwd>" and click on Sign in button
    When User searches "<product>" in search bar
    And User nagivates to product list page,selects a product 
    And User selects the color and "<size>" and clicks on Add to Bag
    When User nagivates to payment page and completes payment
    Then Order is placed and Order ID is generated
    
    
    
   

    Examples: 
      | email                | pwd         | product | size| 
      | vivek.msc39@gmail.com | Clothes@123 | shirt    |XL|
      | vivek.msc39@gmail.com | Clothes@123 | jacket    |XL|
