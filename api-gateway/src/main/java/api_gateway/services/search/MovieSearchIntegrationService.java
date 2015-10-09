package api_gateway.services.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.ObservableResult;
import api_gateway.services.search.models.*;
import rx.Observable;

@Service
public class MovieSearchIntegrationService {
	@Autowired
    RestTemplate restTemplate;
	
	
	@HystrixCommand(fallbackMethod = "searchMovie")
	public Observable<MovieSearch> getMovieSearch(final String mID) {
		return new ObservableResult<MovieSearch>() {
			@Override
			public MovieSearch invoke() {
				return restTemplate.getForObject("http://movies/search/id{mID}", MovieSearch.class, mID);
			}
		};
	}

    private MovieSearch searchMovie(final String mID) {
    	MovieSearch search = new MovieSearch();
    	search.setDirector("Francis Ford Coppola");
        search.setLead("Al Pacino");
        search.setName("God Father");
        search.setYear("1972");
        return search;
    }
}
