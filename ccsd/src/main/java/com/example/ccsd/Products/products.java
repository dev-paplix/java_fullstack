package com.example.ccsd.Products;
// import java.io.File;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "products")
public class products {
    
    //field
    @Id
    private String title;   
    private String postSlug;
    private Date date;
    private String status;
    private String place;
    private String tag;
    private String postShortDescription;
    private byte imageUpload;
    private String postLongDescription;




    //Constructors
    public products() {}

    public products(String title, String postSlug, Date date, String status, String place, String tag, String postShortDescription, byte imageUpload, String postLongDescription) {
        this.title = title;
        this.postSlug = postSlug;
        this.date = date;
        this.status = status;
        this.place = place;
        this.tag = tag;
        this.postShortDescription = postShortDescription;
        this.imageUpload = imageUpload;
        this.postLongDescription = postLongDescription;
    }


    // setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setPostSlug(String postSlug){
         this.postSlug = postSlug;
    }

    public void setDate(Date date){
        this.date = date;
    }
    public void setStatus(String status){
         this.status = status;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setPostShortDescription(String postShortDescription) {
        this.postShortDescription = postShortDescription;
    }

    public void setImageUpload(byte imageUpload){
         this.imageUpload = imageUpload;
    }

    public void setPostLongDescription(String postLongDescription) {
        this.postLongDescription = postLongDescription;
    }


    // getter
    public String getTitle(){
        return this.title;
    }

    public String getPostSlug(){
         return this.postSlug;
    }

    public Date getDate(){
        return this.date;
    }
    public String getStatus(){
         return this.status;
    }

    public String getPlace() {
        return this.place;
    }

    public String getTag() {
        return this.tag;
    }

    public String getPostShortDescription() {
        return this.postShortDescription;
    }

    public byte getImageUpload(){
         return this.imageUpload;
    }

    public String getPostLongDescription() {
        return this.postLongDescription;
    }

}
