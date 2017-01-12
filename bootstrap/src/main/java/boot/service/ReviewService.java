package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.ReviewRepository;
import boot.model.Review;

@Service
@Transactional
public class ReviewService {
	private final ReviewRepository reviewRepository;

	public ReviewService(ReviewRepository reviewRepository) {
		super();
		this.reviewRepository = reviewRepository;
	}

	public List<Review> findAll() {
		List<Review> reviews = new ArrayList<Review>();
		for (Review review : reviewRepository.findAll()) {
			reviews.add(review);
		}
		return reviews;
	}
	public void save(Review review){
		reviewRepository.save(review);
	}
	public void delete(int id){
		reviewRepository.delete(id);
	}
	public Review findReview(int id){
		return reviewRepository.findOne(id);
	}
}

