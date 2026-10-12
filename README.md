        LAB3

The JDK version and Java package.
    JDK: Microsoft OpenJDK 21

Package: ie.atu.oop.week1
Why the constructor checks for null before calling isBlank().
    It checks for null before calling isBlank() because calling a method on null would cause a NullPointerException error and stop the program.
Why title, author and pageCount are final while status is not.
    The title, author and pageCount fields are private and final because they should not change after initialising
Why Book uses borrowBook and returnBook rather than a status setter.
Which checks belong in Book and which belong in LibraryService.
    LibraryService
        loan durations outside
    Book
    prevents repeated borrowing or returning of books and checks if data is within expected range
The results of a successful loan, a rejected loan, a rejected return and the Maven build. 
Your debugger observations and any material AI assistance.

        Lab4 Collections and Generics
State that Lab 4 changes LibraryService from working with a single supplied Book to owning a
List<Book>.
    The list book is a way of storing multiple(n number of) books without having to declare all of them when programing

Explain what List<Book> tells the compiler.
    The variable is a List that accepts Book references.

Explain why final does not prevent books.add(...).
    Final doesn't let the variable reference ie name be changed but its values can be updated

Explain what the enhanced for loop variable represents.
    In the enhanced for loop the loop iterates through one book from the list, previously each book to be worked on had to be called manually

Describe what findBookByTitle returns for a known and an unknown title.
    It iterates throught the list to find a matching value,It returns the matching Book, or null if no match exists.

Explain why removeBook reuses findBookByTitle instead of writing another search loop
    The find book by title already has the same code as what remove book, so doing this avoids repeating the search logic. 

Explain which responsibilities belong to Main, LibraryService and Book.
    Main creates books, calls the service and prints results.
    LibraryService manages the books list, it has functions to add book, remove book and find book etc...

Used ChatGPT to understand and the required version of InteleJ,JAVA and Maven to run on personal computer with the help of lab assignment sheets 1-4


        Lab5 Exceptions, CSV and Library Persistence


Briefly explain the difference between the throw statement inside Book and the catch block used by the caller.
        
Record what Path.of(...) does and name one Path method and one Files method used in the lab.
State that Lab 5 adds exception handling and CSV persistence to the Library application.
Explain the difference between unchecked NumberFormatException and checked IOException.
Explain the difference between Path and Files.
Explain how ON_LOAN is restored without adding setStatus().
Record any material AI assistance used. 