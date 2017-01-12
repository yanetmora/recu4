package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.FoodRepository;
import boot.dao.SitePersonnelRoleRepository;
import boot.model.Food;
import boot.model.SitePersonnelRole;

@Service
@Transactional
public class SitePersonnelRoleService {
	private final SitePersonnelRoleRepository sitePersonnelRoleRepository;

	public SitePersonnelRoleService(SitePersonnelRoleRepository sitePersonnelRoleRepository) {
		super();
		this.sitePersonnelRoleRepository = sitePersonnelRoleRepository;
	}

	public List<SitePersonnelRole> findAll() {
		List<SitePersonnelRole> sitePersonnelRoles = new ArrayList<SitePersonnelRole>();
		for (SitePersonnelRole sitePersonnelRole : sitePersonnelRoleRepository.findAll()) {
			sitePersonnelRoles.add(sitePersonnelRole);
		}
		return sitePersonnelRoles;
	}
	public void save(SitePersonnelRole sitePersonnelRole){
		sitePersonnelRoleRepository.save(sitePersonnelRole);
	}
	public void delete(int id){
		sitePersonnelRoleRepository.delete(id);
	}
	public SitePersonnelRole findSitePersonnelRole(int id){
		return sitePersonnelRoleRepository.findOne(id);
	}
}
