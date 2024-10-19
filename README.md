# Book Management System

## Overview
This project is a simple **Book Management System** written in Java. It allows users to manage a collection of books by adding, displaying, and removing books. The system keeps track of each book's name, author, and price, and provides an interactive command-line interface to perform these actions.

## Features
- **Add a Book**: Add books to the collection by specifying the book name, author name, and price.
- **Display Books**: View all available books in the collection.
- **Remove a Book**: Remove a specific book by its name.
- **Object-Oriented Design**: The project uses inheritance, where the `RmBk` class inherits from `AddBk` to enable shared behavior.

## How It Works
1. **Add a Book**: The user inputs the book name, author, and price. These are stored in an `ArrayList` as formatted strings.
2. **Show Books**: The system displays all books available in the library.
3. **Remove a Book**: The user specifies the name of the book they want to remove. If the book exists in the list, it is removed.

## Usage
After compiling the Java files, run the program and interact with the command-line interface to add, view, and remove books from the collection.

### Example Commands:
1. **Add a Book**:
   - Input:  
     ```
     Enter the book name: Java Programming  
     Enter the author name: Author X  
     Enter the price: 300  
     ```
   - Output:  
     ```
     Added successfully.......
     ```

2. **Display Available Books**:
   - Output:  
     ```
     Available books:  
     [Name: Java Programming, Price: 300, Author-Name: Author X]
     ```

3. **Remove a Book**:
   - Input:  
     ```
     Enter the name of the book to remove: Java Programming  
     ```
   - Output:  
     ```
     Removed book 'Java Programming' successfully..
     ```

## Technologies Used
- **Java**: Core programming language
- **ArrayList**: Data structure used to store book information

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/LibraryManagementSystem.git
