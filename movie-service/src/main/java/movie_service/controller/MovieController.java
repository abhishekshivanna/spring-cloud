package movie_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import movie_service.domain.MovieRepository;

@RestController
public class MovieController {
	
	@Autowired
	private MovieRepository repository;
	
	@RequestMapping(value = " /movie/{id}", method=RequestMethod.GET)
	public String getMovie(@PathVariable String id){
		return repository.findById(id).toString();
	}
}