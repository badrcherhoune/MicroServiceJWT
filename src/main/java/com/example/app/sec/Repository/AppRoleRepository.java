package com.example.app.sec.Repository;

import com.example.app.sec.Entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole , Long> {
    AppRole findByRoleName(String roleName);
}
