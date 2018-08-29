// overriding speak() function

class Animal{
	String breed;
	String colour;

public void speak(){
	System.out.println("inside Animal class");
}
}

class cat extends Animal
{
public void speak(){
	System.out.println("I am a cat");
}
}

class dog extends Animal
{
public void speak(){
	System.out.println("I am a dog");
}
}

class mainclass
{
public static void main(String[] args)
{
	Animal a=new Animal();
	a.speak();
	a=new cat();
	a.speak();
	a=new dog();
	a.speak();
}
}