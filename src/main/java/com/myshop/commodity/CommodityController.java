package com.myshop.commodity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commodities")
public class CommodityController {
    private final CommodityRepository commodityRepository;

    @Autowired
    public CommodityController(CommodityRepository commodityRepository) {
        this.commodityRepository = commodityRepository;
    }

    @GetMapping
    public Page<Commodity> fetchAllCommodities(Pageable pageable) {
        return commodityRepository.findAllByIsHiddenIsFalse(pageable);
    }
}
