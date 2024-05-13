package com.Bookstoremanagement.BookStoreManagement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface bookrepo extends JpaRepository<bookdetails,String> {
    
}
