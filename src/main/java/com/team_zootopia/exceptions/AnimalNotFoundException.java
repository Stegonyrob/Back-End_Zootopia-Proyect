package com.team_zootopia.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

    

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Animal not found")
public class AnimalNotFoundException extends RuntimeException {
   public AnimalNotFoundException(String message) {
       super(message);
   }
}



