package com.spring.mvc.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.Item;
import com.spring.mvc.service.ItemService;

@Controller
@RequestMapping("/cart")
public class CartController {

	private ItemService itemService;

	@Autowired
	public CartController(ItemService itemService) {
		this.itemService = itemService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showCart(Model model) {
		model.addAttribute("items", itemService.getItems());
		return "cart";
	}

	@RequestMapping(value = "/processcart", params = "addtocart", method = RequestMethod.POST)
	public String addToCart(@ModelAttribute("item") Item item) {
		return "redirect:/cart";
	}

	@RequestMapping(value = "/processcart", params = "checkout", method = RequestMethod.POST)
	public String checkout(@ModelAttribute("items") Item items) {
		return "summary";
	}

}
