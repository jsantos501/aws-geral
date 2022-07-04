package br.com.ajs.example.aws.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.Table;

import br.com.ajs.example.aws.demo.request.RequestItem;
import br.com.ajs.example.aws.demo.response.ResponseItem;

@Service
public class DemoDynamoDBServiceImpl implements DemoDynamoDBService{
	
    BasicAWSCredentials creds = new BasicAWSCredentials("AKIAVMZM6N2L5G7OF4ON", "E/Pfah4Qma0BEGLAHqeL+3T629z/1kKGXCe72dXr");

	AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
			.withRegion("sa-east-1")
		    .withCredentials(new AWSStaticCredentialsProvider(creds))
		    .build();
	
	DynamoDB dynamoDB = new DynamoDB(client);
	public static final String TABLE_NAME = "http-crud-tutorial-items";
	
	
	@Override
	public List<ResponseItem> getFirstItem() {
		Table table = dynamoDB.getTable(TABLE_NAME);
		
		PrimaryKey pk = new PrimaryKey();
		pk.addComponent("id", "abcdef234");
		
		com.amazonaws.services.dynamodbv2.document.Item itemBD = table.getItem(pk);
		
		List<ResponseItem> itens = new ArrayList<>();
		ResponseItem item = new ResponseItem();
		
		item.setId(itemBD.getString("id"));
		item.setMensagem(itemBD.getString("name"));
		itens.add(item);
		
		
		return itens;
	}


	@Override
	public List<ResponseItem> getAllItens() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ResponseItem> putItem(RequestItem requestItem) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ResponseItem> findItem(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ResponseItem> updateItem(RequestItem requestItem) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ResponseItem> deleteItem(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
