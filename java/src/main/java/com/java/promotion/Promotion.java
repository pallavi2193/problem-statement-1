package com.java.promotion;

public class Promotion {
		
	public int checkForPromotion(Map<String, Integer> products) {
		
		
		if(products.containsKey("A")) {
			while(products.get("A") >= 3) {
				promotionValue = promotionValue + 130;
				value = products.get("A") - 3;
				products.put("A", value);
			}
		}
		if(products.containsKey("B")) {
			while(products.get("B") >= 2) {
				promotionValue = promotionValue + 45;
				value = products.get("B") - 2;
				products.put("B", value);
			}
		}
		if(products.containsKey("C") && products.containsKey("D")) {
			while(products.get("C") >= 1 && products.get("D") >= 1) {
				promotionValue = promotionValue + 30;
				value = products.get("C") - 1;
				products.put("C", value);
				value = products.get("D") - 1;
				products.put("D", value);
			}
		}
		
		return promotionValue;
		
	}
	}
}
