package UpIn.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UpIn.dto.DeliveryDto;
import UpIn.entity.Delivery;
import UpIn.entity.User;
import UpIn.repository.DeliveryRepository;
import UpIn.service.DeliveryService;
import UpIn.service.UserService;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;
    private UserService userService;

    @Override
    public Delivery addDeliveryAddress(Long userId, DeliveryDto deliveryDto) {
        User user = userService.getUserById(userId);
        Delivery delivery = new Delivery();
        delivery.setUser(user);
        delivery.setAddress(deliveryDto.getAddress());
        return deliveryRepository.save(delivery);
    }

    @Override
    public Optional<Delivery> getDeliveryByUserId(Long userId) {
        return deliveryRepository.findById(userId);
    }
}