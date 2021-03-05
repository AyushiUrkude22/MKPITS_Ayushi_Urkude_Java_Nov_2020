//Java program Example to demonstrate StringBuilder append() method.
//The StringBuilder append() method concatenates the
//given argument with this string.

import java.util.*;
class StringBuilderEx1
{
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Ayushi");
		sb.append(" ");
		sb.append("Urkude");
		System.out.println(sb);
		//System.out.println(sb.toString()); gives same output.
	}
}