package com.greenfox.CircleCIHeroku;

import com.greenfox.CircleCIHeroku.services.HomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CircleCiHerokuApplicationTests {

	@Autowired
	private HomeService homeService;

	@Test
	void contextLoads() {
	}

	@Test
	void sumWorking(){
		// given
		int a = 7;
		int b = 8;

		// then
		assertThat(homeService.sumNumbers(a, b))
				.isEqualTo(15);
	}

}
