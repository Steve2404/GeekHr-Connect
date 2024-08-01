package fr.afrogeek.geekhrconnect.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.servers.Server;

import java.lang.annotation.Inherited;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Leonel Steve Jatsa",
                        email = "jatsasteve@gmail.com",
                        url = "https://github.com/Steve2404/GeekHr-Connect"

                ),
                description = "Documentation for Application GeekHr-Connect",
                title = "OpenApi Specification for GeekHr-Connect",
                version = "1.0"
        ),
        servers = @Server(
                description = "Local ENV",
                url = "http://localhost:8080"
        )
)
public class OpenApiConfig {
}
