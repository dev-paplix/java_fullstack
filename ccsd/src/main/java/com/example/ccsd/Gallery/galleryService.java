package com.example.ccsd.Gallery;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class galleryService {
    
    @Autowired
    private galleryRepository GalleryRepository;

    // Getting all Gallerys
    public List<gallery> getAllGallerys() {
        return GalleryRepository.findAll();
    }

    // Getting single boks
    public Optional<gallery> getGalleryById(String id) {
        return GalleryRepository.findById(id);
    }

    // Creating new data in repository

    public gallery addGallery(gallery Gallery) {
        return GalleryRepository.save(Gallery);
    }

    public gallery updategallery(String id, gallery GalleryDetails) {
        Optional<gallery> GalleryOpt = GalleryRepository.findById(id);
        if (GalleryOpt.isPresent()) {

            // Get from database

            gallery Gallery = GalleryOpt.get();
            Gallery.setTitle(GalleryDetails.getTitle());
            Gallery.setimage(GalleryDetails.getimage());
            Gallery.setpostShortDescription(GalleryDetails.getpostShortDescription());
            Gallery.setDate(GalleryDetails.getDate());
            Gallery.setStatus(GalleryDetails.getStatus());
            Gallery.setTag(GalleryDetails.getTag());
            Gallery.setPlace(GalleryDetails.getPlace());
            Gallery.setPostSlug(GalleryDetails.getPostSlug());
            Gallery.setContent(GalleryDetails.getContent());

            return GalleryRepository.save(Gallery);
        }

        return null;
    }

    // Deleting
    
    public void deletegallery(String id) {
        GalleryRepository.deleteById(id);
    }
}
