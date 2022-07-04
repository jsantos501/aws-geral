package br.com.ajs.example.aws.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ajs.example.aws.demo.request.RequestItem;
import br.com.ajs.example.aws.demo.service.DemoDynamoDBService;

@RestController
public class DemoRouteController {

	@Autowired
	private DemoDynamoDBService service;
	
	@GetMapping("/first-item")
	public Object getFirstItem() {
		return service.getAllItens();
	}

	@GetMapping("/record-item")
	public Object gravarItem() {
		RequestItem requestItem = null;
		return service.putItem(requestItem);
	}

	@GetMapping("/search-item")
	public Object buscarItem() {
		String id = null;
		return service.findItem(id);
	}

	@GetMapping("/change-infos-item")
	public Object atualizarITem() {
		RequestItem requestItem = null;
		return service.updateItem(requestItem);
	}

	@GetMapping("/inativar-item")
	public Object apagarItem() {
		String id = null;
		return service.deleteItem(id);
	}


}
