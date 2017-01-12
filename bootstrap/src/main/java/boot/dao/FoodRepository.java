package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Food;

public interface FoodRepository extends CrudRepository<Food, Integer> {

}
