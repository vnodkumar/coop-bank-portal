package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.FinancialRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRecordRepo extends JpaRepository<FinancialRecord,Long> {
}
