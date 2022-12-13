package org.example.springboot.web;


import org.example.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 JSON을 반환하는 컨트롤러로 바꿔줌
public class HelloController {
    
    @GetMapping("/hello") // http 메소드 Get의 요청을 받을 수 있는 api 생성
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, // 외부에서 받은 "name" 을 String name 파라미터에 저장함
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }

//    @GetMapping("/hello/dto")
//    public HelloResponseDto helloDto(@RequestParam("name") String name,
//                                     @RequestParam("amount") int amount) {
//        return new HelloResponseDto(name, amount);
//    }
}
