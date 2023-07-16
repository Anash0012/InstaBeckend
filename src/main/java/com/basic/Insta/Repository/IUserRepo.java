package com.basic.Insta.Repository;

import com.basic.Insta.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {


    User findFirstByEmail(String email);
}
