package com.example.ccsd.Users;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class users {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String username;
    private Date dob;
    private String address;
    private String role;
    private String email;
    private String password;
    private byte profPic;

     // Constructors
     public users() {}

    public users(String userId, String firstName, String  lastName, String phoneNumber,String username, Date dob, String address, String role, String email, String password, byte profPic){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.dob = dob;
        this.address = address;
        this.role = role;
        this.email = email;
        this.profPic = profPic;
    }

    //getter user id
    public String getUserId()
    {
        return userId;
    }

     // setter user id
     public void setUserId(String userId){
        this.userId = userId;
    }

     //getter first name
     public String getFirstName()
     {
         return firstName;
     }
 
     // setter first name
     public void setFirstName(String firstName){
         this.firstName = firstName;
     }

      //getter last name
      public String getLastName()
      {
          return lastName;
      }
  
      // setter last name
      public void setLastName(String lastName){
          this.lastName = lastName;
      }

       //getter phone number
       public String getPhoneNumber()
       {
           return phoneNumber;
       }
   
       // setter phone number
       public void setPhoneNumber(String phoneNumber){
           this.phoneNumber = phoneNumber;
       }

        //getter username
        public String getUsername()
        {
            return username;
        }
    
        // setter username
        public void setUsername(String username){
            this.username = username;
        }

          //getter dob
          public Date getDob()
          {
              return dob;
          }
      
          // setter dob
          public void setDob(Date dob){
              this.dob = dob;
          }
  
     
          //getter address
          public String getAddress()
          {
              return address;
          }
      
          // setter address
          public void setAddress(String address){
              this.address = address;
          }

                 //getter role
        public String getRole()
        {
            return role;
        }
    
        // setter role
        public void setRole(String role){
            this.role = role;
        }



       //getter email
       public String getEmail()
       {
           return email;
       }
   
       // setter email
       public void setEmail(String email){
           this.email = email;
       }

        //getter password
        public String getPassword()
        {
            return password;
        }

        //setter password
        public void setPassword(String password){

                this.password = password;

        }

        //getter proString pic
     public byte getProfPic()
     {
         return profPic;
     }
 
     // setter proString pic
     public void setProfPic(byte profPic){
         this.profPic = profPic;
     }
 

    
}
