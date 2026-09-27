package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepo extends JpaRepository<ContactMessage,Long> {
}
