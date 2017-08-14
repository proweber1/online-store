package com.myshop.commodity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
class CommodityImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Image image;

    @ManyToOne
    @JsonIgnore
    private Commodity commodity;
    private boolean isIndex;
}
