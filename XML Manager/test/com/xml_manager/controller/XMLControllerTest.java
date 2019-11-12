package com.xml_manager.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class XMLControllerTest {
	
	XMLController x1= new XMLController();
	
	@Test
	public void testInvoker_CreateSingleXMLSingleChange() {
		x1.invoker(0, 1, 1);
	}
	
	@Test
	public void testInvoker_CreateSingleXMLMultiChange1() {
		x1.invoker(0, 1, 2);
	}
	
	@Test
	public void testInvoker_CreateSingleXMLMultiChange2() {
		x1.invoker(0, 1, 0);
	}
	
	@Test
	public void testInvoker_CreateSingleXMLMultiChange3() {
		x1.invoker(0, 0, 2);
	}
	
	@Test
	public void testInvoker_CreateSingleXMLMultiChange4() {
		x1.invoker(0, 0, 0);
	}
	
	@Test
	public void testInvoker_CreateMultiXMLSingleChange1() {
		x1.invoker(0, 2, 1);
	}
	
	@Test
	public void testInvoker_CreateMultiXMLSingleChange2() {
		x1.invoker(0, 1, 1);
	}
	
	@Test
	public void testInvoker_CreateMultiXMLSingleChange3() {
		x1.invoker(0, 2, 2);
	}
	
	@Test
	public void testInvoker_CreateMultiXMLSingleChange4() {
		x1.invoker(0, 1, 2);
	}
	
	@Test
	public void testInvoker_CreateMultiXMLMultiChange1() {
		x1.invoker(0, 2, 2);
	}
	
	@Test
	public void testInvoker_CreateMultiXMLMultiChange2() {
		x1.invoker(0, 0, 2);
	}
	
	@Test
	public void testInvoker_CreateMultiXMLMultiChange3() {
		x1.invoker(0, 2, 0);
	}
	
	@Test
	public void testInvoker_CreateMultiXMLMultiChange4() {
		x1.invoker(0, 0, 0);
	}
	
	
	@Test
	public void testInvoker_CreateInvalidXMLChange() {
		x1.invoker(0, -1, -1);
	}
	
	@Test
	public void testInvoker_UpdateSingleXMLSingleChange() {
		x1.invoker(1, 1, 1);
	}
	
	@Test
	public void testInvoker_UpdateSingleXMLMultiChange1() {
		x1.invoker(1, 1, 2);
	}
	
	@Test
	public void testInvoker_UpdateSingleXMLMultiChange2() {
		x1.invoker(1, 1, 0);
	}
	
	@Test
	public void testInvoker_UpdateSingleXMLMultiChange3() {
		x1.invoker(1, 0, 2);
	}
	
	@Test
	public void testInvoker_UpdateSingleXMLMultiChange4() {
		x1.invoker(1, 0, 0);
	}
	
	@Test
	public void testInvoker_UpdateMultiXMLSingleChange() {
		x1.invoker(1, 2, 1);
	}
	
	@Test
	public void testInvoker_UpdateMultiXMLMultiChange1() {
		x1.invoker(1, 2, 2);
	}
	
	@Test
	public void testInvoker_UpdateMultiXMLMultiChange2() {
		x1.invoker(1, 0, 2);
	}
	
	@Test
	public void testInvoker_UpdateMultiXMLMultiChange3() {
		x1.invoker(1, 2, 0);
	}
	
	@Test
	public void testInvoker_UpdateMultiXMLMultiChange4() {
		x1.invoker(1, 0, 0);
	}
	
	@Test
	public void testInvoker_UpdateInvalidXMLChange() {
		x1.invoker(1, -1, -1);
	}
	
	@Test
	public void testInvoker_DeleteSingleXMLSingleChange() {
		x1.invoker(2, 1, 1);
	}
	
	@Test
	public void testInvoker_DeleteSingleXMLMultiChange1() {
		x1.invoker(2, 1, 2);
	}
	
	@Test
	public void testInvoker_DeleteSingleXMLMultiChange2() {
		x1.invoker(2, 1, 0);
	}
	
	@Test
	public void testInvoker_DeleteSingleXMLMultiChange3() {
		x1.invoker(2, 0, 2);
	}
	
	@Test
	public void testInvoker_DeleteSingleXMLMultiChange4() {
		x1.invoker(2, 0, 0);
	}
	
	@Test
	public void testInvoker_DeleteMultiXMLSingleChange() {
		x1.invoker(2, 2, 1);
	}
	
	@Test
	public void testInvoker_DeleteMultiXMLMultiChange1() {
		x1.invoker(2, 2, 2);
	}
	
	@Test
	public void testInvoker_DeleteMultiXMLMultiChange2() {
		x1.invoker(2, 0, 2);
	}
	
	@Test
	public void testInvoker_DeleteMultiXMLMultiChange3() {
		x1.invoker(2, 2, 0);
	}
	
	@Test
	public void testInvoker_DeleteMultiXMLMultiChange4() {
		x1.invoker(2, 0, 0);
	}
	
	@Test
	public void testInvoker_DeleteInvalidXMLChange() {
		x1.invoker(2, -1, -1);
	}
	
	@Test
	public void testInvoker_InvalidTask() {
		x1.invoker(3, -1, -1);
	}

}
