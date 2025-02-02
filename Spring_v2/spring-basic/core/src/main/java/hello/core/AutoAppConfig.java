package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 기존에 AppConfig도 자동등록이 되기 때문에 등록시키지 않기 위해서 작성
        // 실무에선 excludeFilters 를 사용할 일 없을 것, 예제 코드를 살리기 위해 작성
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
