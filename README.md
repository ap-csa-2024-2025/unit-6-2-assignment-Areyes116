[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17761295)
# unit-6-2-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

Within the `Main` class, create the following methods (remember that they must be static in order to be used with `main`).

## Problem 1
Write a method called `containsNeg` that takes in an array of doubles as parameter, and returns true if the array contains a negative element, and false otherwise.  Test your method in `main`.

```
Enter array length:
4
Enter values:
1.1
2.2
3.3
-4.4
Contains negative: true

Enter array length:
3
Enter values:
1.1
2.2
3.3
Contains negative: false
```

## Problem 2
Write a method called `numDivisibleBy3` which takes an array of integers as parameter, and returns the number of elements that are divisible by 3.

```
Enter array length:
5
Enter values:
3
6
3
1
2
Number divisible by three: 3

Enter array length:
5
Enter values:
1
2
4
5
7
Number divisible by three: 0
```

## Problem 3
Write a method called `numDivisible` which takes in an array of integers and a number, `num`, as parameters.  The method should return the number of elements in the array that are divisible by `num`.

```
Enter a value for num:
2
Enter array length:
5
Enter values:
1
2
3
4
5
Num divisible by 2: 2

Enter a value for num:
3
Enter array length:
5
Enter values:
1
2
3
4
5
Num divisible by 3: 1
```
