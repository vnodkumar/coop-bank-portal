package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.BoardMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardMemberRepo extends JpaRepository<BoardMember,Long> {
}
