package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Movie;


public interface MovieRepository extends CrudRepository<Movie, Integer>{

	
}
