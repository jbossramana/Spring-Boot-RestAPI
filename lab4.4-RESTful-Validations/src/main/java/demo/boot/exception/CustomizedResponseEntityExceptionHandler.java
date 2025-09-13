package demo.boot.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


@ExceptionHandler(Exception.class)
public final ResponseEntity<Object>   handleAllExceptions (Exception ex, WebRequest request)
{
GenericExceptionResponse  genericExceptionResponse = new GenericExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
return new ResponseEntity(genericExceptionResponse , HttpStatus.INTERNAL_SERVER_ERROR);
}

@ExceptionHandler(CustomerNotFoundException.class)
public final ResponseEntity<Object>   handleCustomerNotFoundException (CustomerNotFoundException ex, WebRequest request)
{
GenericExceptionResponse  genericExceptionResponse = new GenericExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
return new ResponseEntity(genericExceptionResponse , HttpStatus.NOT_FOUND);
}

protected ResponseEntity<Object> handleMethodArgumentNotValid(
		MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

	GenericExceptionResponse  genericExceptionResponse = new GenericExceptionResponse(new Date(), ex.getMessage(), ex.getBindingResult().toString());

	return new ResponseEntity(genericExceptionResponse , HttpStatus.BAD_REQUEST);
}



}
