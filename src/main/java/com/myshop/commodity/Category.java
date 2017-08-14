package com.myshop.commodity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    private Category parent;

    @OneToMany
    @JoinColumn(name = "id", referencedColumnName = "parent_id")
    private List<Category> child;
}
