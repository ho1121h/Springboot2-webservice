package org.example.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then /assertThat: assertj라는 테스트 검증 라이브러리의 검증 메소드 | isEqualTo: assertThat과 비교
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}