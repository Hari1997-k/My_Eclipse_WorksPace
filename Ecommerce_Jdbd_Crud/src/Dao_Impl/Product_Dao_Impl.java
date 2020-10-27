package Dao_Impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Product_Dao;
import Db_Connection.DbConnection;
import Model.Product;

public class Product_Dao_Impl implements Product_Dao {

	List<Product> plist = new ArrayList<Product>();

	@Override
	public int createProduct(Product pro) {
		int res = 0;
		try {
			PreparedStatement pst = DbConnection.GetConnection()
					.prepareStatement("insert into product(pname, price, pcategory) values(?,?,?)");
			pst.setString(1, pro.getPname());
			pst.setInt(2, pro.getPrice());
			pst.setString(3, pro.getCategory());
			res = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;

	}

	@Override
	public List<Product> viewAllProducts() {
		try {
			PreparedStatement pst = DbConnection.GetConnection().prepareStatement("select * from product");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Product pro = new Product();
				pro.setPid(rs.getInt(1));
				pro.setPname(rs.getString(2));
				pro.setPrice(rs.getInt(3));
				pro.setCategory(rs.getString(4));
				plist.add(pro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return plist;
	}

	@Override
	public int updateProductByName(String pname) {
		int res = 0 ; 
		try {
			PreparedStatement pst = DbConnection.GetConnection()
					.prepareStatement("update product set price = ?, pcategory = ? where pname =?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0 ;
		
	}

	@Override
	public int deleteProductByName(String pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product getProductByName() {
		// TODO Auto-generated method stub
		return null;
	}


}
