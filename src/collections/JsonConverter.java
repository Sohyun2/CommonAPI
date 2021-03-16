package collections;

import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * 작 성 자  : 이 소 현
 * 작 성 일  : 2020.01.03
 * 수 정 자  :
 * 수 정 일  : 
 * 수정내용 :  
 */

public class JsonConverter {

	private String code;
	private String dc;
	private String msg;
	private String state;
	private String proc;
	private Long pageNum;
	private Long pageCount;
	private String data;
	
	public JsonConverter() {
		code = dc = msg = state = proc = data = "";
		pageNum = pageCount = 0L;
	}
	
	public void convertJson(String jsonData) {
		try{
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject) parser.parse(jsonData);

			Iterator<String> iter = jsonObj.keySet().iterator();
			
			while(iter.hasNext()) {
				String key = iter.next();				
				
				if(key.equals("code")) {
					code = (String) jsonObj.get(key).toString();
				} else if(key.equals("dc")) {
					dc = (String) jsonObj.get(key).toString();
				} else if(key.equals("msg")) {
					msg = (String) jsonObj.get(key).toString();
				} else if(key.equals("state")) {
					state = (String) jsonObj.get(key).toString();
				} else if(key.equals("proc")) {
					proc = (String) jsonObj.get(key).toString();
				} else if(key.equals("pageNum")) {
					pageNum = Long.parseLong(((String) jsonObj.get(key).toString()));
				} else if(key.equals("pageCount")) {
					pageCount = Long.parseLong(((String) jsonObj.get(key).toString()));
				} else if(key.equals("data")) {
					data = (String) jsonObj.get(key).toString();
				}
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public String getCode() {
		return code;
	}

	public String getDc() {
		return dc;
	}

	public String getMsg() {
		return msg;
	}

	public String getState() {
		return state;
	}

	public String getProc() {
		return proc;
	}

	public Long getPageNum() {
		return pageNum;
	}

	public Long getPageCount() {
		return pageCount;
	}

	public String getData() {
		return data;
	}

}
