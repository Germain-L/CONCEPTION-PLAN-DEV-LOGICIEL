package org.openapitools.api

import org.openapitools.model.User
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class UsersApiTest {

    private val api: UsersApiController = UsersApiController()

    /**
     * To test UsersApiController.usersGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usersGetTest() {
        val response: ResponseEntity<List<User>> = api.usersGet()

        // TODO: test validations
    }

    /**
     * To test UsersApiController.usersIdDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usersIdDeleteTest() {
        val id: kotlin.Int = TODO()
        val response: ResponseEntity<Unit> = api.usersIdDelete(id)

        // TODO: test validations
    }

    /**
     * To test UsersApiController.usersIdGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usersIdGetTest() {
        val id: kotlin.Int = TODO()
        val response: ResponseEntity<User> = api.usersIdGet(id)

        // TODO: test validations
    }

    /**
     * To test UsersApiController.usersIdPut
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usersIdPutTest() {
        val id: kotlin.Int = TODO()
        val user: User = TODO()
        val response: ResponseEntity<User> = api.usersIdPut(id, user)

        // TODO: test validations
    }

    /**
     * To test UsersApiController.usersPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun usersPostTest() {
        val user: User = TODO()
        val response: ResponseEntity<User> = api.usersPost(user)

        // TODO: test validations
    }
}
