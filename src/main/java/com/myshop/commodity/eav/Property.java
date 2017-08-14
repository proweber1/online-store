package com.myshop.commodity.eav;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Это простая сущность "Свойства" из архитектуры EAV, оно
 * можеть иметь много значений, имя и дополнительные аттрибуты
 */
@Data
@Entity
class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(targetEntity = Value.class, mappedBy = "property")
    @JsonIgnore
    private List<Value> values;
}
