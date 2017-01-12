package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Peer;


public interface PeerRepository extends CrudRepository<Peer, Integer> {

}
