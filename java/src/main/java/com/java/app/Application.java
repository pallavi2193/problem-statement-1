package com.java.app;

import java.util.HashMap;
import java.util.Map;

import com.java.promotion.Promotion;

public class Application {

	public static void main(String[] args) {
		Map<String, Integer> products = new HashMap<>();
		checkForPromotion(products);
	}

}
