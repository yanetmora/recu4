package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.MartialRepository;
import boot.model.Martial;



@Service
@Transactional
public class MartialService {
	private final MartialRepository martialRepository;

	public MartialService(MartialRepository martialRepository) {
		super();
		this.martialRepository = martialRepository;
	}

	public List<Martial> findAll() {
		List<Martial> martials = new ArrayList<Martial>();
		for (Martial martial : martialRepository.findAll()) {
			martials.add(martial);
		}
		return martials;
	}
	public void save(Martial martial){
		martialRepository.save(martial);
	}
	public void delete(int id){
		martialRepository.delete(id);
	}
	public Martial findMartial(int id){
		return martialRepository.findOne(id);
	}
}
