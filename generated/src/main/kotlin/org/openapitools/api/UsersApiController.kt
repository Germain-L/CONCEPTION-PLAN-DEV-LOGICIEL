package org.openapitools.api

import org.openapitools.model.User
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
class UsersApiController() {

    @Operation(
        summary = "Liste des utilisateurs",
        operationId = "usersGet",
        description = """Renvoie une liste des utilisateurs""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = User::class))]) ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/users"],
        produces = ["application/json"]
    )
    fun usersGet(): ResponseEntity<List<User>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Supprimer un utilisateur",
        operationId = "usersIdDelete",
        description = """Supprime un utilisateur existant""",
        responses = [
            ApiResponse(responseCode = "204", description = "No content"),
            ApiResponse(responseCode = "404", description = "Utilisateur non trouvé") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/users/{id}"]
    )
    fun usersIdDelete(@Parameter(description = "Identifiant de l'utilisateur à supprimer", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Récupérer un utilisateur par ID",
        operationId = "usersIdGet",
        description = """Récupère un utilisateur à partir de son identifiant""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = User::class))]),
            ApiResponse(responseCode = "404", description = "Utilisateur non trouvé") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/users/{id}"],
        produces = ["application/json"]
    )
    fun usersIdGet(@Parameter(description = "Identifiant de l'utilisateur à récupérer", required = true) @PathVariable("id") id: kotlin.Int): ResponseEntity<User> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Mettre à jour un utilisateur",
        operationId = "usersIdPut",
        description = """Met à jour les informations d'un utilisateur""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = User::class))]),
            ApiResponse(responseCode = "404", description = "Utilisateur non trouvé") ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/users/{id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun usersIdPut(@Parameter(description = "Identifiant de l'utilisateur à mettre à jour", required = true) @PathVariable("id") id: kotlin.Int,@Parameter(description = "", required = true) @Valid @RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Créer un nouvel utilisateur",
        operationId = "usersPost",
        description = """Crée un nouvel utilisateur""",
        responses = [
            ApiResponse(responseCode = "201", description = "Created", content = [Content(schema = Schema(implementation = User::class))]) ],
        security = [ SecurityRequirement(name = "firebase", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/users"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun usersPost(@Parameter(description = "", required = true) @Valid @RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
