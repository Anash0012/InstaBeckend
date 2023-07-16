package com.basic.Insta.Repository;

import com.basic.Insta.Model.Post;
import com.basic.Insta.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepo extends JpaRepository<Post, Integer> {


    List<Post> findByUser(User user);
}