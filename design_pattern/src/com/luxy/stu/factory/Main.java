/**
 * 
 */
package com.luxy.stu.factory;

/**
 * @classDesc: 工厂模式入口
 * @author: luxy
 * @createTime: 2019年11月13日
 * @email: luxy@primeton.com
 */
public class Main {
    public static void main(String[] args) {
    	AnimalFactory animalFactory = new AnimalFactory();
    	Animal a1 = animalFactory.getAnimal("Monkey");
    	Animal a2 = animalFactory.getAnimal("Rabbits");
    	Animal a3 = animalFactory.getAnimal("Panda");
    	Animal a4 = animalFactory.getAnimal(" ");
	    a1.eat();
	    a2.eat();
	    a3.eat();
	    a4.eat();
	}
}
