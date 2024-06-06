package com.backend.ms.exceptions;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlingController {

  @ResponseStatus(value=HttpStatus.NO_CONTENT)
  @ExceptionHandler(Error204Exception.class)
  public void noContent() {
  }

  @ResponseBody
  @ResponseStatus(value=HttpStatus.CONFLICT)
  @ExceptionHandler(Error409Exception.class)
  public Map<String, String> noContent(Error409Exception exception) {
      Map<String, String> errores = new HashMap<String, String>();
      errores.put("error", exception.getMessage());
    return errores;
  }
  
  @ResponseBody
  @ResponseStatus(value=HttpStatus.CONFLICT)
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public Map<String, String> noContent(MethodArgumentNotValidException exception) {
      Map<String, String> errores = new HashMap<String, String>();
      for(ObjectError error : exception.getAllErrors()) {     
        String[] codigos =  error.getCodes()[0].split("\\.");
        errores.put(codigos[codigos.length - 1], error.getDefaultMessage());
      }
    return errores;
  }
  
}
