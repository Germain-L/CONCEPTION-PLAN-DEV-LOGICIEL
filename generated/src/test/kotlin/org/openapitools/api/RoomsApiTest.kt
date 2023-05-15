package org.openapitools.api

import org.openapitools.model.Booking
import org.openapitools.model.RoomsGet200ResponseInner
import org.openapitools.model.RoomsIdPut200Response
import org.openapitools.model.RoomsPost201Response
import org.openapitools.model.RoomsPostRequest
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class RoomsApiTest {

    private val api: RoomsApiController = RoomsApiController()

    /**
     * To test RoomsApiController.roomsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun roomsGetTest() {
        val response: ResponseEntity<List<RoomsGet200ResponseInner>> = api.roomsGet()

        // TODO: test validations
    }

    /**
     * To test RoomsApiController.roomsIdBookingsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun roomsIdBookingsGetTest() {
        val id: kotlin.Int = TODO()
        val response: ResponseEntity<List<Booking>> = api.roomsIdBookingsGet(id)

        // TODO: test validations
    }

    /**
     * To test RoomsApiController.roomsIdDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun roomsIdDeleteTest() {
        val id: kotlin.Int = TODO()
        val response: ResponseEntity<Unit> = api.roomsIdDelete(id)

        // TODO: test validations
    }

    /**
     * To test RoomsApiController.roomsIdGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun roomsIdGetTest() {
        val id: kotlin.Int = TODO()
        val response: ResponseEntity<RoomsGet200ResponseInner> = api.roomsIdGet(id)

        // TODO: test validations
    }

    /**
     * To test RoomsApiController.roomsIdPut
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun roomsIdPutTest() {
        val id: kotlin.Int = TODO()
        val roomsPostRequest: RoomsPostRequest = TODO()
        val response: ResponseEntity<RoomsIdPut200Response> = api.roomsIdPut(id, roomsPostRequest)

        // TODO: test validations
    }

    /**
     * To test RoomsApiController.roomsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun roomsPostTest() {
        val roomsPostRequest: RoomsPostRequest = TODO()
        val response: ResponseEntity<RoomsPost201Response> = api.roomsPost(roomsPostRequest)

        // TODO: test validations
    }
}
