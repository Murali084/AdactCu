Feature: Booking a room in Adactin Hotel page

  Scenario Outline: Book a room and print the order details
    Given User is on Adactin home page
    When User logs in with "<uname>" and "<pwd>"
    Then User clicks the login button and logs in
    Then User selects "<Loc>","<Hotels>","<Room Type>","<No of rooms>","<Check in>","<Check out>","<Adults>","<Childs>" and click Search button
    Then User selects the Hotel from list of options and clicks continue and navigates to Booking page
    Then User Enters "<Fname>","<Lname>","<Address>","<Card no>","<Card type>","<Exp mon>","<Exp yr>","<Cvv>" and clicks on Book now
    And User navigates to Booking confirmation page and prints the Order no

    Examples: 
      | uname | pwd |Loc|Hotels|Room Type|No of rooms|Check in|Check out|Adults|Childs|Fname|Lname|Address|Card no|Card type|Exp mon|Exp yr|Cvv|
      | Murali26 | Control@8009 |Sydney|Hotel Sunshine|Double|2 - Two|20/12/2019|22/12/2019|2 - Two|1 - One|Murali|M|No.59, 2nd cross, Rue de statue,Sydney|1234567899874561|VISA|April|2021|789|
      
