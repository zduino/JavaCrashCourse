# Lesson 2 Notes (WIP)

## Conditionals
### Booleans
True and false are boolean values. We can use these values in combination with conditional statements to control whether
blocks of code are executed by the program. The simplest and most common condition in programming is the `if` statement.
The if statement has an input of one conditional value and determines whether the proceeding code block is executed.
Remember that code blocks are defined by code between curly braces `{ }`.

Booleans values are also the result of comparators. You will probably remember these from math class as in equalities.
In summary, two values can be compared which results in a true or false value based on which comparator is used.

### Comparators

- Is equal to `==` - first value must be equal to second value
- Is not equal to `!=`
- Is less than `<`
- Is less than or equal to `<=`
- Is greater than `>`
- Is greater than or equal to `>=`

### Boolean Operators

Boolean operators are operations we can use on multiple booleans to get a resultant single boolean. This is useful when
trying to combine multiple conditionals together. Note that parenthesis have a higher operation precedence and
can/should be used to control the order of operations in large and more complex equations.

- AND `&&` - both values must be true
- OR `||` - either value must be true
- NOT `!` - inverse of boolean value

### Conditional Statements
if statement
```java
if (true) {
    // This code runs when true is passed into the if statement.
}
```

if-else statement
```java
if (true) {
    // This code runs when true is passed into the if statement.
} else {
    // This code runs when false is passed into the if statement.
}
```

if-elseif statement
```java
if (true) {
    // This code runs if true is passed into the first if statement.
} else if (true) {
    // This code runs if false is passed into the first if statement
    // and true is passed into the second if statement.
}
```

if-elseif-else statement
```java
if (true) {
    // This code runs if true is passed into the first if statement.
} else if (true) {
    // This code runs if false is passed into the first if statement
    // and true is passed into the second if statement.
} else {
    // This code runs if false is passed into the first if statement
    // and false is passed into the second if statement.
}
```
*Note:* You can add as many `else if` statements to the conditional chain as needed, but you can only have one starting `if` and
ending `else`.

## Post Lesson Review

#### Problem 01
Create an integer variable called x and store a value in it. Using conditionals, check if the value stored in variable x
is divisible by 3. Use print statements to output the result of the program to the user.
