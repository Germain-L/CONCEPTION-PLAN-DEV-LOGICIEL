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
 * @param roomId Identifiant unique de la salle réservée
 * @param start Date et heure de début de la réservation
 * @param end Date et heure de fin de la réservation
 * @param userId Identifiant unique de l'utilisateur qui a effectué la réservation
 * @param id Identifiant unique de la réservation
 */
data class Booking(

    @Schema(example = "null", required = true, description = "Identifiant unique de la salle réservée")
    @get:JsonProperty("roomId", required = true) val roomId: kotlin.Int,

    @Schema(example = "null", required = true, description = "Date et heure de début de la réservation")
    @get:JsonProperty("start", required = true) val start: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Date et heure de fin de la réservation")
    @get:JsonProperty("end", required = true) val end: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Identifiant unique de l'utilisateur qui a effectué la réservation")
    @get:JsonProperty("userId", required = true) val userId: kotlin.Int,

    @Schema(example = "null", description = "Identifiant unique de la réservation")
    @get:JsonProperty("id") val id: kotlin.Int? = null
) {

}

