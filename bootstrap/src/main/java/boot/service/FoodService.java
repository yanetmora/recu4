package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.FoodRepository;
import boot.model.Food;


@Service
@Transactional
public class FoodService {
	private final FoodRepository foodRepository;

	public FoodService(FoodRepository foodRepository) {
		super();
		this.foodRepository = foodRepository;
	}

	public List<Food> findAll() {
		List<Food> foods = new ArrayList<Food>();
		for (Food food : foodRepository.findAll()) {
			foods.add(food);
		}
		return foods;
	}
	public void save(Food food){
		foodRepository.save(food);
	}
	public void delete(int id){
		foodRepository.delete(id);
	}
	public Food findFood(int id){
		return foodRepository.findOne(id);
	}
}
