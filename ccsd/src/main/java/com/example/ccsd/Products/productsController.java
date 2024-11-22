package com.example.ccsd.Products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class productsController {
    
    @Autowired
    private productsService productsService;

    @GetMapping
    public List<products> getAllProducts() {
        return productsService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<products> getProductskById(@PathVariable String id) {
        return productsService.getProductsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public products addProducts(@RequestBody products Products) {
        return productsService.addProducts(Products);
    }

    @PutMapping("/{id}")
    public ResponseEntity<products> updateProducts(@PathVariable String id, @RequestBody products ProductsDetail) {
        products updatedProducts = productsService.updateProducts(id, ProductsDetail);
        if (updatedProducts != null) {
            return ResponseEntity.ok(updatedProducts);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducts(@PathVariable String id) {
        productsService.deleteProducts(id);
        return ResponseEntity.noContent().build();
    }


    //handle picture    
    // @PostMapping("auth/createAd")
    // p@PostMapping("auth/createAd")
    // public Ads createAd(
    //     @RequestParam("adsImages") MultipartFile[] adsImages,
    //     // Add other parameters
    // ) {
    //     String uploadDirectory = "src/main/resources/static/images/ads";
    //     String adsImagesString = "";

    //     for (MultipartFile imageFile : adsImages) {
    //         adsImagesString += imageService.saveImageToStorage(uploadDirectory, imageFile) + ",";
    //     }

    //     // Save the adsImagesString in your database
    //     // You can also associate it with other data in your Ads object
    // }
}