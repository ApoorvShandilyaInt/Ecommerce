package UpIn.service;

import java.util.Optional;

import UpIn.dto.DeliveryDto;
import UpIn.entity.Delivery;

public interface DeliveryService
{
    Delivery addDeliveryAddress(Long userId, DeliveryDto deliveryDto);
    Optional<Delivery> getDeliveryByUserId(Long userId);
}
