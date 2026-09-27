package com.danagar.FinCore.respositories;

import com.danagar.FinCore.model.SiteSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteSettingRepo extends JpaRepository<SiteSetting, String> {
}
