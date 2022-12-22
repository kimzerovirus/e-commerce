package me.kzv.ecommerce.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ItemSellStatus {
    SELL("판매"), SOLD_OUT("품절");

    private final String value;
}