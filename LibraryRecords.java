import java.util.*;

public class LibraryRecords {
    public static void main(String[] args) {
        // Library data (member -> books borrowed)
        Map<String, List<String>> libraryRecords = new HashMap<>();
        libraryRecords.put("Manali", Arrays.asList("Data structures", "C++", "Python"));
        libraryRecords.put("Hermione", Arrays.asList("C", "OS"));
        libraryRecords.put("Ron", Collections.emptyList());
        libraryRecords.put("Ansh", Arrays.asList("Data structures", "Java", "Python"));
        libraryRecords.put("Snehi", Arrays.asList("C"));
        libraryRecords.put("Eve", Collections.emptyList());

        // Total members
        int totalUsers = libraryRecords.size();
        System.out.println("Total members in library: " + totalUsers);

        // Total books borrowed
        int totalBooks = 0;
        for (List<String> books : libraryRecords.values()) {
            totalBooks += books.size();
        }
        System.out.println("Total books borrowed: " + totalBooks);

        // Average books per user
        double averageBooks = (double) totalBooks / totalUsers;
        System.out.println("Average books borrowed per user: " + averageBooks);

        // Count number of members with 0 books borrowed
        int zeroBorrowers = 0;
        for (List<String> books : libraryRecords.values()) {
            if (books.isEmpty()) {
                zeroBorrowers++;
            }
        }

        // Count how many times each book is borrowed
        Map<String, Integer> bookCounts = new HashMap<>();
        for (List<String> books : libraryRecords.values()) {
            for (String book : books) {
                bookCounts.put(book, bookCounts.getOrDefault(book, 0) + 1);
            }
        }

        System.out.println("Book borrow counts: " + bookCounts);

        // Find highest and lowest borrowed book
        String highestBorrowed = null;
        String lowestBorrowed = null;
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : bookCounts.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                highestBorrowed = entry.getKey();
            }
            if (count < minCount) {
                minCount = count;
                lowestBorrowed = entry.getKey();
            }
        }

        System.out.println("Highest borrowed book: " + highestBorrowed);
        System.out.println("Lowest borrowed book: " + lowestBorrowed);
        System.out.println("Number of members who borrowed no books: " + zeroBorrowers);
        System.out.println("Most frequently borrowed book: " + highestBorrowed);
    }
}

