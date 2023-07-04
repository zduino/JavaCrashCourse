# Lesson 1 Notes (WIP)

### What is an IDE and why do we use them?
An IDE is an Integrated Development Environment. This is a fancy text editor that has a bunch of programming specific
tools and functions that aid in writing and reading code. There are several IDE's out there, many are language
specific. Ultimately, it is the user's preference when selecting one to use.

### Writing messages to the screen
The first function (command) we will look at is the `println` command. This function allows us to send data to the screen
we can read while the program is running. To make a `println` call, we first need to tell the computer where we want to
send the message/data. In this case, that is the System output file stream, or more commonly called, the console. After
we preface our call with this we then tell it what we want to do with this object, print something.
```java
System.out.println("Hello World!");
```
This is a very important function that we will use all the time. In fact, we use it so much there is a shortcut to
that the IDE has to write it faster. Type the word `sout` followed by pressing `TAB` key. The IDE should automatically
replace `sout` with `System.out.println()`. Pretty cool, right?

The ln at the end of println means it will append a new line character at the end of the data it is sending to the
console. This is the equivalent of pressing the enter key after you are done writing a line. There is a variant or
println which is print that will not add a new line character. This is normally used when you have multiple prints that
you want all on the same line of the terminal.

We will talk about getting input from the console in a later lesson.

### How does the computer store data?
The computer stores all data as numbers in its memory, called RAM. In java, we can tell the computer to allocate space
in its memory by specify what type of data we want to store and what label we want to give that space. This label is
commonly referred to as a variable. Variables have to have a name that starts with a letter, can use numbers, and is all
one word. Many naming conventions are used, but the most common is camel case which is what we will use in this course.

Fun Fact: in some languages other than Java, it is required to manually delete a
variable after creating it. Forgetting to do this is commonly know as a memory leak.

--- 
#### Built-in Types
*Integer*: a positive or negative whole number. Example: -1, 1, 34, 0

`int myInt;` ranges from -2,147,483,648 to 2,147,483,647

`long myLong` ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

`myInt = 10;`
`myLong = 10L;`

*Floating Point*: a positive or negative number with a partial value (e.g. a decimal place). It is important to note that
Java expects a lowercase f following the number if it is a float. Otherwise, it will interpret the number as a double.
Example: -1.0, 55.5f, 0.1234

`float myFloat;`
`double myDouble;`
`myFloat = 10.1f;`
`myDouble = 0.999;`


*Character*: a written letter, number, or symbol. Define using single quotes. Characters are stored as numbers internally
and only displayed as their corresponding symbol when we need to read it. This conversion is via ascii code. Example:
'c', 'A', '\n', '\'', ' ', '3'

`char myChar;`
`myChar = '!';`

There are special characters that can be defined with using a backslash. For example, the newline character is '\n' and
tab character is '\t'.

*String*: an Object that stores array of characters and provides methods to manipulate them. Define using double quotes.
Example: "Hello World!"

`String myString;`

*Boolean*: a logical value which is true or false
`bool myBoolean;`
`myBoolean = true;`

--- 
### What can we do with data?
We can access data by referencing the variable names and manipulate it using operators. Operators are commands that take
an input and return an output. For example the addition operator `+` takes two numbers and returns their sum. Operators,
like functions, can be overloaded. This means they can perform different actions based on what is passed into them.

#### Operators
General
- Assignment `=`: stores a value into a variable `myVar = 10;`

Arithmetic
- Addition `+`: adds two number together `2 + 3` returns `5`
- Subtraction `-`: subtracts one number by another `2 - 3` returns `-1`
- Multiplication `*`: multiplies two numbers by each other `2 * 3` returns `6`
- Division `/`: divides one number by another `3.0 / 2.0` returns `1.5` and `3 / 2` returns `1`
Beware losing precision due to using wrong types!
- Modulus `%`: divides one number by another number and returns the remainder `3 % 2` returns `2`

Boolean (Logic) Arithmetic
- Not `!`
- And `&&`
- Or `||`

String
- Concatenation `+`: Combines two strings together into a single longer string

Bitwise Arithmetic
- Not `!`
- And `&`
- Or `|`
- Xor `^`
- Complement `~`

Compound Forms
+=, -=, *=, /=
```java
int myInt;
myInt = myInt + 10; // Original
myInt += 10; // Compound equivalent
```
Declaration and Assignment
`int myInt = 10;`

#### Methods
String
- Length `myStr.length()`: Gets the number of characters in the string
- Equals `myStr.equals(myOtherStr)`: Compares the values of two strings

Program output stream
- Print `System.out.print("My string")`: prints the arguments to the console
- Print New Line `System.out.println("My string")`: prints the arguments to the console followed by a new line character

### Code Readability
Many programmers become very opinionated when it comes to the syntax and structure one should use while writing a
program. In this course, we will follow some of the most popular "rules" that are typically seen in the industry. It is
important to note, the universal rule when working on a piece of code is to match the style of the code already in the
file. This keeps projects readable and manageable in the long term.
#### Typical Style Guidelines
- Only indent when writing a code block (think curly braces) or splitting a command between multiple lines.
- Comment, Comment, Comment
- 1 Tab = 4 Spaces
- Follow Case rules when naming variables based on scope (locals start with lower case, global/members start with upper case, and
private members start with underscore)
- methods are always start lowercase
- Use camel casing
- AVOID abbreviations when possible or leave a comment explaining them
- 'i', 'j', and 'k' are names reserved for use in loops locally
- Use functions when possible to simplify repetitive code
- Use constants when possible to reduce hard coded values
- More lines != Better Code
- Longer lines != Better Code
#### Comments
`// Single line comment`
```java
/*
 * Multi-
 * line
 * Comment
 */
```

## Post Lesson Review
#### Warmup

#### Problem 01
Calc area (in^2) of a circle given the radius (in). Print both values to the terminal. Bonus for using Java's Pi


## Other Resources
Example of a real code style guide: [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
![Ascii Table](https://web.alfredstate.edu/faculty/weimandn/miscellaneous/ascii/ASCII%20Conversion%20Chart.gif)