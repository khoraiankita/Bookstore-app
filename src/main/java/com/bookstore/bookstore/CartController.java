package com.bookstore.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartRepository cartRepo;

    // ➕ Add to cart
    @PostMapping("/cart/add")
    public CartItem addToCart(@RequestBody CartItem item) {
        return cartRepo.save(item);
    }

    // 📄 View cart
    @GetMapping("/cart")
    public List<CartItem> viewCart() {
        return cartRepo.findAll();
    }

    // ❌ Remove item
    @DeleteMapping("/cart/{id}")
    public String removeFromCart(@PathVariable int id) {
        cartRepo.deleteById(id);
        return "Item removed from cart!";
    }
}