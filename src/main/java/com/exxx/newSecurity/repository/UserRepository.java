package com.exxx.newSecurity.repository;








import com.exxx.newSecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
