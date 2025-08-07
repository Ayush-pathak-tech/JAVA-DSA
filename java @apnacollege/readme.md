# Array2D.java Documentation

## Overview

`Array2D.java` demonstrates how to work with 2D arrays (matrices) in Java. It covers:
- Taking user input for the size of the matrix (rows and columns)
- Populating the matrix with user input
- Searching for a specific value in the matrix and printing its index

## How It Works

1. **Input Matrix Size:**  
   The program prompts the user to enter the number of rows and columns for the 2D array.

2. **Input Matrix Elements:**  
   The user is prompted to enter each element of the matrix row by row.

3. **Search for a Value:**  
   The user enters a value `x` to search for in the matrix.  
   The program iterates through the matrix and prints the indices where `x` is found.

4. **Output:**  
   - The indices of the found value are printed in the format:  
     `Index number is : rowIndexcolumnIndex`
   - Each row is printed on a new line.

## Example Usage

```
Enter rows and colns
2 3
Enter elements in matrix
1 2 3
4 5 6
Enter number x
5
Index number is : 11
```

## Key Concepts Demonstrated

- Declaration and initialization of 2D arrays
- Nested loops for input and output
- Basic search in a 2D array
- User input handling with