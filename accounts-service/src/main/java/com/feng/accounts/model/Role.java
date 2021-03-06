package com.feng.accounts.model;

public enum Role {
    TENANT_ADMIN,

    TENANT_ORDER_READ,
    TENANT_ORDER_WRITE,

    TENANT_PRICE_READ,
    TENANT_PRICE_WRITE,

    PLATFORM_ADMIN,

    PLATFORM_ORDER_READ,
    PLATFORM_ORDER_WRITE,

    PLATFORM_PRICE_READ,
    PLATFORM_PRICE_WRITE,

    PLATFORM_TENANT_ACCOUNT_MANAGEMENT,

    VISITOR
}
