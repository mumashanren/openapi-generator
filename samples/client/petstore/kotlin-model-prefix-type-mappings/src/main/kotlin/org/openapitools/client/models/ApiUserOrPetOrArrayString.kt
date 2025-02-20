/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.ApiCategory
import org.openapitools.client.models.ApiPet
import org.openapitools.client.models.ApiTag
import org.openapitools.client.models.ApiUser

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName
import java.io.IOException

/**
 * 
 *
 */


data class ApiUserOrPetOrArrayString(var actualInstance: Any? = null) {

    class CustomTypeAdapterFactory : TypeAdapterFactory {
        override fun <T> create(gson: Gson, type: TypeToken<T>): TypeAdapter<T>? {
            if (!ApiUserOrPetOrArrayString::class.java.isAssignableFrom(type.rawType)) {
                return null // this class only serializes 'ApiUserOrPetOrArrayString' and its subtypes
            }
            val elementAdapter = gson.getAdapter(JsonElement::class.java)
            val adapterApiUser = gson.getDelegateAdapter(this, TypeToken.get(ApiUser::class.java))
            val adapterApiPet = gson.getDelegateAdapter(this, TypeToken.get(ApiPet::class.java))
            @Suppress("UNCHECKED_CAST")
            val adapterkotlincollectionsListkotlinString = gson.getDelegateAdapter(this, TypeToken.get(object : TypeToken<kotlin.collections.List<kotlin.String>>() {}.type)) as TypeAdapter<kotlin.collections.List<kotlin.String>>

            @Suppress("UNCHECKED_CAST")
            return object : TypeAdapter<ApiUserOrPetOrArrayString?>() {
                @Throws(IOException::class)
                override fun write(out: JsonWriter,value: ApiUserOrPetOrArrayString?) {
                    if (value?.actualInstance == null) {
                        elementAdapter.write(out, null)
                        return
                    }

                    // check if the actual instance is of the type `ApiUser`
                    if (value.actualInstance is ApiUser) {
                        val element = adapterApiUser.toJsonTree(value.actualInstance as ApiUser?)
                        elementAdapter.write(out, element)
                        return
                    }
                    // check if the actual instance is of the type `ApiPet`
                    if (value.actualInstance is ApiPet) {
                        val element = adapterApiPet.toJsonTree(value.actualInstance as ApiPet?)
                        elementAdapter.write(out, element)
                        return
                    }
                    // check if the actual instance is of the type `kotlin.collections.List<kotlin.String>`
                    if (value.actualInstance is List<*>) {
                        val list = value.actualInstance as List<Any>
                        if (list.get(0) is kotlin.String) {
                            val array = adapterkotlincollectionsListkotlinString.toJsonTree(value.actualInstance as kotlin.collections.List<kotlin.String>?).getAsJsonArray()
                            elementAdapter.write(out, array)
                            return
                        }
                    }
                    throw IOException("Failed to serialize as the type doesn't match oneOf schemas: ApiPet, ApiUser, kotlin.collections.List<kotlin.String>")
                }

                @Throws(IOException::class)
                override fun read(jsonReader: JsonReader): ApiUserOrPetOrArrayString {
                    val jsonElement = elementAdapter.read(jsonReader)
                    var match = 0
                    val errorMessages = ArrayList<String>()
                    var actualAdapter: TypeAdapter<*> = elementAdapter

                    // deserialize ApiUser
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ApiUser.validateJsonElement(jsonElement)
                        actualAdapter = adapterApiUser
                        match++
                        //log.log(Level.FINER, "Input data matches schema 'ApiUser'")
                    } catch (e: Exception) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ApiUser failed with `%s`.", e.message))
                        //log.log(Level.FINER, "Input data does not match schema 'ApiUser'", e)
                    }
                    // deserialize ApiPet
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ApiPet.validateJsonElement(jsonElement)
                        actualAdapter = adapterApiPet
                        match++
                        //log.log(Level.FINER, "Input data matches schema 'ApiPet'")
                    } catch (e: Exception) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ApiPet failed with `%s`.", e.message))
                        //log.log(Level.FINER, "Input data does not match schema 'ApiPet'", e)
                    }
                    // deserialize kotlin.collections.List<kotlin.String>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        require(jsonElement.isJsonArray) {
                            String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString())
                        }

                        // validate array items
                        for(element in jsonElement.getAsJsonArray()) {
                            require(element.getAsJsonPrimitive().isString) {
                                String.format("Expected array items to be of type String in the JSON string but got `%s`", jsonElement.toString())
                            }
                        }
                        actualAdapter = adapterkotlincollectionsListkotlinString
                        match++
                        //log.log(Level.FINER, "Input data matches schema 'kotlin.collections.List<kotlin.String>'")
                    } catch (e: Exception) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for kotlin.collections.List<kotlin.String> failed with `%s`.", e.message))
                        //log.log(Level.FINER, "Input data does not match schema 'kotlin.collections.List<kotlin.String>'", e)
                    }

                    if (match == 1) {
                        val ret = ApiUserOrPetOrArrayString()
                        ret.actualInstance = actualAdapter.fromJsonTree(jsonElement)
                        return ret
                    }

                    throw IOException(String.format("Failed deserialization for ApiUserOrPetOrArrayString: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()))
                }
            }.nullSafe() as TypeAdapter<T>
        }
    }

    companion object {
        /**
        * Validates the JSON Element and throws an exception if issues found
        *
        * @param jsonElement JSON Element
        * @throws IOException if the JSON Element is invalid with respect to ApiUserOrPetOrArrayString
        */
        @Throws(IOException::class)
        fun validateJsonElement(jsonElement: JsonElement?) {
            requireNotNull(jsonElement) {
                "Provided json element must not be null"
            }
            var match = 0
            val errorMessages = ArrayList<String>()
            // validate the json string with ApiUser
            try {
                // validate the JSON object to see if any exception is thrown
                ApiUser.validateJsonElement(jsonElement)
                match++
            } catch (e: Exception) {
                // Validation failed, continue
                errorMessages.add(String.format("Validation for ApiUser failed with `%s`.", e.message))
            }
            // validate the json string with ApiPet
            try {
                // validate the JSON object to see if any exception is thrown
                ApiPet.validateJsonElement(jsonElement)
                match++
            } catch (e: Exception) {
                // Validation failed, continue
                errorMessages.add(String.format("Validation for ApiPet failed with `%s`.", e.message))
            }
            // validate the json string with kotlin.collections.List<kotlin.String>
            try {
                // validate the JSON object to see if any exception is thrown
                require(jsonElement.isJsonArray) {
                    String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString())
                }

                // validate array items
                for(element in jsonElement.getAsJsonArray()) {
                    require(element.getAsJsonPrimitive().isString) {
                        String.format("Expected array items to be of type String in the JSON string but got `%s`", jsonElement.toString())
                    }
                }
                match++
            } catch (e: Exception) {
                // Validation failed, continue
                errorMessages.add(String.format("Validation for kotlin.collections.List<kotlin.String> failed with `%s`.", e.message))
            }

            if (match != 1) {
                throw IOException(String.format("Failed validation for ApiUserOrPetOrArrayString: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()))
            }
        }
    }
}
