package com.Topcoder.rest.webservices.springbootjpapostgresql.Train;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/api")
public class TrainController {
	
	
	@Autowired
	private TrainRepository trainrepository;
	
	@GetMapping("/trains")
	public ResponseEntity<ArrayList<TrainModel>> getAlltrains(){
		
			ArrayList<TrainModel> trainmodel=(ArrayList<TrainModel>) trainrepository.findAll();
			if (trainmodel.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(trainmodel, HttpStatus.OK);
	
	}
	
	
	@GetMapping("/trains/{id}")
	public ResponseEntity<TrainModel> getTrainById(@PathVariable long id){
		
		try{
			TrainModel train=trainrepository.findById(id).get();
			return new ResponseEntity<>(train,HttpStatus.OK);
		}catch(Exception ex){
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,"train not found",ex );
		}
										
		
	}
	
//	@ExceptionHandler(NoHandlerFoundException.class)
//    public void handleNoHandlerFoundException(HttpServletResponse response,NoHandlerFoundException h) {
//        //response.sendError(HttpStatus.BAD_REQUEST.value());
//        //response.sendError(HttpServletResponse.SC_BAD_REQUEST, "message goes here");
//		//throw new ResponseStatusException(HttpStatus.OK,"Invalid URLLL",h);
//    }
	

}
