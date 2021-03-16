package collections;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JsonParseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jsonData = 
		"{"
		+ "\"code\" : 200,"
		+ "\"dc\" : \"001\","
		+ "\"msg\" : \"success\","
		+ "\"state\" : \"select\","
		+ "\"proc\" : \"UP_SA_Z_****\","
		+ "\"pageNum\" : 1,"
		+ "\"pageCount\" : 5,"
		+ "\"data\" : { \"0\" : [ {\"NAME\" : \"가\", \"AGE\" : \"33\", \"BLOG\" : \"없음\", \"GENDER\" : \"여자\"},"
		+ "	        		  {\"NAME\" : \"나\", \"AGE\" : \"34\", \"BLOG\" : \"없음\", \"GENDER\" : \"여자\"},"
		+ "         		  {\"NAME\" : \"다\", \"AGE\" : \"35\", \"BLOG\" : \"없음\", \"GENDER\" : \"여자\"}"
		+ "			 		],"
		+ "			  \"1\" : [ {\"NAME\" : \"라\", \"AGE\" : \"36\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"마\", \"AGE\" : \"37\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"바\", \"AGE\" : \"38\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"}"
		+ "					],"
		+ "			  \"2\" : [ {\"NAME\" : \"라\", \"AGE\" : \"36\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"마\", \"AGE\" : \"37\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"바\", \"AGE\" : \"38\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"}"
		+ "					],"
		+ "			  \"3\" : [ {\"NAME\" : \"라\", \"AGE\" : \"36\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"마\", \"AGE\" : \"37\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"바\", \"AGE\" : \"38\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"}"
		+ "					],"
		+ "			  \"4\" : [ {\"NAME\" : \"라\", \"AGE\" : \"36\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"마\", \"AGE\" : \"37\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"바\", \"AGE\" : \"38\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"}"
		+ "					],"
		+ "			  \"5\" : [ {\"NAME\" : \"라\", \"AGE\" : \"36\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"마\", \"AGE\" : \"37\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"바\", \"AGE\" : \"38\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"}"
		+ "					],"
		+ "			  \"6\" : [ {\"NAME\" : \"라\", \"AGE\" : \"36\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"마\", \"AGE\" : \"37\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"},"
		+ "					  {\"NAME\" : \"바\", \"AGE\" : \"38\", \"BLOG\" : \"없음\", \"GENDER\" : \"남자\"}"
		+ "					]"
		+ "			}"
		+ "}";
		
		try{			
			JsonConverter con = new JsonConverter();
			con.convertJson(jsonData);
//			System.out.println(con.getCode());	
//			System.out.println(con.getPageNum());
//			System.out.println(con.getPageCount());								
			
			DataSet ds = new DataSet();
			ds.setDataSetWithJson(con.getData());
			ds.dispDataSet();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
