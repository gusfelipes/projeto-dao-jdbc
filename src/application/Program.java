package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Department dp = new Department(1, "Books");
		System.out.println(dp);

		Seller sl = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, dp);
		System.out.println(sl);
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
	}

}
