/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.model.Animal;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Dog
 */
@JsonPropertyOrder({
  Dog.JSON_PROPERTY_BREED
})
@JsonTypeName("Dog")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", comments = "Generator version: 7.12.0-SNAPSHOT")
@Introspected
public class Dog extends Animal {
    public static final String JSON_PROPERTY_BREED = "breed";
    private String breed;

    public Dog() {
        super();
    }
    public Dog breed(String breed) {
        this.breed = breed;
        return this;
    }

    /**
     * Get breed
     * @return breed
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_BREED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBreed() {
        return breed;
    }

    @JsonProperty(JSON_PROPERTY_BREED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        return Objects.equals(this.breed, dog.breed) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dog {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    public <T> T accept(Animal.Visitor<T> visitor) {
        return visitor.visitDog(this);
    }
}

