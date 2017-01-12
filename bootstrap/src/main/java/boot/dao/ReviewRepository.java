package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Integer>{

}
