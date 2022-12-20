package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing //JpaAuditing 어노테이션을 모두 활성화 하도록 추가
@SpringBootApplication
public class Application { // main 클래스
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
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
 * aws 에 빌드한 사이트에 접속 : ec2-13-125-143-204.ap-northeast-2.compute.amazonaws.com:8080
 * ## 접속불가시 1. aws에 접속
 * 2.인스턴스 재부팅
 * 3. 재부팅 후 putty 실행
 * 4. ./deploy.sh 로 실행
 * 5. 다시 aws 빌드 사이트 접속
 */