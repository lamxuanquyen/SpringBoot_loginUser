package fa.training.loginTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.training.loginTest.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
