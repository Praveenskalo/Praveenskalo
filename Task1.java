BRANCHING AND LOOPING STATEMENTS
Question No - 1 
1). Write a program to print the numbers from 10 to 50 using for loop/ while loop?
Answer:
public class Task1
{
	public static void main(String args[])
	{
		int i=10;

		while(i<=50)	
		{
			System.out.println(i);
			i++;
		}
	}
}
OUTPUT:
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50


QUESTION NO - 2
2). Write a program that find a number is negative or positive
ANSWER:
public class PositiveorNegative
{
	public static void main(String args[])
	{
		double number =10.00;
		if(number>0.0)	
		{
			System.out.println(number + "is a positive number");
		}
		else if (number<0.0)
		{
		    System.out.println(number + "is a positive number");   
		}
	}
}
OUTPUT:
10.0is a positive number


QUESTION NO- 3
3). Write down the program to reverse the given number using loops
ANSWER:
public class Reverse {
  public static int rev=0;
  public static void main(String[] args) {
    int number=876;
    int rem = number%10;
    System.out.println("Given number =" + number);
    System.out.println("Reverse number =" + rev);
}
  public static void usingwhileloop (int number) {
      for(;number !=0; number = number/10)
      int rem = number%10; 
      rev = rev*10+ rem;
  }  
}
OUTPUT:
Given number = 876
Reverse number = 678


QUESTION NO - 4; 
4). Write a java program to find the smallest number among three numbers
ANSWER:
public class SmallestInThree {

	public static void main(String[] args) {
		//three numbers
		int a = 20;
		int b = 10;
		int c = 30;
		int smallest;
		//find the smallest
		if(a<b) {
			if(c<a) {
				smallest = c;
			} else {
				smallest = a;
			}
		} else {
			if(b<c) {
				smallest = b;
			} else {
				smallest = c;
			}
		}
		System.out.println(smallest + " is the smallest.");
	}
}
OUTPUT:
10 is the smallest

QUESTION NO 5:
5). Write a Java program to print a bellowed pattern:
55555
54444
54333
54322
54321
ANSWER:

public class Pattern {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int k = 5 - i;
for (int j = 5; j > 0; j--) {
if (j > k){
System.out.print(j);
}
else{
System.out.print(k);
}
}
System.out.println();
}
}
}
OUPUT:
55555
54444
54333
54322
54321






