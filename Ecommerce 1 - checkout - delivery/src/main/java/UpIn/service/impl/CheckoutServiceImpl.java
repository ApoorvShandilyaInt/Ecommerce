package UpIn.service.impl;


import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UpIn.entity.Cart;
import UpIn.entity.Checkout;
import UpIn.entity.User;
import UpIn.repository.CheckoutRepository;

import UpIn.service.CartService;
import UpIn.service.CheckoutService;
import UpIn.service.UserService;
import lombok.AllArgsConstructor;

// @AllArgsConstructor
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private final UserService userService;
    private final CartService cartService;
    private final CheckoutRepository checkoutRepository;

    public CheckoutServiceImpl(UserService userService, CartService cartService, CheckoutRepository checkoutRepository) {
        this.userService = userService;
        this.cartService = cartService;
        this.checkoutRepository = checkoutRepository;
    }

    @Override
    public Checkout processCheckout(Long userId) {
        User user = userService.getUserById(userId);
        List<Cart> cartItems = cartService.getCartItems(userId);
        String billId = generateBillId();
        Checkout checkout = new Checkout();
        checkout.setUser(user);
        checkout.setCartItems(cartItems);
        checkout.setBillId(billId);
        checkoutRepository.save(checkout);
        return checkout;
    }

    private String generateBillId() {
        // Generate unique bill id using Random class
        Random random = new Random();
        StringBuilder billIdBuilder = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            billIdBuilder.append(randomChar);
        }
        return billIdBuilder.toString();
    }
    
}