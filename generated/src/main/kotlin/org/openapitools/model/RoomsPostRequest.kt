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
 * @param name Nom de la salle
 * @param capacity Capacité de la salle
 */
data class RoomsPostRequest(

    @Schema(example = "null", description = "Nom de la salle")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Capacité de la salle")
    @get:JsonProperty("capacity") val capacity: kotlin.Int? = null
) {

}

