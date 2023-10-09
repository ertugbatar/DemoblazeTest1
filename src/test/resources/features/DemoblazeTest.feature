Feature: Testing Demoblaze.com

@wip
  Scenario: User can add an item to the cart
   *** Given the user is logged in ***
    Given User open the homepage
    When the user selects an item to add to the cart
    Then the item should be in the user's cart

  Scenario: User can place an order and complete a purchase
    Given User open the homepage
    When the user goes to the cart page
    And the_user_proceeds_to_checkout_and_confirms_the_order
    Then the user should have successfully placed an order and completed the purchase