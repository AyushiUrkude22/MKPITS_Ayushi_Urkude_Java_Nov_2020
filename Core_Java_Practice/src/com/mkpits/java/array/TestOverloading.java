package src.com.mkpits.java.array;
/* Java program example for overloading java main() method.
You can have any number of main methods in a class by method overloading
But JVM calls main() method which receives string array as arguments only */

class TestOverloading
{
    public static void main(String[] args)
    {
		System.out.println("main with String[]");
		main("calling main with string argument/parameter");
		main();
	}
    public static void main(String args)
    {
		System.out.println("main with String");
	}
    public static void main()
    {
		System.out.println("main without args");
    }
}
