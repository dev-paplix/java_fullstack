package com.example.ccsd.WebsiteImages;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "WebsiteImage")
public class WebsiteImages {
    @Id
    private String id;
    private String title;
    private String image;
    private String postShortDescription;
    private Date date;
    private String status;
    private String tag;
    private String place;
    private String postSlug;
    private String content;



    public WebsiteImages(){}

    public WebsiteImages
    (String id, String title, String images, String postShortDescription, Date date, 
    String status, String tag, String place, String postSlug, String content )
    {
        this.id = id;
        this.title = title;
        this.image = images;
        this.postShortDescription = postShortDescription;
        this.date = date;
        this.status = status;
        this.tag = tag;
        this.place = place;
        this.postSlug = postSlug;
        this.content = content;
    }

    //getter method
    public String getId(){
        return id;
    }

    //setter method
    public void setId(String id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getimage(){
        return image;
    }

    public void setimage(String image){
        this.image = image;
    }

    public String getpostShortDescription(){
        return postShortDescription;
    }

    public void setpostShortDescription(String postShortDescription){
        this.postShortDescription = postShortDescription;
    }

    public Date getDate(){
         return date;
     }

     public void setDate(Date date){
         this.date = date;
     }

     public String getStatus(){
        return status;
     }

     public void setStatus(String status){
        this.status = status;
    }

     public String getTag(){
        return tag;
     }

     public void setTag(String tag){
        this.tag = tag;
    }

     public String getPlace(){
        return place;
     }

     public void setPlace(String place){
        this.place = place;
    }

     public String getPostSlug(){
        return postSlug;
     }

     public void setPostSlug(String postSlug){
        this.postSlug = postSlug;
    }

     public String getContent(){
        return content;
     }

     public void setContent(String content){
        this.content = content;
    }

}
