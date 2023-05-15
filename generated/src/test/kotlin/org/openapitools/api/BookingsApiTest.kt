package org.openapitools.api

import org.openapitools.model.BookingsGet200ResponseInner
import org.openapitools.model.BookingsIdPut200Response
import org.openapitools.model.BookingsPost201Response
import org.openapitools.model.BookingsPostRequest
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BookingsApiTest {

    private val api: BookingsApiController = BookingsApiController()

    /**
     * To test BookingsApiController.bookingsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun bookingsGetTest() {
        val response: ResponseEntity<List<BookingsGet200ResponseInner>> = api.bookingsGet()

        // TODO: test validations
    }

    /**
     * To test BookingsApiController.bookingsIdDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun bookingsIdDeleteTest() {
        val id: kotlin.Int = TODO()
        val response: ResponseEntity<Unit> = api.bookingsIdDelete(id)

        // TODO: test validations
    }

    /**
     * To test BookingsApiController.bookingsIdGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun bookingsIdGetTest() {
        val id: kotlin.Int = TODO()
        val response: ResponseEntity<BookingsGet200ResponseInner> = api.bookingsIdGet(id)

        // TODO: test validations
    }

    /**
     * To test BookingsApiController.bookingsIdPut
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun bookingsIdPutTest() {
        val id: kotlin.Int = TODO()
        val bookingsPostRequest: BookingsPostRequest = TODO()
        val response: ResponseEntity<BookingsIdPut200Response> = api.bookingsIdPut(id, bookingsPostRequest)

        // TODO: test validations
    }

    /**
     * To test BookingsApiController.bookingsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun bookingsPostTest() {
        val bookingsPostRequest: BookingsPostRequest = TODO()
        val response: ResponseEntity<BookingsPost201Response> = api.bookingsPost(bookingsPostRequest)

        // TODO: test validations
    }
}
