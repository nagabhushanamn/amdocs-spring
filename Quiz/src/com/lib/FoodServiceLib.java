package com.lib;

import java.util.ArrayList;
import java.util.List;

import com.model.FoodItem;

public class FoodServiceLib {

	public static List<FoodItem> filter(List<FoodItem> inp, Condition condition) {
		List<FoodItem> out = new ArrayList<>();
		for (FoodItem foodItem : inp) {
			if (condition.test(foodItem))
				out.add(foodItem);
		}
		return out;
	}

}
