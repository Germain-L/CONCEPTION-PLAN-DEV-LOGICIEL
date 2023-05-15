package org.openapitools.api

import org.openapitools.model.BookingsGet200ResponseInner
import org.openapitools.model.BookingsIdPut200Response
import org.openapitools.model.BookingsPost201Response
import org.openapitools.model.BookingsPostRequest
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v1}")
class BookingsApiController() {

    @Operation(
        summary = "Liste des réservations",
        operationId = "bookingsGet",
        description = """Renvoie une liste des réservations de salles""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = BookingsGet200ResponseInner::class))]) ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/bookings"],
        produces = ["application/json"]
    )
    fun bookingsGet(): ResponseEntity<List<BookingsGet200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Supprimer une réservation existante",
        operationId = "bookingsIdDelete",
        description = """Supprime une réservation existante pour une salle""",
        responses = [
            ApiResponse(responseCode = "204", description = "No content"),
            ApiResponse(responseCode = "404", description = "Réservation non trouvée") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/bookings/{id}"]
    )
    fun bookingsIdDelete(@Parameter(description = "Identifiant de la réservation à supprimer", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Obtenez une réservation spécifique",
        operationId = "bookingsIdGet",
        description = """Récupère les détails d'une réservation spécifique""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = BookingsGet200ResponseInner::class))]),
            ApiResponse(responseCode = "404", description = "Réservation non trouvée") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/bookings/{id}"],
        produces = ["application/json"]
    )
    fun bookingsIdGet(@Parameter(description = "Identifiant de la réservation à récupérer", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<BookingsGet200ResponseInner> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Modifier une réservation existante",
        operationId = "bookingsIdPut",
        description = """Modifie une réservation existante pour une salle""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = BookingsIdPut200Response::class))]),
            ApiResponse(responseCode = "404", description = "Réservation non trouvée") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/bookings/{id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun bookingsIdPut(@Parameter(description = "Identifiant de la réservation à modifier", required = true) @PathVariable("id") id: kotlin.Int,@Parameter(description = "", required = true) @Valid @RequestBody bookingsPostRequest: BookingsPostRequest): ResponseEntity<BookingsIdPut200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Créer une nouvelle réservation",
        operationId = "bookingsPost",
        description = """Crée une nouvelle réservation pour une salle""",
        responses = [
            ApiResponse(responseCode = "201", description = "Created", content = [Content(schema = Schema(implementation = BookingsPost201Response::class))]) ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/bookings"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun bookingsPost(@Parameter(description = "", required = true) @Valid @RequestBody bookingsPostRequest: BookingsPostRequest): ResponseEntity<BookingsPost201Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
