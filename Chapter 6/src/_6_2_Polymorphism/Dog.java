package _6_2_Polymorphism;
/*
 * 
 * @author DNABigBoss - hanunalya22@gmail.com
 * 
 */
public class Dog extends Animal {
	@Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}
