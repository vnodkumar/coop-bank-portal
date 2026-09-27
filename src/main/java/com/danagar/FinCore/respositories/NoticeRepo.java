package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepo extends JpaRepository<Notice, Long> {
}
