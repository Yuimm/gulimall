package com.hct.gulimall.product;

import com.hct.gulimall.product.entity.BrandEntity;
import com.hct.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");

        brandService.save(brandEntity);
        System.out.println("=============");
    }

}
