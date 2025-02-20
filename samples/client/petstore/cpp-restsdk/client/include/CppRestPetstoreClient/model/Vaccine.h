/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.12.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Vaccine.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Vaccine_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Vaccine_H_


#include "CppRestPetstoreClient/ModelBase.h"

#include "CppRestPetstoreClient/AnyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



class  Vaccine
    : public ModelBase
{
public:
    Vaccine();
    virtual ~Vaccine();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;


    /////////////////////////////////////////////
    /// Vaccine members


    /// <summary>
    /// vaccination date
    /// </summary>
    std::shared_ptr<AnyType> getDate() const;
    bool dateIsSet() const;
    void unsetdate();
    void setDate(const std::shared_ptr<AnyType>& value);

    /// <summary>
    /// true if a booster is still needed to complete the vaccination
    /// </summary>
    bool isBoosterRequired() const;
    bool boosterRequiredIsSet() const;
    void unsetBoosterRequired();
    void setBoosterRequired(bool value);


protected:
    std::shared_ptr<AnyType> m_date;
    bool m_dateIsSet;

    bool m_BoosterRequired;
    bool m_BoosterRequiredIsSet;

};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Vaccine_H_ */
