package com.wildberries.gateway.services;

import com.wildberries.gateway.dto.DeliveryDTO;

public interface DeliveryService {
    public DeliveryDTO addAddressAndOrderNumbers(String address, String orderNumber);
}
