package movie_service.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {

    public Movie findByName(String name);
    public Movie findById(String id);
}
