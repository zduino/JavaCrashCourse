# Lesson 3 Notes (WIP)
In computer science, programs are mainly used to handle tedious and repetitive tasks that are hard for humans to
complete without making mistakes. This leads to the belief that programmers are lazy. And in some ways that is true. So
true it has become a defining direction of the structure of programming language. One such manifestation of this is the
function structure.

Note that in the context of this course, method and function may be used interchangeably but refer to the same thing in
Java.

### Functions
Functions are blocks of code that we can preemptively define and call anywhere, anytime in our program. There are six
parts to a function: the modifiers, the return type, the function name, the parameters, the contained code, and the call.

The basic structure looks like this:
```java
modifiers return_type function_name(parameters) {
    // function's code goes here
}
```

Modifiers allow use to tell the computer how to handle our function. For now, we will only be using the `static`
modifier. We will reexamine modifiers when we discuss objects.

The return type indicates what type of data the function will be returning to our call once it has finished running.
The keywords for the types are identical to the data types we previously covered in lesson 1 for variables. The
exception is the additional type `void`, which means no data is being returns. We have already used this many times when
writing our `main` function.

It is important to note that a function code is only executed when we call the function.

### Parameters
Parameters are variables that store the data we pass from a call to the code inside the function. To add a parameter,
specify a type and a variable name for the parameter. This can be blank if no parameters are needed.

An example of a function with 1 parameter:
```java
static void myFunction(int x) {
    // code that does something with x here
}
```

With multiple parameters:
```java
static void myFunction(int x, char c, String text, double d) {
    // function's code here
}
```

Or no parameters:
```java
static void myFunction() {
    // function's code here
}
```

It is good practice to give your parameters names that give meaning what they do in the function or use documentation
(comments) to explain their usage.

### Returning Data
Functions allow for one value to be returned to where the call was made. This is done using the `return` statement. The
return statement takes one value (or none in the case of a void function). Of the type that the function was defined to
have. For example:
```java
static int myAdder(int x, int y) {
    int sum = x + y;
    return sum;
}
```
An example call to this function could look like:
```java
int result = myAdder(4, 5);
```
The program calls our function and passes 4 and 5 as the parameter values to it. The code takes our parameter values and
executes which results in the value 9 being returned to the call. The value is then stored into the variable result that
we created.

### Overloading
Overloading is when multiple functions share the same name but have different parameters. We typically use this to
handle the case of multiple situations where a function does the "same" thing but in different ways. An example of this
could be a function that calculates the square of a number. Since we have many types of numbers in software, we have to
handle the different possible combinations separately.
```java
static int square(int x) {
    return x * x;
}
static double square(double x) {
    return x * x;
}
```
The number of parameters could also be the difference instead of the parameter type.
```java
static int sum(int x, int y) {
    return x + y;
}
static int sum(int x, int y, int z) {
    return x + y + z;
}
```

### Post Lesson Review

Create a function takes 3 double and returns the largest one. Print the value that is returned by your function.