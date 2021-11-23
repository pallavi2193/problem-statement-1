package Promotion_Engine.maersk;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.java.promotion.Promotion;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Promotion promotion = new Promotion();
	
    @Test
    public void promotionEngineTest1()
    {
    	Map<String, Integer> products = new HashMap<>();
    	products.put("A", 5);
		products.put("B", 5);
		products.put("C", 1);
		
    	int result = promotion.checkForPromotion(products);
    	assertEquals(370, result);
    }
    
    @Test
    public void promotionEngineTest2()
    {
    	Map<String, Integer> products = new HashMap<>();
    	products.put("A", 1);
		products.put("B", 1);
		products.put("C", 1);
		
    	int result = promotion.checkForPromotion(products);
    	assertEquals(100, result);
    }
    
    @Test
    public void promotionEngineTest3()
    {
    	Map<String, Integer> products = new HashMap<>();
    	products.put("A", 3);
		products.put("B", 5);
		products.put("C", 1);
		products.put("D", 1);
		
    	int result = promotion.checkForPromotion(products);
    	assertEquals(280, result);
    }
}
