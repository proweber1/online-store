package com.myshop.commodity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

interface CommodityRepository
        extends JpaRepository<Commodity, Long> {

    Page<Commodity> findAllByIsHiddenIsFalse(Pageable pageable);
}
