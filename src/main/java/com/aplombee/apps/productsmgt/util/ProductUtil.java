package com.aplombee.apps.productsmgt.util;

import com.aplombee.apps.productsmgt.dto.ProductDetails;
import com.aplombee.apps.productsmgt.entities.Product;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductUtil {

    public ProductDetails toDetails(Product product) {
        return new ProductDetails(product.getId(), product.getName(), product.getPrice());
    }

    public List<ProductDetails> toDetailsList(Collection<Product> products) {
        List<ProductDetails> list = products.stream().map(product -> toDetails(product)).collect(Collectors.toList());
        return list;
    }

}
