package com.example.ccsd.WebsiteImages;

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
@RequestMapping("/api/WebsiteImage")
public class WebsiteImagesController {
       @Autowired
    private WebsiteImagesService websiteImagesService;

    @GetMapping
    public List<WebsiteImages> getAllWebsiteImageses() {
        return websiteImagesService.getAllWebsiteImageses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WebsiteImages> getWebsiteImagesById(@PathVariable String id) {
        return websiteImagesService.getWebsiteImagesById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WebsiteImages addWebsiteImages(@RequestBody WebsiteImages websiteImages) {
        return websiteImagesService.addWebsiteImages(websiteImages);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WebsiteImages> updateWebsiteImages(@PathVariable String id, @RequestBody WebsiteImages websiteImagesDetails) {
        WebsiteImages updatedBook = websiteImagesService.updateWebsiteImages(id, websiteImagesDetails);
        if (updatedBook != null) {
            return ResponseEntity.ok(updatedBook);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWebsiteImages(@PathVariable String id) {
       websiteImagesService.deleteWebsiteImages(id);
        return ResponseEntity.noContent().build();
    }
}
