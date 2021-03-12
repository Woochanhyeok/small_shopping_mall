package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

//내장 타입이라는 의미
@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}