package pl.pjwstk.jazs26435nbp.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI().info(new Info()
                .title("Projekt Jan Wolski JAZ")
                .version("v1")
                .description("musze to zrobić ponieważ chcę zaliczyć przedmiot")
                .termsOfService("https://www.youtube.com/watch?v=dQw4w9WgXcQ&pp=ygUJcmljayByb2xs")); //TODO Nie wchodzić w link :D
    }
}
