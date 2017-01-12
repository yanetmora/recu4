package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.MovieRepository;

import boot.model.Movie;

@Service
@Transactional
public class MovieService {
	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	public List<Movie> findAll() {
		List<Movie> movies = new ArrayList<Movie>();
		for (Movie movie : movieRepository.findAll()) {
			movies.add(movie);
		}
		return movies;
	}
	public void save(Movie movie){
		movieRepository.save(movie);
	}
	public void delete(int id){
		movieRepository.delete(id);
	}
	public Movie findMovie(int id){
		return movieRepository.findOne(id);
	}
}
