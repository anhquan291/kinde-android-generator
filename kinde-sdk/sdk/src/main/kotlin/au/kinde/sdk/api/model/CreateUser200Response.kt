/**
 * Kinde Management API
 *
 * Provides endpoints to manage your Kinde Businesses
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: support@kinde.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package au.kinde.sdk.api.model

import au.kinde.sdk.api.model.UserIdentity

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param id 
 * @param created 
 * @param identities 
 */

data class CreateUser200Response (

    @SerializedName("id")
    val id: kotlin.String? = null,

    @SerializedName("created")
    val created: kotlin.Boolean? = null,

    @SerializedName("identities")
    val identities: kotlin.collections.List<UserIdentity>? = null

)

