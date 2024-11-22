package com.example.ccsd.Gallery;

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
@RequestMapping("/api/Gallery")
public class galleryController {
    
    @Autowired
    private galleryService GalleryService;

    @GetMapping
    public List<gallery> getAllGallerys() {
        return GalleryService.getAllGallerys();
    }

    @GetMapping("/{id}")
    public ResponseEntity<gallery> getGalleryById(@PathVariable String id) {
        return GalleryService.getGalleryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public gallery addgGallery(@RequestBody gallery Gallery) {
        return GalleryService.addGallery(Gallery);
    }

    @PutMapping("/{id}")
    public ResponseEntity<gallery> updategallery(@PathVariable String id, @RequestBody gallery GalleryDetails) {
        gallery updatedgallery = GalleryService.updategallery(id, GalleryDetails);
        if (updatedgallery != null) {
            return ResponseEntity.ok(updatedgallery);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletegallery(@PathVariable String id) {
        GalleryService.deletegallery(id);
        return ResponseEntity.noContent().build();
    }
}
