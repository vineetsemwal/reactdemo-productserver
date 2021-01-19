package com.aplombee.apps.productsmgt.service;

import com.aplombee.apps.productsmgt.entities.Product;

import java.util.List;

public interface IProductService {

    Product add(Product product);

    List<Product> fetchAll();

    Product findById(long id);

}
