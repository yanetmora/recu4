package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.PeerRepository;
import boot.model.Peer;



@Service
@Transactional
public class PeerService {
	private final PeerRepository peerRepository;

	public PeerService(PeerRepository peerRepository) {
		super();
		this.peerRepository = peerRepository;
	}

	public List<Peer> findAll() {
		List<Peer> peers = new ArrayList<Peer>();
		for (Peer peer : peerRepository.findAll()) {
			peers.add(peer);
		}
		return peers;
	}
	public void save(Peer peer){
		peerRepository.save(peer);
	}
	public void delete(int peerId){
		peerRepository.delete(peerId);
	}
	public Peer findPeer(int peerId){
		return peerRepository.findOne(peerId);
	}
}
