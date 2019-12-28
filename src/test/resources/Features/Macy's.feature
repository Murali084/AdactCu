Feature: Purchasing a product from Macy's webpage

  Scenario Outline: Purchase a watch from Macy's webpage and generate the order ID
    Given User is on Macy's Home page
    When User clicks on Sign In option and enters "<email>" and "<pwd>" and click on Sign in button
    When User searches "<prodName>" in search bar
    And User selects the specified product from list of options and clicks Add to Bag
    And User nagivates to Checkout page and clicks on View Bag & Checkout button
    Then User nagivates to payment page and proceed with payment options and order ID is generated
    
   

    Examples: 
      | email                | pwd         | prodName |
      | dharani084@gmail.com | Murali@2621 | watch    |
      | dharani084@gmail.com | Murali@2621 | belt     |
