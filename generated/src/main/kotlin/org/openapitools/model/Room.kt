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
 * @param capacity Nombre maximum de personnes pouvant occuper la salle
 * @param id Identifiant unique de la salle
 */
data class Room(

    @Schema(example = "null", required = true, description = "Nom de la salle")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "Nombre maximum de personnes pouvant occuper la salle")
    @get:JsonProperty("capacity", required = true) val capacity: kotlin.Int,

    @Schema(example = "null", description = "Identifiant unique de la salle")
    @get:JsonProperty("id") val id: kotlin.Int? = null
) {

}

