package com.shannonfairchild.petadopterspring.repositories;

import com.shannonfairchild.petadopterspring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
