package com.myshop.commodity;

import com.myshop.commodity.eav.CommodityProperty;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class Commodity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int count;
    private boolean isHidden = false;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Category> categories;

    @OneToMany(mappedBy = "commodity", targetEntity = CommodityProperty.class)
    private List<CommodityProperty> properties;

    @OneToMany(targetEntity = CommodityImage.class, mappedBy = "commodity")
    private List<CommodityImage> commodityImages;
}
