package UpIn.service;

import UpIn.entity.Checkout;

public interface CheckoutService
{
    Checkout processCheckout(Long userId);
}