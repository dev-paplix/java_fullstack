package com.example.ccsd.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class usersService {

    @Autowired
    private usersRepository usersRepository;

    // Getting all users
    public List<users> getAllUsers() {
        return usersRepository.findAll();
    }

    // Getting single user by id
    public Optional<users> getUserById(String userId) {
        return usersRepository.findById(userId);
    }

    //getting single user by email
    public Optional<users> getUserByEmail(String email) {
        return usersRepository.findById(email);
    }


    // Creating new data in repository
    public users addUser(users users) {
        return usersRepository.save(users);
    }

    // Updating the user
    public users updateUser(String id, users usersDetails) {
        Optional<users> userOpt = usersRepository.findById(id);
        if (userOpt.isPresent()) {

            // Get from database

            users user = userOpt.get();
            user.setFirstName(usersDetails.getFirstName());
            user.setLastName(usersDetails.getFirstName());
            user.setPhoneNumber(usersDetails.getPhoneNumber());
            user.setUsername(usersDetails.getUsername());
            user.setDob(usersDetails.getDob());
            user.setRole(usersDetails.getRole());
            user.setAddress(usersDetails.getAddress());
            user.setEmail(usersDetails.getEmail());
            user.setPassword(usersDetails.getPassword());
            user.setProfPic(usersDetails.getProfPic());
            return usersRepository.save(user);
        }
        return null;
    }



    // Deleting user 
    public void deleteUser(String id) {
        usersRepository.deleteById(id);
    }


    
}
