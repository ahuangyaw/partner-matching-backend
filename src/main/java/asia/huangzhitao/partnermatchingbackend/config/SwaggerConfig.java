package asia.huangzhitao.partnermatchingbackend.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * author : hwang
 * data : 10:40 2024/2/29
 * description : SwaggerConfig
 */
@Configuration
@EnableSwagger2WebMvc
@Profile({"dev", "test"})   //版本控制访问
public class SwaggerConfig {
    @Bean(value = "defaultApi2")
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("asia.huangzhitao.partnermatchingbackend.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    /**
     * api 信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("用户中心")
                .description("接口文档")
                .termsOfServiceUrl("https://www.huangzhitao.asia")
                .contact(new Contact("黄志涛","https://www.huangzhitao.asia", "tao_hwang@qq.com"))
                .version("1.0")
                .build();
    }

}