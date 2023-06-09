package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@jakarta.annotation.Generated(value = ["org.openapitools.codegen.languages.KotlinSpringServerCodegen"])
@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Application de réservation de salles")
                    .description("API pour la réservation de salles au sein d'une entreprise")
                    .version("1.0.0")
            )
            .components(
                Components()
                    .addSecuritySchemes("firebase", SecurityScheme()
                        .type(SecurityScheme.Type.OAUTH2)
                    )
            )
    }
}
