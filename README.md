# java-practice
Collections of java fundamental lessons

After you have successfully installed Java on your machine, you need to start 
developing.

## Data Types in Java 
Java has primitive types and reference types.
The primitive types holds value while the reference types holds the reference to 
an object.

To declare a variable in Java, do :

```
type varName = value ; 

int age = 28 ; 
```

By default, use int for whole numbers and double for floating point numbers. 

## Packages 
A Package is a way another way to introduce modularization in development.
It makes it possible to group related codes together in the same directory(package) 

A package is just a directory but it is a logical grouping for code. 

Assuming you have your domain as bigjara.com , the naming convention for 
your package should be :

com.bigjara.* 
Where * is any package 

See my directory listing below:
com.bigjara 
    user
        User.java
    transaction
        Transaction.java
    order 
        Order.java 
Main.java 
```
import com.bigjara.user 
importt com.bigjara.transaction 
import com.bigjara.order 

public static void main(String ...args){
    User user = new User() ; 
    //Continue processing
}
```

## Exception Handling 
An Exception refers to error that occurs at runtime.

With Exception Handling we can handle runtime errors in a structured way. 

In Java, all exceptions inherit from the Throwable base class. When a runtime error occurs , an object of exception is generated.

There are two major subclasses of exceptions and they are : Exception and Error

Exceptions of types Error are related to errors that occur in the JVM and not your program. They are beyond your control.

Errors that results from program activity are represented by the Exception subclass. They include divide by zero , file errors , array out of bound , etc.

An important subclass of Exception is RuntimeException which is used to represent runtime errors .

```
//CustomError.java 

class CustomError extends Exception {
    private String message ; 
    CustomError(String msg){
        this.message = msg ; 
    }

    public String toString(){
        return this.message ; 
    }
}


//ErrorExample.java
 
class ErrorExample {
    public int divide(int a , int b){
        try{
            if (b == 1){
                throw new CustomError("This is a custom error. Generated when b is 1")
            }
            return (int) a/b ; 
        }catch(Throwable e){
            System.out.println(e.toString()) ; 
            return -1
        }finally{
            System.out.println("This always run") ; 
            return 0;
        }
    }
}


```

## Interfaces 
An interface is a method that can be implemented by an object.
Programming to an interface makes it easier for common objects with 
different behavioural implementations to dictate their behaviour