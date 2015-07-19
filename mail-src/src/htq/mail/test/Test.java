package htq.mail.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

import javax.naming.LinkLoopException;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.taglibs.standard.lang.jstl.ArraySuffix;
import org.apache.velocity.app.VelocityEngine;

public class Test {
	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Test() {
		super();
		System.out.println("init test..");
	}

	static{
		System.out.println("static mechod..");
	}
	public static void main(String[] args) {
		System.out.println(StringUtils.rightPad("abc", 4));
		Test t = new Test();
		
	}
}
