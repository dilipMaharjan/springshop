package com.spring.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.mvc.model.Item;

@Repository
public class ItemRepository {

	public List<Item> getItems() {
		return itemList();
	}

	private List<Item> itemList() {
		List<Item> items = new ArrayList<>();

		for (int i = 1; i < 6; i++) {
			Item item = new Item("item" + i, 11 + i);
			item.setId(i);
			items.add(item);
		}
		return items;
	}

}
