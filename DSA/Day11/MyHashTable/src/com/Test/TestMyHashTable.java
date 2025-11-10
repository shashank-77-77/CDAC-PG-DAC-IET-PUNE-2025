package com.Test;

import com.Hashing.MyHashTable;

public class TestMyHashTable {

	public static void main (String[] args)
	{
		MyHashTable ht=new MyHashTable(5);
		ht.insertData(41);
		ht.insertData(48);
		ht.insertData(62);
		ht.insertData(441);
		ht.insertData(88);
		ht.insertData(54);
		ht.insertData(85);
		ht.insertData(79);
		ht.insertData(256);
		ht.insertData(64);
		ht.insertData(94);
		ht.insertData(54);
		ht.displayHashTable();
		ht.searchData(79);
		ht.searchData(1005);
		ht.searchData(48);
	}

}


//  Output :
//	
//	0--->85----->null
//	1--->256----->441----->41----->null
//	2--->62----->null
//	3--->88----->48----->null
//	4--->54----->94----->64----->79----->54----->null
//	
//	79 found in  bucket 4
//	1005 not found in  bucket 0
//	48 found in  bucket 3	
