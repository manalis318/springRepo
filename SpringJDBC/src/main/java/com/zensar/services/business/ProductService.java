package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Product;

/*
 * Author: Manali Sharma
 * Creation Date: 30th Jul 2019 4.55PM IST
 * Modified Date: 30th Jul 2019 4:55PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents product services which can be accessed by presentation layer.
 * It encapsulates business logic of product entity.
 * */

public interface ProductService {
	
	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	Product findProductById(int productId);
	List<Product> findAllProducts();
}
