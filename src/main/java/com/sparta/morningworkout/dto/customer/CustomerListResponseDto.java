package com.sparta.morningworkout.dto.customer;

import com.sparta.morningworkout.entity.CustomerRequestList;
import lombok.Getter;

@Getter
public class CustomerListResponseDto {

    private Long userId;
    private Long productId;

    public CustomerListResponseDto(CustomerRequestList customerRequestList) {
        this.userId = customerRequestList.getUserId();
        this.productId = customerRequestList.getProductId();

    }
}
