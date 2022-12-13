package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing //JpaAuditing 어노테이션을 모두 활성화 하도록 추가
@SpringBootApplication
public class Application { // main 클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
/**
 * 스프링 Bean 읽기와 생성을 모두 자동으로 설정하여 읽음
 * 전체 패키지중 최상단에 위치하여야 전체를 읽을 수 있기때문에 이 위치에 위치하여아한다.
 * 내장 was 를 써야하는 이유는 베포가 편함
 *
 * http://localhost:8080/h2-console/
 * JDBC URL : jdbc:h2:mem:testdb
 * 글 등록 하고 싶으면 , user 테이블가서 update set role = 'USER';
 */