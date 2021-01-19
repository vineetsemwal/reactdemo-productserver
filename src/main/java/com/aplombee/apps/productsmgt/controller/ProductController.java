package com.aplombee.apps.productsmgt.controller;

import com.aplombee.apps.productsmgt.dto.CreateProductRequest;
import com.aplombee.apps.productsmgt.dto.ProductDetails;
import com.aplombee.apps.productsmgt.entities.Product;
import com.aplombee.apps.productsmgt.service.IProductService;
import com.aplombee.apps.productsmgt.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @Autowired
    private ProductUtil util;

    @GetMapping
    public List<ProductDetails>fetchProducts(){
        List<Product>products= productService.fetchAll();
        List<ProductDetails>desired=util.toDetailsList(products);
        return desired;
    }

    @PostMapping("/add")
    public ProductDetails add(@RequestBody CreateProductRequest request){
        Product product=new Product(request.getName(),request.getPrice());
        product=productService.add(product);
        return util.toDetails(product);
    }

    @GetMapping("/by/id/{id}")
    public ProductDetails fetchProduceById(@PathVariable Long id){
        Product product=productService.findById(id);
        ProductDetails details=util.toDetails(product);
        return details;
    }


}
