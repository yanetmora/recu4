package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Book;



public interface BookRepository extends CrudRepository<Book, Integer> {

}
