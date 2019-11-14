/**
 * 
 */
package com.luxy.stu.factory;

/**
 * @classDesc: ���﹤��
 * @author: luxy
 * @createTime: 2019��11��13��
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
						System.out.println("δ֪��������......");
					}
				};
				
				break;
			}
		}
		return animal; 
	}

}
