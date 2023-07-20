# Lesson 4 Notes (WIP)
Programs are typically solutions to problems that are mathematical and very repetitive in nature. In this lesson we will
look at ways to store lots of data into a single variable and methods of traversal.

### Storing multiple values into a single variable
There are a few ways to store lots of data under a single variable name. These are typically called data structures.
This lesson will only go over one of the simplest data structures, the array, but it is important to be aware there are
other alternatives. The array works by allocating several sequential memory spaces all at once. This also means that the
size of the array is set when we allocate the memory for it, or in other words, when we create the array.

To create an array variable, just add the square brackets `[]` after the type. Unlike with primitive types, declaring
the array is a separate command from allocating memory for the array. Think of "declaring" as creating a label vs
"allocating" making the box the label goes on. The "assignment" would be putting the label on the box. So the following
line of code is a sequence of 3 separate commands:

```java
int[] myArray = new int[10];
```

Lets break this down. The first part is the declaration, `int[] myArray`. We tell the computer we are making an array
(signified by the square brackets), of the data type integer (defined the by the keyword int), with the variable name
"myArray" (see lesson one for guidelines on variable names). The second part is the command to reserve the memory space
for the array, `new int[10]`. First, we let the computer we are allocating memory with the "new" keyword. Next, we
specify the data type (very important since it tell the computer how much space each element will need). Finally, we
tell it the total number of elements in the array by putting a number in the square brackets, "[10]" indicates a total
of 10 elements.

Once we have the array created we can then get and store values in and out of it. Simply treat the array just like any
other variable, except specify which space you want to access. We do this by adding an address to our reference. For
example, to put the value 10 in the 0th spot in our array, use the following command:

```java
myArray[0] = 10;
```

Or to use the value inside the array:

```java
System.out.println(myArray[0]);  // Prints the value stored at index/address 0 in the array
```

Array Addresses start at 0 and increment up to, but not including, there size. The address value is an int, so it is
possible to use an integer variable to control what address gets accessed. Another tip is you can get the size of the
array, by referencing is member "length". An example of this is: `myArray.length` should return the value 10.

Lastly, there are alternative ways to allocate (sometimes referred to as initializing) the array by specify the
values directly.

```java
int[] altArray = {0, 0, 0, 0, 0}; // only works when on same line as variable declaration
altArray = new int[]{1, 2, 3, 4, 5}; // alternative that does not need to be on same line as variable declaration
```

### Loops
Ever wondered if you could make the code in an if statement run repeatedly? Well you can! Now introducing the `while`
loop. Jokes aside, the while loop allows for a block of code to be run repeatedly. Between each cycle, it checks the
conditional argument specified to see if it should continue looping. It is important to note that it also check the
condition prior to the first cycle. This means if the codition is not initially true, it won't run the loop code at all.

An example of a while loop looks like this:
```java
int i = 0;
while (i < 5) {
    // code that loops goes here
    System.out.println("i = " + i);
    i += 1;
}
```

This code should output:
```
i = 0
i = 1
i = 2
i = 3
i = 4
```

### Bring it Together
Combining loops and arrays is a powerful tool. Here is an example of printing all the values in an array to the screen:

```java
int[] arr = {1, 4, -7, 0, 50};
int i = 0; // this is the first address in the array

while (i < arr.length) { // Loop until i is exceeds the array's addresses
    // remember the last address is the size of the array - 1
        
    System.out.println("arr[" + i + "] = " + arr[i]); // print i and the value of arr at index i to the screen
    
    i += 1; // increase i's value by 1
}
```

Expected Output:

```
arr[0] = 1
arr[1] = 4
arr[2] = -7
arr[3] = 0
arr[4] = 50
```

### After Lesson Review
Write a function that take in an integer array and outputs the sum of all the elements, squared, in the array, squared called
`sumOfSquares`.

Example Usage:
```java
public static void main(String[] args) {
    int[] myArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int result = sumOfSquares(myArr);
    System.out.println("Sum of Squares for myArr is " + result);
}
```

Expected Output:
```
Sum of Squares for myArr is 385
```