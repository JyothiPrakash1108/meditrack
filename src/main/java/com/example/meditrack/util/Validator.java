package com.example.meditrack.util;

import com.example.meditrack.exception.InvalidDataException;

public class Validator {
    public Validator(){
    }

    public static void validateName(String name){
        if(name == null || name.isEmpty()){
            throw new InvalidDataException("Name cannot be empty");
        }
    }
    public static void validateAge(int age){
        if(age < 0){
            throw new InvalidDataException("Age cannot be less than 0");
        }
    }
    public static void validateEmail(String email){
        if(email == null || email.isEmpty()){
            throw new InvalidDataException("Email cannot be empty");
        }
        
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if(!email.matches(emailRegex)){
            throw new InvalidDataException("Invalid email format");
        }
    }
    public static void validateFee(double fee){
        if(fee < 0){
            throw new InvalidDataException("Fee cannot be less then 0");
        }
    }
    public static void validatePhoneNumber(String phoneNumber){
        if(phoneNumber == null || phoneNumber.isEmpty()){
            throw new InvalidDataException("Phone number cannot be empty");
        }
        
        String phoneRegex = "^[\\d\\-\\+\\s()]{10,}$";
        if(!phoneNumber.matches(phoneRegex)){
            throw new InvalidDataException("Invalid phone number format");
        }
    }
}

package com.example.meditrack.util;

public class Validator {
    
}
