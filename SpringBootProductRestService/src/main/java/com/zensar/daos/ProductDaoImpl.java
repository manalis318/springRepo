package com.zensar.daos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/*
 * Author: Manali Sharma
 * Creation Date: 30th Jul 2019 3:15PM IST
 * Modified Date: 31th Jul 2019 10:42AM IST
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents data access object interface used by business layer.
 * It contains CRUD operation methods for entity product.
 * */

@Repository
public class ProductDaoImpl implements ProductDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}
	
	

}
