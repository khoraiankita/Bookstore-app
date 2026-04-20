package com.bookstore.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    // 🔍 Search by title (partial match)
    List<Book> findByTitleContaining(String title);

    // 🔍 Search by author
    List<Book> findByAuthorContaining(String author);

    // 📂 Filter by category
    List<Book> findByCategory(String category);

    // 💰 Filter by price range
    List<Book> findByPriceBetween(double min, double max);

    // 📖 Filter by status (Currently Reading / Finished)
    List<Book> findByStatus(String status);
}