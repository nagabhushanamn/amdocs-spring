package com;

import java.util.ArrayList;
import java.util.List;

import com.service.FoodService;

public class App {

	public static void main(String[] args) {
		
		FoodService foodService=new FoodService();
		foodService.getFoodItems(1000.00);
		
		
		List<String> list=new ArrayList<>();
		
		list.removeIf(item->item.equals("veg"));
		
	}
}
