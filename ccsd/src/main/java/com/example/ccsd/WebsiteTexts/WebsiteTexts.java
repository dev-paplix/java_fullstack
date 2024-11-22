package com.example.ccsd.WebsiteTexts;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "websitetexts")
public class WebsiteTexts {
  @Id
  private String id;
  private String title;
  private String status;
  private String place;
  private String tag;
  private String postShortDescription;
  private String postSlug;
  private String content;
  private Date date;
  private String image;

  public WebsiteTexts(){}

  public WebsiteTexts(String id,String title, String status, String place, String tag,String postShortDescription, String postSlug, String content, Date date, String image){
    this.id = id;
    this.title = title;
    this.status = status;
    this.place = place;
    this.tag = tag;
    this.postShortDescription = postShortDescription;
    this.postSlug = postSlug;
    this.content = content;
    this.date = date;
    this.image = image;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getTitle(){
  return title;
}

public void setTitle(String title) {
  this.title = title;
}

public String getStatus(){
  return status;
}

public void setStatus(String status) {
  this.status = status;
}

public String getPlace(){
  return place;
}

public void setPlace(String place) {
  this.place = place;
}

public String getTag(){
  return tag;
}

public void setTag(String tag) {
  this.tag = tag;
}

public String getPostShortDescription(){
  return postShortDescription;
}

public void setPostShortDescription(String postShortDescription) {
  this.postShortDescription = postShortDescription;
}

public String getPostSlug(){
  return postSlug;
}

public void setPostSlug(String postSlug) {
  this.postSlug = postSlug;
}

public String getContent(){
  return content;
}

public void setContent(String content) {
  this.content = content;
}

public Date getDate(){
  return date;
}

public void setDate(Date date) {
  this.date = date;
}
 
public String getImage(){
  return image;
}

public void setImage(String image) {
  this.image = image;
}

}



