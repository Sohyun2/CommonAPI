package collections;

import java.util.*;

public class TestMain {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////////////////
		// DataRow 
		
		String jsonRowData =  "{\"name\":\"이소현\",\"ageI\":24,\"ageD\":24.0,\"블로그\":\"olsh1108o@douzone.com\",\"gender\":\"여자\"}"; 
		
		// (1)
		// DataRow에 jsonData insert
		DataRow dr = new DataRow();
		dr.setRowWithJson(jsonRowData);
		dr.dispDataRow();	// display dataRow

//		System.out.println(dr.getRowState());
		
//		// (2)
//		// add column
//		dr.addColumn("location", "부산");
//		dr.dispDataRow();	// display dataRow
//		
//		// remove column
//		dr.removeColumn("age");
//		dr.dispDataRow();	// display dataRow

//		// (3)
//		System.out.println("size of column : " + dr.columnSize());

//		// (4)
//		ArrayList<String> columnList = dr.getColumnList();
//		for (String column : columnList) {
//			System.out.println(column);
//		}

		// (5)
		System.out.println(dr.getColumnType("gender"));
		System.out.println(dr.getColumnType("ageI"));
		System.out.println(dr.getColumnType("ageD"));

//		// (6)
//		System.out.println(dr.getColumnValue("name"));
//		System.out.println(dr.getColumnValue("age"));
	
		/////////////////////////////////////////////////////////////////////////////		
		// DataTable
		
//		String jsonTableData = 
//				"{\"0\":["
//			  + "{\"name\":\"다\",\"age\":\"33\",\"블로그\":\"없음\",\"gender\":\"여자\"},"
//			  + "{\"name\":\"가\",\"age\":\"35\",\"블로그\":\"LSH\",\"gender\":\"남자\"},"
//			  + "{\"name\":\"나\",\"age\":\"34\",\"블로그\":\"없음\",\"gender\":\"남자\"}"
//			  + "]} ";
////		
////		// (1)
//		DataTable dt = new DataTable(jsonTableData);
//		dt.dispDataTable();
		
		// (2)
//		// add row
//		String newRow =  "{\"name\":\"이소현\",\"age\":25,\"블로그\":\"Hi\",\"gender\":\"여자\"}"; 
//		
//		DataRow newDR = new DataRow();
//		newDR.setRowWithJson(newRow);		
//		dt.addRow(newDR);
//		System.out.println("add row..");
//		dt.dispDataTable();		
//
//		// remove row
//		dt.removeRow(2);
//		System.out.println("\nadd remove..");
//		dt.dispDataTable();
		
//		ArrayList<DataRow> rows = dt.getRowList();
//		for(DataRow row : rows) {
//			row.dispDataRow();
//		}

//		System.out.println();
//		System.out.println(dt.getColumnType("name"));
//		System.out.println(dt.getColumnType("age"));
//		System.out.println(dt.getRowCount());
		
//		// (3)
//		dt.singleSort("name", "asc");
//		dt.dispDataTable();		
//		System.out.println();
//		
//		dt.singleSort("age", "asc");
//		dt.dispDataTable();	
//
//		System.out.println();
//		
//		dt.singleSort("name", "desc");
//		dt.dispDataTable();

//		// (4)
//		System.out.println(dt.getColumnValue(1, "name"));
//		System.out.println(dt.getRowCount());
//		
//		Object v1 = dt.getRowList().get(0).getRow().get("age"); // 33
//		Object v2 = dt.getRowList().get(1).getRow().get("age"); // 35
//		System.out.println(v1 + " " + v2);
//		System.out.println(((Comparable) v2).compareTo(v1)); // v2(35) > v1(33): 2		// 왼쪽이 크면 양수
//		System.out.println(((Comparable) v1).compareTo(v2)); // v1(33) < v2(35) : -2	// 오른쪽이 크면 음수
//		System.out.println(((Comparable) v2).compareTo(v2)); // v2(35) = v2(35) : 0		// 동일하면 0
		
		
		
		/////////////////////////////////////////////////////////////////////////////
		// DataSet
		
//		String jsonDataSet = 
//				  "{\"0\":["
//				+ "{\"name\":\"가\",\"age\":\"30\",\"블로그\":\"LSH\",\"gender\":\"남자\"},"
//				+ "{\"name\":\"나\",\"age\":\"31\",\"블로그\":\"없음\",\"gender\":\"남자\"},"
//				+ "{\"name\":\"다\",\"age\":\"30\",\"블로그\":\"없음\",\"gender\":\"여자\"}"
//				+ "], "
//				+ "\"1\":["
//				+ "{\"name\":\"고경태\",\"age\":\"30\",\"블로그\":\"DZ\"},"
//				+ "{\"name\":\"이홍준\",\"age\":\"31\",\"블로그\":\"없음\"},"
//				+ "{\"name\":\"서정윤\",\"age\":\"30\",\"블로그\":\"없음\"}"
//				+ "]}";
		
//		DataSet ds = new DataSet();
//		ds.setDataSetWithJson(jsonDataSet);
//		ds.dispDataSet();
//		
//		ArrayList<DataTable> tables = ds.getTableList();
//		
//		for(DataTable table : tables) {
//			table.dispDataTable();
//		}
		
//		ds.getDataTable(1).dispDataTable();

	}
}
