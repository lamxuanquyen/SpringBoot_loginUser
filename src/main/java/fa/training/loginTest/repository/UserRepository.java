package fa.training.loginTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fa.training.loginTest.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
