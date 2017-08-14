package com.myshop.commodity.eav;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * Это простая сущность представляющая "значение" в EAV архитектуре, оно
 * имеет свойство к которому относится и значение для свойства, само по
 * себе значение существовать не может
 */
@Data
@Entity
class Value {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String value;

    @ManyToOne
    @JsonIgnore
    private Property property;
}
