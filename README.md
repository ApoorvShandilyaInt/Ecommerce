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

Bill number is generate in database but unable to fetch when it call (checkout)
also after successfull checkout some unwanted entities add with null value(userId, ProductId and one extra price with 0)
