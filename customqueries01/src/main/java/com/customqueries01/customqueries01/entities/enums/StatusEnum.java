package com.customqueries01.customqueries01.entities.enums;

import jakarta.persistence.Embedded;
import org.springframework.context.annotation.Bean;

public enum StatusEnum {

    ONTIME("on time"),
    DELAYED("delayed"),
    CANCELLED("cancelled");

    private String statusEnum;

    StatusEnum(String statusEnum) {
        this.statusEnum = statusEnum;
    }

    StatusEnum() {
    }

    public String getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(String statusEnum) {
        this.statusEnum = statusEnum;
    }
}
