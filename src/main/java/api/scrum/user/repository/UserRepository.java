package api.scrum.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import api.scrum.user.model.User;


public interface UserRepository extends JpaRepository<User, UUID>{

}
