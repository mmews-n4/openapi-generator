# #OpenAPI Petstore
#
##This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
#
#The version of the OpenAPI document: 1.0.0
#
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 6.5.0-SNAPSHOT
#

require "uri"

module Petstore
  class PetApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Add a new pet to the store
    # 
    # @param pet [Pet] Pet object that needs to be added to the store
    # @return [Pet]
    def add_pet(pet : Pet)
      data, _status_code, _headers = add_pet_with_http_info(pet)
      data
    end

    # Add a new pet to the store
    # 
    # @param pet [Pet] Pet object that needs to be added to the store
    # @return [Array<(Pet, Integer, Hash)>] Pet data, response status code and response headers
    def add_pet_with_http_info(pet : Pet)
      if @api_client.config.debugging
        Log.debug {"Calling API: PetApi.add_pet ..."}
      end
      # verify the required parameter "pet" is set
      if @api_client.config.client_side_validation && pet.nil?
        raise ArgumentError.new("Missing the required parameter 'pet' when calling PetApi.add_pet")
      end
      # resource path
      local_var_path = "/pet"

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/xml", "application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json", "application/xml"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = pet.to_json

      # return_type
      return_type = "Pet"

      # auth_names
      auth_names = ["petstore_auth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"PetApi.add_pet",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PetApi#add_pet\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Pet.from_json(data), status_code, headers
    end

    # Deletes a pet
    # 
    # @param pet_id [Int64] Pet id to delete
    # @return [nil]
    def delete_pet(pet_id : Int64, api_key : String?)
      delete_pet_with_http_info(pet_id, api_key)
      nil
    end

    # Deletes a pet
    # 
    # @param pet_id [Int64] Pet id to delete
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_pet_with_http_info(pet_id : Int64, api_key : String?)
      if @api_client.config.debugging
        Log.debug {"Calling API: PetApi.delete_pet ..."}
      end
      # verify the required parameter "pet_id" is set
      if @api_client.config.client_side_validation && pet_id.nil?
        raise ArgumentError.new("Missing the required parameter 'pet_id' when calling PetApi.delete_pet")
      end
      # resource path
      local_var_path = "/pet/{petId}".sub("{" + "petId" + "}", URI.encode_path(pet_id.to_s).gsub("%2F", "/"))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      header_params["api_key"] = api_key

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = nil

      # auth_names
      auth_names = ["petstore_auth"]

      data, status_code, headers = @api_client.call_api(:DELETE,
                                                        local_var_path,
                                                        :"PetApi.delete_pet",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PetApi#delete_pet\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return nil, status_code, headers
    end

    # Finds Pets by status
    # Multiple status values can be provided with comma separated strings
    # @param status [Array(String)] Status values that need to be considered for filter
    # @return [Array(Pet)]
    def find_pets_by_status(status : Array(String))
      data, _status_code, _headers = find_pets_by_status_with_http_info(status)
      data
    end

    # Finds Pets by status
    # Multiple status values can be provided with comma separated strings
    # @param status [Array(String)] Status values that need to be considered for filter
    # @return [Array<(Array(Pet), Integer, Hash)>] Array(Pet) data, response status code and response headers
    def find_pets_by_status_with_http_info(status : Array(String))
      if @api_client.config.debugging
        Log.debug {"Calling API: PetApi.find_pets_by_status ..."}
      end
      # verify the required parameter "status" is set
      if @api_client.config.client_side_validation && status.nil?
        raise ArgumentError.new("Missing the required parameter 'status' when calling PetApi.find_pets_by_status")
      end
      # resource path
      local_var_path = "/pet/findByStatus"

      # query parameters
      query_params = Hash(String, String).new
      query_params["status"] = @api_client.build_collection_param(status, :csv)

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/xml", "application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "Array(Pet)"

      # auth_names
      auth_names = ["petstore_auth"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"PetApi.find_pets_by_status",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PetApi#find_pets_by_status\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Array(Pet).from_json(data), status_code, headers
    end

    # Finds Pets by tags
    # Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
    # @param tags [Array(String)] Tags to filter by
    # @return [Array(Pet)]
    def find_pets_by_tags(tags : Array(String))
      data, _status_code, _headers = find_pets_by_tags_with_http_info(tags)
      data
    end

    # Finds Pets by tags
    # Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
    # @param tags [Array(String)] Tags to filter by
    # @return [Array<(Array(Pet), Integer, Hash)>] Array(Pet) data, response status code and response headers
    def find_pets_by_tags_with_http_info(tags : Array(String))
      if @api_client.config.debugging
        Log.debug {"Calling API: PetApi.find_pets_by_tags ..."}
      end
      # verify the required parameter "tags" is set
      if @api_client.config.client_side_validation && tags.nil?
        raise ArgumentError.new("Missing the required parameter 'tags' when calling PetApi.find_pets_by_tags")
      end
      # resource path
      local_var_path = "/pet/findByTags"

      # query parameters
      query_params = Hash(String, String).new
      query_params["tags"] = @api_client.build_collection_param(tags, :csv)

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/xml", "application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "Array(Pet)"

      # auth_names
      auth_names = ["petstore_auth"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"PetApi.find_pets_by_tags",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PetApi#find_pets_by_tags\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Array(Pet).from_json(data), status_code, headers
    end

    # Find pet by ID
    # Returns a single pet
    # @param pet_id [Int64] ID of pet to return
    # @return [Pet]
    def get_pet_by_id(pet_id : Int64)
      data, _status_code, _headers = get_pet_by_id_with_http_info(pet_id)
      data
    end

    # Find pet by ID
    # Returns a single pet
    # @param pet_id [Int64] ID of pet to return
    # @return [Array<(Pet, Integer, Hash)>] Pet data, response status code and response headers
    def get_pet_by_id_with_http_info(pet_id : Int64)
      if @api_client.config.debugging
        Log.debug {"Calling API: PetApi.get_pet_by_id ..."}
      end
      # verify the required parameter "pet_id" is set
      if @api_client.config.client_side_validation && pet_id.nil?
        raise ArgumentError.new("Missing the required parameter 'pet_id' when calling PetApi.get_pet_by_id")
      end
      # resource path
      local_var_path = "/pet/{petId}".sub("{" + "petId" + "}", URI.encode_path(pet_id.to_s).gsub("%2F", "/"))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/xml", "application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "Pet"

      # auth_names
      auth_names = ["api_key"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"PetApi.get_pet_by_id",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PetApi#get_pet_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Pet.from_json(data), status_code, headers
    end

    # Update an existing pet
    # 
    # @param pet [Pet] Pet object that needs to be added to the store
    # @return [Pet]
    def update_pet(pet : Pet)
      data, _status_code, _headers = update_pet_with_http_info(pet)
      data
    end

    # Update an existing pet
    # 
    # @param pet [Pet] Pet object that needs to be added to the store
    # @return [Array<(Pet, Integer, Hash)>] Pet data, response status code and response headers
    def update_pet_with_http_info(pet : Pet)
      if @api_client.config.debugging
        Log.debug {"Calling API: PetApi.update_pet ..."}
      end
      # verify the required parameter "pet" is set
      if @api_client.config.client_side_validation && pet.nil?
        raise ArgumentError.new("Missing the required parameter 'pet' when calling PetApi.update_pet")
      end
      # resource path
      local_var_path = "/pet"

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/xml", "application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json", "application/xml"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = pet.to_json

      # return_type
      return_type = "Pet"

      # auth_names
      auth_names = ["petstore_auth"]

      data, status_code, headers = @api_client.call_api(:PUT,
                                                        local_var_path,
                                                        :"PetApi.update_pet",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PetApi#update_pet\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Pet.from_json(data), status_code, headers
    end

    # Updates a pet in the store with form data
    # 
    # @param pet_id [Int64] ID of pet that needs to be updated
    # @return [nil]
    def update_pet_with_form(pet_id : Int64, name : String?, status : String?)
      update_pet_with_form_with_http_info(pet_id, name, status)
      nil
    end

    # Updates a pet in the store with form data
    # 
    # @param pet_id [Int64] ID of pet that needs to be updated
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def update_pet_with_form_with_http_info(pet_id : Int64, name : String?, status : String?)
      if @api_client.config.debugging
        Log.debug {"Calling API: PetApi.update_pet_with_form ..."}
      end
      # verify the required parameter "pet_id" is set
      if @api_client.config.client_side_validation && pet_id.nil?
        raise ArgumentError.new("Missing the required parameter 'pet_id' when calling PetApi.update_pet_with_form")
      end
      # resource path
      local_var_path = "/pet/{petId}".sub("{" + "petId" + "}", URI.encode_path(pet_id.to_s).gsub("%2F", "/"))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/x-www-form-urlencoded"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new
      form_params[:"name"] = name unless name.nil?
      form_params[:"status"] = status unless status.nil?

      # http body (model)
      post_body = nil

      # return_type
      return_type = nil

      # auth_names
      auth_names = ["petstore_auth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"PetApi.update_pet_with_form",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PetApi#update_pet_with_form\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return nil, status_code, headers
    end

    # uploads an image
    # 
    # @param pet_id [Int64] ID of pet to update
    # @return [ApiResponse]
    def upload_file(pet_id : Int64, additional_metadata : String?, file : ::File?)
      data, _status_code, _headers = upload_file_with_http_info(pet_id, additional_metadata, file)
      data
    end

    # uploads an image
    # 
    # @param pet_id [Int64] ID of pet to update
    # @return [Array<(ApiResponse, Integer, Hash)>] ApiResponse data, response status code and response headers
    def upload_file_with_http_info(pet_id : Int64, additional_metadata : String?, file : ::File?)
      if @api_client.config.debugging
        Log.debug {"Calling API: PetApi.upload_file ..."}
      end
      # verify the required parameter "pet_id" is set
      if @api_client.config.client_side_validation && pet_id.nil?
        raise ArgumentError.new("Missing the required parameter 'pet_id' when calling PetApi.upload_file")
      end
      # resource path
      local_var_path = "/pet/{petId}/uploadImage".sub("{" + "petId" + "}", URI.encode_path(pet_id.to_s).gsub("%2F", "/"))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["multipart/form-data"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new
      form_params[:"additionalMetadata"] = additional_metadata unless additional_metadata.nil?
      form_params[:"file"] = file unless file.nil?

      # http body (model)
      post_body = nil

      # return_type
      return_type = "ApiResponse"

      # auth_names
      auth_names = ["petstore_auth"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"PetApi.upload_file",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: PetApi#upload_file\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return ApiResponse.from_json(data), status_code, headers
    end
  end
end
