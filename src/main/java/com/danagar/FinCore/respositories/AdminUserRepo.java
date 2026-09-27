package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserRepo extends JpaRepository<AdminUser,Long> {
}
