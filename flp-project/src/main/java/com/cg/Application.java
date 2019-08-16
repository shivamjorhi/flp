package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	/**The application runs at port number 8000. 
	 * Please go to http://localhost:8000/product with GET request to see the output, it will show all the initial products
	 * To create a new product add /new to the above URL
	 * To update product use update/id with PUT request
	 * To delete product use delete/id with DELETE request
	 * To find a product use find/id with GET request
	 * To find a product/s within a particular range use view/{from}/{to} with GET request
	 * Employee id-185865
	 * Employee Name-SHIVAM JOHRI
	 */
	
	
	 public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	
	 }
}