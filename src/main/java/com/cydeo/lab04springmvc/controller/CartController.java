package com.cydeo.lab04springmvc.controller;

import com.cydeo.lab04springmvc.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @RequestMapping("/cart-list")
    public String listCarts(Model model){

        model.addAttribute("cartList", cartService.retrieveCartList());

        return "cart/cart-list";
    }
}
