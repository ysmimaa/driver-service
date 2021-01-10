package com.driver.ms.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class Address implements Serializable {

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "STREET")
    private String street;

    @Column(name = "CITY")
    private String city;

    @Column(name = "CODE")
    private String code;

    @Column(name = "COUNTRY")
    private String country;

}
