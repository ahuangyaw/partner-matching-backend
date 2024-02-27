package asia.huangzhitao.partnermatchingbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("asia.huangzhitao.partnermatchingbackend.mapper")
@SpringBootApplication
public class PartnerMatchingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartnerMatchingBackendApplication.class, args);
    }

}
