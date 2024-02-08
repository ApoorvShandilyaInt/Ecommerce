package UpIn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import UpIn.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long>
{
    
}
