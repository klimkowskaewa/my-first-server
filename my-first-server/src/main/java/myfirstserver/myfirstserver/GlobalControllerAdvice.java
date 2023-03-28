package myfirstserver.myfirstserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(MyException.class)
    public ResponseEntity<String> error(MyException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Something is broken");
    }

}
