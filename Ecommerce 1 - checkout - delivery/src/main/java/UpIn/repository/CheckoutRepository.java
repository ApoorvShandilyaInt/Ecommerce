package UpIn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UpIn.entity.Checkout;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
    // Add custom queries if needed
}