package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.SingRepository;
import boot.model.Sing;

@Service
@Transactional
public class SingService {
	private final SingRepository singRepository;

	public SingService(SingRepository singRepository) {
		super();
		this.singRepository = singRepository;
	}

	public List<Sing> findAll() {
		List<Sing> sings = new ArrayList<Sing>();
		for (Sing sing : singRepository.findAll()) {
			sings.add(sing);
		}
		return sings;
	}
	public void save(Sing sing){
		singRepository.save(sing);
	}
	public void delete(int id){
		singRepository.delete(id);
	}
	public Sing findSing(int id){
		return singRepository.findOne(id);
	}
}
