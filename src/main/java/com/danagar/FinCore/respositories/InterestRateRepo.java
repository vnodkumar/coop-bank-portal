package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.InterestRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestRateRepo extends JpaRepository<InterestRate, Long> {
}
