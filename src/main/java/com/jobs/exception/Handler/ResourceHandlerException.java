package com.jobs.exception.Handler;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jobs.exception.ObjException;

@ControllerAdvice
public class ResourceHandlerException {

	@ExceptionHandler(ObjException.class)
	public ResponseEntity<Standarerror> objectnotfound(ObjectNotFoundException e, HttpServletRequest request){
		Standarerror err = new Standarerror(HttpStatus.NOT_FOUND.value(),e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
