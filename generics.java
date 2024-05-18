package DSA;

// Generic: it is used to avoid overloading

interface abc<T> // generic type of interface
{
	void call(T t); 
}

class demo<T> implements abc<T> // (it can access any type of datatype .) this is the right way of generic interface implementation
{
	public void call(T t) //parameter of any datatype is allowed to pass
	{
		System.out.println(t);
	}
}
public class generics {
	public static void main(String args[])
	{
		// any type of object can be passed
		demo a=new demo();
		a.call("hello");
		a.call(90);
		a.call(90.33222);
	}

}
