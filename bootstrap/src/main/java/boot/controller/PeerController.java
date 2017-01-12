package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Peer;
import boot.service.PeerService;



@Controller
public class PeerController {
	@Autowired
	private PeerService peerService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-peers")
	public String allPeers(HttpServletRequest request){
		request.setAttribute("peers",peerService.findAll());
		request.setAttribute("mode","MODE_PEERS");
		return "peer";
	}
	
	@GetMapping("/new-peer")
	public String newPeer(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "peer";
	}
	@PostMapping("/save-peer")
	public String savePeer(@ModelAttribute Peer peer,BindingResult bindingResult, HttpServletRequest request){
		peerService.save(peer);
		request.setAttribute("peers",peerService.findAll());
		request.setAttribute("mode","MODE_PEERS");
		return "peer";
	}
	
	
	@GetMapping("/update-peers")
	public String updatePeer(@RequestParam int peerId,HttpServletRequest request){
		request.setAttribute("peer",peerService.findPeer(peerId));
		request.setAttribute("mode","MODE_UPDATE");
		return "peer";
	}
	@GetMapping("/delete-peer")
	public String deletePeer(@RequestParam int peerId,HttpServletRequest request){
		peerService.delete(peerId);
		request.setAttribute("peers",peerService.findAll());
		request.setAttribute("mode","MODE_PEERS");
		return "peer";
	}
}
