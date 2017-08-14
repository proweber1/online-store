package com.myshop.commodity.eav;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myshop.commodity.Commodity;
import lombok.Data;

import javax.persistence.*;

/**
 * Это таблица связки сущности к свойствам и значениями из EAV модели
 * <p>
 * Эта сущность осуществялет привязку свойств и значений к сущности
 * {@link Commodity}
 */
@Data
@Entity
public class CommodityProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Property property;

    @OneToOne(fetch = FetchType.LAZY)
    private Value value;

    @ManyToOne
    @JsonIgnore
    private Commodity commodity;
}
