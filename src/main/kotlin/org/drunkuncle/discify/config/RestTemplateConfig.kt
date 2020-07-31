package org.drunkuncle.discify.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext
import org.springframework.security.oauth2.client.OAuth2RestTemplate
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client
import org.springframework.web.client.RestTemplate

@Configuration
@EnableOAuth2Client
class RestTemplateConfig {

    @Bean
    fun oAuthRestTemplate(): RestTemplate? {
        val resourceDetails = ClientCredentialsResourceDetails()
        resourceDetails.id = "1"
        resourceDetails.clientId = "104949e315f64019a170d550bc6385f7"
        resourceDetails.clientSecret = "a5fd007d50844f798514ba43bc701312"
        resourceDetails.accessTokenUri = "https://accounts.spotify.com/api/token"
        val clientContext = DefaultOAuth2ClientContext()
        return OAuth2RestTemplate(resourceDetails, clientContext)
    }
}