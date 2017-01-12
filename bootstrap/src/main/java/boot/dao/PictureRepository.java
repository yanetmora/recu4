package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Picture;



public interface PictureRepository extends CrudRepository<Picture, Integer>{

}
