package org.example.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
// DB 접근자 //레이어 <엔티티 클래스, 기본키타입> 으로 생성함

public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC") //id 값을 내림차순으로 정렬
    List<Posts> findAllDesc();
}
