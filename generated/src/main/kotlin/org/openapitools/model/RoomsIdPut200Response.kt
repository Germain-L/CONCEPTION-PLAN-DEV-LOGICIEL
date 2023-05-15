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
 * @param id Identifiant de la salle mise à jour
 * @param name Nom de la salle mise à jour
 * @param capacity Capacité de la salle mise à jour
 */
data class RoomsIdPut200Response(

    @Schema(example = "null", description = "Identifiant de la salle mise à jour")
    @get:JsonProperty("id") val id: kotlin.Int? = null,

    @Schema(example = "null", description = "Nom de la salle mise à jour")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Capacité de la salle mise à jour")
    @get:JsonProperty("capacity") val capacity: kotlin.Int? = null
) {

}

