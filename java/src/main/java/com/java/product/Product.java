package com.java.product;

import java.util.Map;

public class Product {

  private int price = 0;
  
  public int calculateProducts(Map<String, Integer> products) {
		 
		for(Map.Entry<String, Integer> set : products.entrySet()) {
			switch(set.getKey()) {
			case "A": 
				price = price + products.get("A") * 50;
				break;
			case "B": 
				price = price + products.get("B") * 30;
				break;
			case "C": 
				price = price + products.get("C") * 20;
				break;
			case "D": 
				price = price + products.get("D") * 15;
				break;
			}
		}
		
		return price;
	}

}
