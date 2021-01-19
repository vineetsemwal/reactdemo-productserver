package com.aplombee.apps.productsmgt.service;

import com.aplombee.apps.productsmgt.dao.IProductDao;
import com.aplombee.apps.productsmgt.entities.Product;
import com.aplombee.apps.productsmgt.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    @Override
    public Product add(Product product) {
        product = productDao.save(product);
        return product;
    }

    @Override
    public List<Product> fetchAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(long id) {
       Optional<Product>optional= productDao.findById(id);
       if(!optional.isPresent()){
           throw new ProductNotFoundException("product not found for id="+id);
       }
       return optional.get();
    }
}
