package com.bmo.home.bmotradeinfoservice.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TradeExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(TradeNotFoundException.class)
	public final ResponseEntity<Object> tradeNotFoundHandleException(Exception ex, WebRequest request)
			throws Exception {

		TradeException tradeException = new TradeException(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<Object>(tradeException, HttpStatus.NOT_FOUND);

	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, String> errors = new HashMap<String, String>();

		ex.getBindingResult().getAllErrors().forEach(x -> {
			FieldError fieldError = (FieldError) x;
			String message = x.getDefaultMessage();

			errors.put(fieldError.getField(), message);
		});

		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}

}
