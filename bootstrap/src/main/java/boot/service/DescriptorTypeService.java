package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.DescriptorTypeRepository;
import boot.model.DescriptorType;



@Service
@Transactional
public class DescriptorTypeService {
	private final DescriptorTypeRepository descriptorTypeRepository;

	public DescriptorTypeService(DescriptorTypeRepository descriptorTypeRepository) {
		super();
		this.descriptorTypeRepository = descriptorTypeRepository;
	}

	public List<DescriptorType> findAll() {
		List<DescriptorType> descriptorTypes = new ArrayList<DescriptorType>();
		for (DescriptorType descriptorType : descriptorTypeRepository.findAll()) {
			descriptorTypes.add(descriptorType);
		}
		return descriptorTypes;
	}
	public void save(DescriptorType descriptorType){
		descriptorTypeRepository.save (descriptorType);
	}
	public void delete(int id){
		descriptorTypeRepository.delete(id);
	}
	public DescriptorType findDescriptorType(int id){
		return descriptorTypeRepository.findOne(id);
	}
}
