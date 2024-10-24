Feature: Adds a Product to the Cart

Scenario Outline: Select a Product and add to the cart
Given user launches the url
When user logs in to the account
And user selects any category product from menu
Then user should be able to navigate to products page
When user selects any product and click on the product
And user should select the size and colour of the product
And user click on add to cart and click on cart img
And user click on click on view and edit cart
Then user validate the success msg of product added to cart

Scenario Outline: Select a Product and add to wish list
Given user launches the url
When user logs in to the account
And user selects any category product from menu
Then user should be able to navigate to products page
When user selects any product and click on the product
And user click on add to wishlist
Then use validate the success msg of product added to wishlist


