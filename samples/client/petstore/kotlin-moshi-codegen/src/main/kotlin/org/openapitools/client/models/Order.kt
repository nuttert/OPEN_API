/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An order for a pets from the pet store
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */
@JsonClass(generateAdapter = true)
data class Order (
    @Json(name = "id")
    val id: kotlin.Long? = null,
    @Json(name = "petId")
    val petId: kotlin.Long? = null,
    @Json(name = "quantity")
    val quantity: kotlin.Int? = null,
    @Json(name = "shipDate")
    val shipDate: java.time.OffsetDateTime? = null,
    /* Order Status */
    @Json(name = "status")
    val status: Order.Status? = null,
    @Json(name = "complete")
    val complete: kotlin.Boolean? = null
) {

    /**
    * Order Status
    * Values: placed,approved,delivered
    */
    
    enum class Status(val value: kotlin.String){
        @Json(name = "placed") placed("placed"),
        @Json(name = "approved") approved("approved"),
        @Json(name = "delivered") delivered("delivered");
    }
}

