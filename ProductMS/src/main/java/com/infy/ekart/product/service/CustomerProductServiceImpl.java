package com.infy.ekart.product.service;

import java.util.List;
import com.infy.ekart.product.dto.ProductDTO;
import com.infy.ekart.product.exception.EKartProductException;
import com.infy.ekart.product.repository.ProductRepository;


//Add the missing annotations

public class CustomerProductServiceImpl implements CustomerProductService {
	
	private ProductRepository productRepository;


	//This method is used to retrieve the list of all the products from database
	//Invoke appropriate method of ProductRepository, to fetch product details
	//which in turn returns a list.
	//for each product found, create and populate the ProductDTO object and add 
	//it to a List<ProductDTO>.
	//Return the above obtained list
	@Override
	public List<ProductDTO> getAllProducts() throws EKartProductException {
		
		// Write your logic here
		
		return null;
	}

	//This method is used to fetch Product details of the product with the given productId
	//Invoke appropriate method of ProductRepository which will retrieve the product
	//details using the given productId (available in ProductDTO). 
	//If product exists for the given productId return the product details
	//Else, If productId does not exist, then throw an object of EKartProductException with 
	//message “ProductService.PRODUCT_NOT_AVAILABLE”
	@Override
	public ProductDTO getProductById(Integer productId) throws EKartProductException {
		
		//Write your logic here
		
		return null;
	}
	
	// This method is used to reduce the available quantity of product 
	// Invoke appropriate methods of ProductRepository to retrieve the product 
	// details using the given productId 
	// If product does not exist, then throw an object of EkartProductException 
	// with message “ProductService.PRODUCT_NOT_AVAILABLE”
	// Else, reduce the quantity of the retrieved product with the given number of quantity
	@Override
	public void reduceAvailableQuantity(Integer productId, Integer quantity) throws EKartProductException {
		
		//Write your logic here
	}
}
