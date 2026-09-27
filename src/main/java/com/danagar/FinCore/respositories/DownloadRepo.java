package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.Download;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadRepo extends JpaRepository<Download,Long> {
}
