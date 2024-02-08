# Ecommerce

### Functional APIs
* Register user: http://localhost:8080/user
* Retrieve User by userId : http://localhost:8080/user/{id}
* Retrieve All Users : http://localhost:8080/user
* Update User by userId : http://localhost:8080/user/{id}
* Delete User by userId : http://localhost:8080/user/{id}
* User Login : http://localhost:8080/user/login
* User logout : http://localhost:8080/user/logout

* Create Product : http://localhost:8080/user/product
* Retrieve Product by ID : http://localhost:8080/user/product/{id}
* Retrieve All Products : http://localhost:8080/user/product
* Update Product by productId : http://localhost:8080/user/product/{id}
* Delete Product by productId : http://localhost:8080/user/product/{id}

* Add to Cart : http://localhost:8080/user/cart/{productId}
* Retrieve Cart : http://localhost:8080/user/cart/{userId}
* Update cart by cartId : http://localhost:8080/user/cart/{cartId}
* Delete Cart Item : http://localhost:8080/user/cart/{cartId}

* checkout : http://localhost:8080/user/checkout

### Non-Functional APIs

* delivery address  : http://localhost:8080/user/delivery
* retrive address : http://localhost:8080/user/delivery

### Note

Some issue is created after checkout

{
    "name": "Apoorv Shandilya",
    "mobileNumber": 7475783632,
    "dateTime": "2024-02-08T13:02:24.0007774",
    "cartItems": [
        {
            "userId": null,--------------------------userId and producdId should not be here
            "productId": null,--------------------------------------------------------------
            "quantity": 4,
            "productPrice": 10,
            "totalPrice": 40,
            "productName": "Linc Pen",
            "price": 0------------this price should not be reflrct here for all cart's product
        },
        {
            "userId": null,--------------------------------------------------------------------
            "productId": null,-----------------------------------------------------------------
            "quantity": 5,
            "productPrice": 20,
            "totalPrice": 100,
            "productName": "Sprite",
            "price": 0-------------------------------------------------------------------------
        },
        {
            "userId": null,--------------------------------------------------------------------
            "productId": null,-----------------------------------------------------------------
            "quantity": 50,
            "productPrice": 30,
            "totalPrice": 1500,
            "productName": "Cofee",
            "price": 0-------------------------------------------------------------------------
        }
    ],
    "totalPrice": 1640,
    "billId": null-------------------------------------------------------this should not be null
                                                             unable to fetch  value form database
}
