package com.aplombee.apps.productsmgt.dao;

import com.aplombee.apps.productsmgt.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product,Long> {
}
