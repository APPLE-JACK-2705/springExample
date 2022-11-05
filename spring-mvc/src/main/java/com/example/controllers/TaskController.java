package com.example.controllers;

import com.example.model.Product;
import com.example.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class TaskController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public String indexPage(Model model){
        model.addAttribute("products", repository.findAll());
        return "task-views/index";
    }

    @GetMapping("/{id}")
    public String editProduct(@PathVariable(value = "id") Long id,
                              Model model){
        model.addAttribute("product", repository.findById(id));
        return "task-views/product_form";
    }

    @PostMapping("/product_update")
    public String updateProduct(Product product){
        repository.update(product);
        return "redirect:/product";
    }

    @GetMapping("/new")
    public String newProduct(Product product){
        return "task-views/new_product_form";
    }

    @PostMapping("/new")
    public String createNewProduct(Product product){
        repository.add(product);
        return "redirect:/product";
    }

    @GetMapping("/remove/{id}")
    public String removeProduct(@PathVariable(value = "id") Long id){
        repository.remove(id);
        return "redirect:/product";
    }
}
