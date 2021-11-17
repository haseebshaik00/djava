**1) Prerequisite**  
a) Introduction - https://www.youtube.com/watch?v=QaKX6SjU1vg&list=PLIY8eNdw5tW_uaJgi-FL9QwINS9JxKKg2&index=1  
b) jdk, jre and jvm - https://www.guru99.com/difference-between-jdk-jre-jvm.html  
c) jdk, jre and jvm video - https://www.youtube.com/watch?v=6wd2P2JTp9s&list=PLIY8eNdw5tW_uaJgi-FL9QwINS9JxKKg2&index=2  
d) jvm architecture - https://dzone.com/articles/jvm-architecture-explained  
e) Execution of Java Program - https://www.youtube.com/watch?v=GXUiEouK7DM  

**2) Basics**  
a) Boilerplate  
b) print statements
c) declaration statements 
d) variables, literals, data types, operators, operands and expressions   
e) primitive types - bool,char,byte,short,int,long,float,double  
f) packages, overflow & underflow 
g) wrapper class: https://www.javatpoint.com/wrapper-class-in-java  
h) errors: https://www.geeksforgeeks.org/types-of-errors-in-java-with-examples/  
i) sizes/ranges and width/total number of bytes or space occupied of primitive data types  
j) Type casting - implicit and explicit
-- implicit/automatic = small to large datatype
-- explicit = large to small datatype  
k) unicode for java - 2 bytes of char can represent any one of the 65525 characters   
l) to represent a unicode character - '\u0040'
m) comments - single line and multiline comments  
n) condition/control flow statements - if-then(code block, short-circuit), if else,  
o) operators - (arithmetic, logical, relational, assignment, bitwise, bit shift, 
conditional and type comparison-instanceOf ~ only for objects)
p) operator precedence - http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html  
q) keywords, expression ~ variable,operators and operands but not datatype and semicolon, statements, 
white spaces, indentation, code blocks, scope of variables  
r) diffmerge tool  
s) control flow statements(switch, for, while, do while)
-- switch accepts byte, short, char, int and string datatypes only 
t) Parsing values from a string ~ string to other datatypes  
int n = Integer.parseInt(str);  
u) Scanner Class  
- parses all primitive and string types  
- internally uses parse methods  
- scans the input and stores the value in the variable  
- uses methods like next() to do the above task  
- import java.util.Scanner;  
- close the scanner after use with sc.close();  
- What is the difference between scanner next and scanner nextLine?
  A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. 
  next() : Finds and returns the next complete token from this scanner. nextLine() : Advances this scanner 
  past the current line and returns the input that was skipped.  
- cin.ignore ~ sc.nextLine();
- hasNextInt() - checks if next input is int or not  
- 

**3) Functions/Methods**
a) method overloading - only changing the return type of the function doesn't ensures method overloading different 
number of parameters or different datatype of the parameters or diff order of parameters is a must condition  
b) method overloading vs overriding - 
https://medium.com/@madhucynixit/difference-between-method-overloading-and-method-overriding-in-java-d3b71aa79e38  
c) method overloading basically improves code readability and usability  
d) some keywords - static, final and const  
- private static final String INVALID_VALUE_MESSAGE = "Invalid Value";  
- new keyword creates an instance of a class
// if we are using this variable in a static method then it should also be defined as static  
final : once we assign this keyword to a variable we cannot change it's value


**4) Strings**  
a) max size of a string can be determined by the size of memory or the max size of int 2.14b  
b) strings can be appended using +, unicode characters can also be appended in this  
c)  if we add a string and an integer the integer gets appended to the string i.e. 
the integer is treated as a string  here  
d) strings are immutable in java, everytime an updation is done a new string is created, the old one 
is discarded and the old one gets the values of the new string
e) appending strings can be done efficiently using StringBuffer  
f) .toLowerCase() and toUpperCase()  
g) to truncate after 2 decimal points
String.format("%.2f",a);  


**5) OOPS**  
a) 



**\*\*Notes**  
1) java folder->topic file->package->class files  
2) int/double is default in java, so you have to type cast the variables while solving expressions  
to other data types, if you want your answers in other datatypes  
3) bool default value is false  
4) prefer double over float as may lib works with double only  
5) for more precise calculations BigDecimal class is used  
6) int a=false; if(a=true) sout("yes"); // this line wont give an assignment operator error because the type in the condition  
statement is boolean and in the if statement basically assignment is being done  
7) the statement in the print function is also an expression  
8) Math class is used to perform mathematical operations on numbers  
- Math.round();
9) A package can contain a number of classes and accessing a class from other class totally depends on the access specifier of 
the class which is required to be accessed.  
10) Same as above, a project contains a number of packages and we can access packages by importing them
11) Autoboxing
       int a=20;  
       Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
       Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally 
12) Unboxing
    Integer a=new Integer(3);    
    int i=a.intValue();//converting Integer to int explicitly  
    int j=a;//unboxing, now compiler will write a.intValue() internally
13) int a = Integer.MAX_VALUE; //Integer wrapper class max value
14) long a = 100L; //declaration of long value, use d for double for double
    but not necessary as default is taken as double and use f for float values
15) 