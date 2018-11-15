package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lib.Condition;
import com.lib.FoodServiceLib;
import com.model.FoodItem;
import com.model.FoodType;

public class FoodService {

	// -------------------------------------------------------

	private static List<FoodItem> foodItems = Arrays.asList(new FoodItem("item-1", 1000.00, FoodType.VEG),
			new FoodItem("item-2", 2000.00, FoodType.NVEG), new FoodItem("item-3", 3000.00, FoodType.VEG),
			new FoodItem("item-4", 1000.00, FoodType.NVEG), new FoodItem("item-5", 6000.00, FoodType.VEG),
			new FoodItem("item-6", 2000.00, FoodType.VEG)

	);

	// -------------------------------------------------------

	public List<FoodItem> getFoodItems(double price) {

		// way-1: imperative style ==> what + How

//		List<FoodItem> out=new ArrayList<>();
//		for(FoodItem foodItem:foodItems) {
//			if(foodItem.getPrice()==price)
//				out.add(foodItem);
//		}
//		return out;

//		// way-2: declarative style
//
//		class ByPrice implements Condition {
//			@Override
//			public boolean test(FoodItem item) {
//				return item.getPrice() == price;
//			}
//		}
//
//		Condition condition = new ByPrice();
//		return FoodServiceLib.filter(foodItems, condition);

		// way-3: declarative style

//		Condition condition = new Condition() {
//			@Override
//			public boolean test(FoodItem item) {
//				return item.getPrice() == price;
//			}
//		};
//		return FoodServiceLib.filter(foodItems, condition);
		
		// way-3: declarative style
		
		return FoodServiceLib.filter(foodItems, item->item.getPrice()==price);

	}

//	public List<FoodItem> getFoodItems(double minPrice,double maxPrice) {
//			
//			List<FoodItem> out=new ArrayList<>();
//			for(FoodItem foodItem:foodItems) {
//				if(foodItem.getPrice()>minPrice && foodItem.getPrice()<maxPrice)
//					out.add(foodItem);
//			}
//			return out;
//			
//		}

}
