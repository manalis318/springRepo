package com.zensar.daos;

/*
 * Author: Manali Sharma
 * Creation Date: 30th Jul 2019 3:15PM IST
 * Modified Date: 30th Jul 2019 3:15PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents data access object interface used by business layer.
 * It contains CRUD operation methods for entity product.
 * */

import java.util.List;

import com.zensar.entities.Product;

public interface ProductDAO {
	
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();
}
