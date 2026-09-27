package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.ServiceCharge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceChargeRepo extends JpaRepository<ServiceCharge, Long> {
}
