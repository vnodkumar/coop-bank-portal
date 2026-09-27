package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.TimelineEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimelineEventRepo extends JpaRepository<TimelineEvent, Long> {
}
