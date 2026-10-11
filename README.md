The JDK version and Java package.
    JDK: Microsoft OpenJDK 21

    Package: ie.atu.oop.week1
• Why the constructor checks for null before calling isBlank().
    It checks for null before calling isBlank() because calling a method on null would cause a NullPointerException error and stop the program.
• Why title, author and pageCount are final while status is not.
    The title, author and pageCount fields are private and final because they should not change after initialising
• Why Book uses borrowBook and returnBook rather than a status setter.
• Which checks belong in Book and which belong in LibraryService.
    LibraryService
        loan durations outside
    Book
    prevents repeated borrowing or returning of books and checks if data is within expected range
• The results of a successful loan, a rejected loan, a rejected return and the Maven build.
• Your debugger observations and any material AI assistance.