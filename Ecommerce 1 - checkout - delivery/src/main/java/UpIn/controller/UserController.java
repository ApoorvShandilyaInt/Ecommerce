// package UpIn.controller;

// import java.util.List;
// import java.util.Optional;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// // import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import UpIn.dto.CartDto;
// import UpIn.dto.UserDtoLogin;
// import UpIn.entity.Cart;
// import UpIn.entity.Product;
// import UpIn.entity.User;
// import UpIn.service.CartService;
// import UpIn.service.ProductService;
// import UpIn.service.UserService;
// import lombok.AllArgsConstructor;

// @RequestMapping("/user")
// @AllArgsConstructor
// @RestController
// public class UserController
// {
    
//     public UserService userService;
//     public  ProductService productService;
//     public CartService cartService;
    

//     // User Registration.
//     @PostMapping
//     public ResponseEntity<User> createUser(@RequestBody User user)
//     {
//         User saveUser = userService.createUser(user);
//         return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
//     }

//     // Retriving User bi ID
//     @GetMapping("{id}")
//     public ResponseEntity<User> getUserById(@PathVariable("id") Long userId)
//     {
//         User user = userService.getUserById(userId);
//         return new ResponseEntity<> (user, HttpStatus.OK);
//     }

//     // Retrieve All Users
//     @GetMapping
//     public ResponseEntity<List<User>> getAllUser(User user)
//     {
//         List <User> users = userService.getAllUser();
//         return new ResponseEntity<> (users, HttpStatus.OK);

//     }

//     // Update User
//     @PutMapping("{id}")
//     public ResponseEntity<User> updateUser(@PathVariable("id") Long userId, @RequestBody User user)
//     {
//         user.setId(userId);
//         User updateUser = userService.updateUser(user);
//         return new ResponseEntity<>(updateUser, HttpStatus.OK);
//     }

//     // Delete User
//     @DeleteMapping("{id}")
//     public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId)
//     {
//         userService.deleteUser(userId);
//         return new ResponseEntity<>("User Successfully deleated!!.. ", HttpStatus.OK);
//     }


//     // User Login......
//     @PostMapping("/login")
//     public ResponseEntity<String> loginUser(@RequestBody UserDtoLogin userDtoLogin)
//     {
//         Optional<User> optionalUser = userService.authenticate(userDtoLogin.getEmail(), userDtoLogin.getPassword());
//         if (optionalUser.isPresent()) {
//             return ResponseEntity.ok("Login Successful");
//         } else {
//             return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Email or Password");
//         }
//     }

//     //Create Products
//     @PostMapping("/product")
//     public ResponseEntity<Product> createProduct(@RequestBody Product product)
//     {
//         Product saveProduct = productService.createProduct(product);
//         return new ResponseEntity<>(saveProduct, HttpStatus.CREATED);
//     }

//     // Retrieve Product by ID
//     @GetMapping("/product/{id}")
//     public ResponseEntity<Product> getProductById(@PathVariable("id") Long productId)
//     {
//         Product product = productService.getProductById(productId);
//         return new ResponseEntity<>(product, HttpStatus.OK);
//     }

//     // Retrieve All Products
//     @GetMapping("/product")
//     public ResponseEntity<List<Product>> getAllProduct(Product product)
//     {
//         List<Product> products = productService.getAllProduct();
//         return new ResponseEntity<>(products, HttpStatus.OK);
//     }

//     @PutMapping("/product/{id}")
//     public ResponseEntity<Product> updateProduct(@PathVariable("id")Long productId, @RequestBody Product product)
//     {
//         product.setId(productId);
//         Product updateProduct = productService.updateProduct(product);
//         return new ResponseEntity<>(updateProduct, HttpStatus.OK);
//     }

//     @DeleteMapping("/product/{id}")
//     public ResponseEntity<String> deleteProduct(@PathVariable("id") Long productId)
//     {
//         productService.deleteProduct(productId);
//         return new ResponseEntity<> ("Product successfully deleted!!...", HttpStatus.OK);
//     }

//     //Cart
    
//     @PostMapping("/cart/{userId}/{productId}")
//     public ResponseEntity<Cart> addToCart(@PathVariable Long userId, @PathVariable Long productId, @RequestBody CartDto cartDto)
//     {
//         cartDto.setProductId(productId); // Set the productId in CartDto
//         Cart cartItem = cartService.addToCart(userId, cartDto); // Pass userId and CartDto to addToCart method
//         return new ResponseEntity<>(cartItem, HttpStatus.CREATED);
//     }

//     @PutMapping("/cart/{cartId}")
//     public ResponseEntity<Cart> updateCart(@PathVariable Long cartId, @RequestBody CartDto cartDto)
//     {
//         Cart updatedCartItem = cartService.updateCart(cartId, cartDto);
//         return new ResponseEntity<>(updatedCartItem, HttpStatus.OK);
//     }

//     @DeleteMapping("/cart/{cartId}")
//     public ResponseEntity<Void> deleteCartItem(@PathVariable Long cartId)
//     {
//         cartService.deleteCartItem(cartId);
//         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//     }

//     @GetMapping("/cart/{userId}")
//     public ResponseEntity<List<Cart>> getCartDetails(@PathVariable Long userId) {
//         List<Cart> cartItems = cartService.getCartItems(userId);
//         return ResponseEntity.ok(cartItems);
//     }  
// }