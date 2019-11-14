/**
 * 
 */
package com.luxy.stu.factory;

/**
 * @classDesc: 动物工厂
 * @author: luxy
 * @createTime: 2019年11月13日
 * @email: luxy@primeton.com
 */
public class AnimalFactory {
	
	public Animal getAnimal(String animalName){
		Animal animal = null;
		if(animalName != null){
			switch (animalName) {
			case "Monkey":
				animal = new Monkey();
				break;
			case "Rabbits":
				animal = new Rabbits();
				break;
			case "Panda":
				animal = new Panda();
				break;
				
			default:
				animal = new Animal() {
					
					@Override
					public void eat() {
						// TODO Auto-generated method stub
						System.out.println("未知动物种类......");
					}
				};
				
				break;
			}
		}
		return animal; 
	}

}
