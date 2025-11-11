# Library Borrowing Records

library_records = {
    "Manali": ["Data structures", "C++", "Python"],
    "Hermione": ["C", "OS"],
    "Ron": [],
    "Ansh": ["Data structures", "Java", "Python"],
    "Snehi": ["C"],
    "Eve": []
}

# Total members
total_users = len(library_records)
print("Total members in library:", total_users)

# Total books borrowed
total_books = sum(len(books) for books in library_records.values())
print("Total books borrowed:", total_books)

# Average number of books borrowed per user
average_books = total_books / total_users
print("Average books borrowed per user:", average_books)

# Find book with highest and lowest borrow count
all_books = []
for books in library_records.values():
    all_books.extend(books)

book_counts = {}
for book in all_books:
    if book in book_counts:
        book_counts[book] += 1
    else:
        book_counts[book] = 1

print("Book borrow counts:", book_counts)

# Highest and lowest borrowed book
highest_borrowed = max(book_counts, key=book_counts.get)
lowest_borrowed = min(book_counts, key=book_counts.get)
print("Highest borrowed book:", highest_borrowed)
print("Lowest borrowed book:", lowest_borrowed)

# Count members who borrowed 0 books
zero_borrowers = sum(1 for books in library_records.values() if len(books) == 0)
print("Number of members who borrowed no books:", zero_borrowers)

# Most frequently borrowed book (mode)
print("Most frequently borrowed book:", highest_borrowed)
