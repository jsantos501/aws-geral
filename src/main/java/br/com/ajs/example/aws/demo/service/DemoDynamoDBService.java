package br.com.ajs.example.aws.demo.service;

import java.util.List;

import br.com.ajs.example.aws.demo.request.RequestItem;
import br.com.ajs.example.aws.demo.response.ResponseItem;

public interface DemoDynamoDBService {
	public List<ResponseItem> getFirstItem();
	
	public List<ResponseItem> getAllItens();
	
	public List<ResponseItem> putItem(RequestItem requestItem);
	
	public List<ResponseItem> findItem(String id);
	
	public List<ResponseItem> updateItem(RequestItem requestItem);
	
	public List<ResponseItem> deleteItem(String id);
	
	
}
