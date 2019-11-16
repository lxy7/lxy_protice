/**
 * 
 */
package com.luxy.stu.strategy;

import java.io.StreamTokenizer;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019��11��14��
 * @email: luxy@primeton.com
 */
public class Context {
	
	private Strategy strategy;
	
	/**
	 * 
	 */
	public Context(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
	}
	
	public double getPrice(double price){
		return strategy.getPrice(price);
	}

}
