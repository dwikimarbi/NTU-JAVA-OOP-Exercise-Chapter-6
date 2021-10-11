package _6_2_Polymorphism;
/*
 * 
 * @author DNABigBoss
 * 
 */
public class BigDog extends Dog {
	@Override
	public void greeting() {
		System.out.println("Woow!");
	}
	   
	@Override
	public void greeting(Dog another) {
		System.out.println("Woooooowwwww!");
	}
}
