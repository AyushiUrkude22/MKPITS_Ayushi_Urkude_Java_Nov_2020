//Simple example of StringTokenizer class

import java.util.StringTokenizer;

public class Simple{
public static void main(String args[]){
StringTokenizer st = new StringTokenizer("my name is Ayushi"," ");
while (st.hasMoreTokens()) {
System.out.println(st.nextToken());
}
}
}