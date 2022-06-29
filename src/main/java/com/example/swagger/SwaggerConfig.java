package com.example.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;

@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        // http://springfox.github.io/springfox/javadoc/2.6.0/index.html?springfox/documentation/service/ApiInfo.html
        return new ApiInfo(
                "Sample API"  // APIのタイトル
                , "このAPIは～～～～です"  // APIの説明
                , "V1"  // APIのバージョン
                , "????"    // よくわからない
                , new Contact(
                "会社名"      // APIに関する連絡先組織・団体等
                , "https://example.com" // APIに関する連絡先組織・団体等のWeb Site Url
                , "noreplay@example.com")     // APIに関する連絡先組織・団体等のメールアドレス
                , "MIT license" // APIのライセンス
                , "https://opensource.org/licenses/mit-license.php"   // APIのライセンスURL
                , new ArrayList<>()  // 独自に拡張したいドキュメントがあればここで作成
        );
    }
}
