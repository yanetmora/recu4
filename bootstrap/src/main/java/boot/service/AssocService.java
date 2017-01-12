package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.AssocRepository;
import boot.model.Assoc;



@Service
@Transactional
public class AssocService {
	private final AssocRepository assocRepository;

	public AssocService(AssocRepository assocRepository) {
		super();
		this.assocRepository = assocRepository;
	}

	public List<Assoc> findAll() {
		List<Assoc> assocs = new ArrayList<Assoc>();
		for (Assoc assoc : assocRepository.findAll()) {
			assocs.add(assoc);
		}
		return assocs;
	}
	public void save(Assoc assoc){
		assocRepository.save(assoc);
	}
	public void delete(int id){
		assocRepository.delete(id);
	}
	public Assoc findAssoc(int id){
		return assocRepository.findOne(id);
	}
}
