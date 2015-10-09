package api_gateway.models;

import java.util.List;

import api_gateway.services.movie.models.Movie;
import api_gateway.services.ratings.models.Rating;
import api_gateway.services.search.models.MovieSearch;

public class MovieDetails {
    private Movie movie;
    private MovieSearch movieSearch;
    private List<Rating> ratings;
    
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public List<Rating> getRatings() {
		return ratings;
	}
	
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public MovieSearch getMovieSearch() {
		return movieSearch;
	}

	public void setMovieSearch(MovieSearch movieSearch) {
		this.movieSearch = movieSearch;
	}
	
}
