1) Prerequisite  
a) Introduction - https://www.youtube.com/watch?v=QaKX6SjU1vg&list=PLIY8eNdw5tW_uaJgi-FL9QwINS9JxKKg2&index=1  
b) jdk, jre and jvm - https://www.guru99.com/difference-between-jdk-jre-jvm.html  
c) jdk, jre and jvm video - https://www.youtube.com/watch?v=6wd2P2JTp9s&list=PLIY8eNdw5tW_uaJgi-FL9QwINS9JxKKg2&index=2  
d) jvm architecture - https://dzone.com/articles/jvm-architecture-explained  
e) Execution of Java Program - https://www.youtube.com/watch?v=GXUiEouK7DM  

2) Basics  
a) Boilerplate  
b) print statements
c) declaration statements 
d) variables, literals, data types, expressions, operators, operands  
e) primitive types - bool,char,byte,short,int,long,float,double  
f) packages, overflow & underflow 
g) wrapper class: https://www.javatpoint.com/wrapper-class-in-java  
h) errors: https://www.geeksforgeeks.org/types-of-errors-in-java-with-examples/  
i) sizes/ranges and width/total number of bytes or space occupied of primitive data types  
j) Type casting - implicit and explicit
-- implicit/automatic = small to large datatype
-- explicit = large to small datatype  
h) unicode for java - 2 bytes of char can represent any one of the 65525 characters   
i) 


** Important functions to remember
1) Autoboxing
int a=20;  
Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally
2) Unboxing
Integer a=new Integer(3);    
int i=a.intValue();//converting Integer to int explicitly  
int j=a;//unboxing, now compiler will write a.intValue() internally
3) int a = Integer.MAX_VALUE; //Integer wrapper class max value  
4) long a = 100L; //declaration of long value and use f for float values  
5) 


** Note
1) java folder->topic file->package->class files
2) int/double is default in java, so you have to type cast the variables while solving expressions
to other data types, if you want your answers in other datatypes
3) bool default value is false  
4) prefer double over float as may lib works with double  
5) for more precise calculations BigDecimal class is used
6) 