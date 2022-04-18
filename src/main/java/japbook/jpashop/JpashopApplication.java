package japbook.jpashop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Hello hello = new Hello(); //lombok 확인해보기
		hello.setData("hello");
		String data = hello.getData();
//		System.out.println("data = " + data);


		SpringApplication.run(JpashopApplication.class, args);
	}

}
