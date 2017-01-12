package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.PeerRepository;
import boot.dao.PictureRepository;
import boot.model.Peer;
import boot.model.Picture;

@Service
@Transactional
public class PictureService {
	private final PictureRepository pictureRepository;

	public PictureService(PictureRepository pictureRepository) {
		super();
		this.pictureRepository = pictureRepository;
	}

	public List<Picture> findAll() {
		List<Picture> pictures = new ArrayList<Picture>();
		for (Picture picture : pictureRepository.findAll()) {
			pictures.add(picture);
		}
		return pictures;
	}
	public void save(Picture picture){
		pictureRepository.save(picture);
	}
	public void delete(int pictureId){
		pictureRepository.delete(pictureId);
	}
	public Picture findPicture(int pictureId){
		return pictureRepository.findOne(pictureId);
	}

}
