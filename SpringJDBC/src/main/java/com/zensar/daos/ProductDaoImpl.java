package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDAO {
	
	@Autowired
	private JdbcTemplate jt;

	public void insert(Product product) {
		// TODO Auto-generated method stub
		String sql="insert into product values(?,?,?,?)";
		jt.update(sql, product.getProductId(),product.getName(),product.getBrand(),product.getPrice());
		System.out.println("Product values are inserted!");
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		String sql="update product set name=?, brand=?, price=? where id=?";
		jt.update(sql, product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("Product values are updated!");

	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		String sql="delete from product where id=?";
		jt.update(sql, product.getProductId());
		System.out.println("Product values are deleted!");
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sql="select * from product where id=?";
		Product dbProduct=jt.query(sql, new Object[] {productId}, new ResultSetExtractor<Product>() {

			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				if(rs.next()){
					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					
					return product;
				}
				else
					return null;
			}
		});
		return dbProduct;
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		String sql="select * from product";
		List<Product> productList=jt.query(sql, new ResultSetExtractor<List<Product>>() {

			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Product> pList=new ArrayList<Product>();
				while(rs.next()){
					Product p=new Product();
					p.setProductId(rs.getInt(1));
					p.setName(rs.getString(2));
					p.setBrand(rs.getString(3));
					p.setPrice(rs.getFloat(4));
					pList.add(p);
				}
				return pList;
			}
		});
		
		return productList;
	}
	
	

}
