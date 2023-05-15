package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param name Nom de l'utilisateur
 * @param email Adresse e-mail de l'utilisateur
 * @param id Identifiant unique de l'utilisateur
 */
data class User(

    @Schema(example = "null", required = true, description = "Nom de l'utilisateur")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Email
    @Schema(example = "null", required = true, description = "Adresse e-mail de l'utilisateur")
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @Schema(example = "null", description = "Identifiant unique de l'utilisateur")
    @get:JsonProperty("id") val id: kotlin.Int? = null
) {

}

