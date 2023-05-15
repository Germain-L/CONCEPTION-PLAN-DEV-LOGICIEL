package org.openapitools.api

import org.openapitools.model.Booking
import org.openapitools.model.RoomsGet200ResponseInner
import org.openapitools.model.RoomsIdPut200Response
import org.openapitools.model.RoomsPost201Response
import org.openapitools.model.RoomsPostRequest
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
class RoomsApiController() {

    @Operation(
        summary = "Liste des salles disponibles",
        operationId = "roomsGet",
        description = """Renvoie une liste des salles disponibles pour la réservation""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RoomsGet200ResponseInner::class))]) ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/rooms"],
        produces = ["application/json"]
    )
    fun roomsGet(): ResponseEntity<List<RoomsGet200ResponseInner>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Bookings sur une salle",
        operationId = "roomsIdBookingsGet",
        description = """Renvoie les bookings sur une salle avec l'ID spécifié.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Succès, renvoie une liste de bookings pour la salle spécifiée", content = [Content(schema = Schema(implementation = Booking::class))]),
            ApiResponse(responseCode = "404", description = "La salle spécifiée n'existe pas.") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/rooms/{id}/bookings"],
        produces = ["application/json"]
    )
    fun roomsIdBookingsGet(@Parameter(description = "ID de la salle", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<List<Booking>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Supprimer une salle",
        operationId = "roomsIdDelete",
        description = """Supprime une salle spécifique en fonction de son identifiant.""",
        responses = [
            ApiResponse(responseCode = "204", description = "No content"),
            ApiResponse(responseCode = "404", description = "Salle non trouvé") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/rooms/{id}"]
    )
    fun roomsIdDelete(@Parameter(description = "Identifiant de la salle", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Récupérer les informations d'une salle",
        operationId = "roomsIdGet",
        description = """Récupère les informations d'une salle spécifique en fonction de son identifiant.""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RoomsGet200ResponseInner::class))]),
            ApiResponse(responseCode = "404", description = "Salle non trouvé") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/rooms/{id}"],
        produces = ["application/json"]
    )
    fun roomsIdGet(@Parameter(description = "Identifiant de la salle", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<RoomsGet200ResponseInner> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Mettre à jour les informations d'une salle",
        operationId = "roomsIdPut",
        description = """Met à jour les informations d'une salle spécifique en fonction de son identifiant.""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = RoomsIdPut200Response::class))]),
            ApiResponse(responseCode = "404", description = "Salle non trouvé") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/rooms/{id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun roomsIdPut(@Parameter(description = "Identifiant de la salle", required = true) @PathVariable("id") id: kotlin.Int,@Parameter(description = "", required = true) @Valid @RequestBody roomsPostRequest: RoomsPostRequest): ResponseEntity<RoomsIdPut200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Créer une nouvelle salle",
        operationId = "roomsPost",
        description = """Crée une nouvelle salle pour la réservation""",
        responses = [
            ApiResponse(responseCode = "201", description = "Created", content = [Content(schema = Schema(implementation = RoomsPost201Response::class))]) ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/rooms"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun roomsPost(@Parameter(description = "", required = true) @Valid @RequestBody roomsPostRequest: RoomsPostRequest): ResponseEntity<RoomsPost201Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
