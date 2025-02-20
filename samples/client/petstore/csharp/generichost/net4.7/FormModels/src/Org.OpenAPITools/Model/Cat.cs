// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Cat
    /// </summary>
    public partial class Cat : Animal, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Cat" /> class.
        /// </summary>
        /// <param name="color">color (default to &quot;red&quot;)</param>
        /// <param name="declawed">declawed</param>
        [JsonConstructor]
        public Cat(Option<string> color = default, Option<bool?> declawed = default) : base(color)
        {
            DeclawedOption = declawed;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Used to track the state of Declawed
        /// </summary>
        [JsonIgnore]
        [global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
        public Option<bool?> DeclawedOption { get; private set; }

        /// <summary>
        /// Gets or Sets Declawed
        /// </summary>
        [JsonPropertyName("declawed")]
        public bool? Declawed { get { return this.DeclawedOption; } set { this.DeclawedOption = new Option<bool?>(value); } }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Cat {\n");
            sb.Append("  ").Append(base.ToString()?.Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Declawed: ").Append(Declawed).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="Cat" />
    /// </summary>
    public class CatJsonConverter : JsonConverter<Cat>
    {
        /// <summary>
        /// Deserializes json to <see cref="Cat" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override Cat Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Option<string> className = default;
            Option<string> color = default;
            Option<bool?> declawed = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "className":
                            className = new Option<string>(utf8JsonReader.GetString());
                            break;
                        case "color":
                            color = new Option<string>(utf8JsonReader.GetString());
                            break;
                        case "declawed":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                declawed = new Option<bool?>(utf8JsonReader.GetBoolean());
                            break;
                        default:
                            break;
                    }
                }
            }

            if (!className.IsSet)
                throw new ArgumentException("Property is required for class Cat.", nameof(className));

            if (className.IsSet && className.Value == null)
                throw new ArgumentNullException(nameof(className), "Property is not nullable for class Cat.");

            if (color.IsSet && color.Value == null)
                throw new ArgumentNullException(nameof(color), "Property is not nullable for class Cat.");

            if (declawed.IsSet && declawed.Value == null)
                throw new ArgumentNullException(nameof(declawed), "Property is not nullable for class Cat.");

            return new Cat(color, declawed);
        }

        /// <summary>
        /// Serializes a <see cref="Cat" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="cat"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, Cat cat, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            WriteProperties(writer, cat, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="Cat" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="cat"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(Utf8JsonWriter writer, Cat cat, JsonSerializerOptions jsonSerializerOptions)
        {
            if (cat.ColorOption.IsSet && cat.Color == null)
                throw new ArgumentNullException(nameof(cat.Color), "Property is required for class Cat.");

            writer.WriteString("className", cat.ClassName);

            if (cat.ColorOption.IsSet)
                writer.WriteString("color", cat.Color);

            if (cat.DeclawedOption.IsSet)
                writer.WriteBoolean("declawed", cat.DeclawedOption.Value.Value);
        }
    }
}
