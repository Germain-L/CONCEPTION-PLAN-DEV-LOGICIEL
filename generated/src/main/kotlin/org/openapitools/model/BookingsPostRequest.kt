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
 * @param roomId Identifiant de la salle réservée
 * @param start Date et heure de début de la réservation
 * @param end Date et heure de fin de la réservation
 */
data class BookingsPostRequest(

    @Schema(example = "null", description = "Identifiant de la salle réservée")
    @get:JsonProperty("roomId") val roomId: kotlin.Int? = null,

    @Schema(example = "null", description = "Date et heure de début de la réservation")
    @get:JsonProperty("start") val start: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Date et heure de fin de la réservation")
    @get:JsonProperty("end") val end: java.time.OffsetDateTime? = null
) {

}

