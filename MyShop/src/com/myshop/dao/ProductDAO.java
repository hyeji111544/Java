package com.myshop.dao;


import java.util.ArrayList;
import java.util.List;
import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.ProductDTO;

public class ProductDAO extends DBHelper{
	
	//싱글톤
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	
	private ProductDAO() {}
	
		
		// CRUD 메서드
	
	public void insertProductDAO(ProductDTO dto) {}
	public ProductDTO selectProductDAO(int proNo) {
		return null;
	}
	
	
	public List<ProductDTO> selectProductsDAO() {
		List<ProductDTO> products = new ArrayList<>();
		try{
			conn = getConnection(); //커넥션 받아오고
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS); //파라미터가 없어서 stmt 사용.
			//psmt = conn.prepareStatement(SQL.SELECT_PRODUCTS);
			//rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				ProductDTO product = new ProductDTO();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
				
				products.add(product);
			}
			close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	public void updateProduct(ProductDTO dto) {
		//상품 명이나 다른거 조절할 때 쓰는 CRUD라 여기서 하지말자.
		/*System.out.println(dto);
		
		try {
			conn = getConnection();
			
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT);
			psmt.setInt(1, dto.getStock());
			psmt.setInt(2, dto.getProdNo());
			
			psmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	*/
	}
	public void deleteProductDAO(int OrderNo) {}

}
