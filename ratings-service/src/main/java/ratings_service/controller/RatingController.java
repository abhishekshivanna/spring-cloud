package ratings_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ratings_service.domain.Rating;
import ratings_service.domain.RatingRepository;

@RestController
public class RatingController {

	@Autowired
	private RatingRepository repository;
	
	@RequestMapping(value = "/movie/{id}", method=RequestMethod.GET)
	public String getRatingForMovie(@PathVariable String id){
		StringBuilder str = new StringBuilder();
		for (Rating rating : repository.findByMovieId(id)) {
			str.append(rating.toString()+"<br/>");
		}
		return str.toString();
	}

}
