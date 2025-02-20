=begin
#OpenAPI Extension x-auth-id-alias

#This specification shows how to use x-auth-id-alias extension for API keys.

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
Generator version: 7.11.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'

# Unit tests for XAuthIDAlias::UsageApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'UsageApi' do
  before do
    # run before each test
    @api_instance = XAuthIDAlias::UsageApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UsageApi' do
    it 'should create an instance of UsageApi' do
      expect(@api_instance).to be_instance_of(XAuthIDAlias::UsageApi)
    end
  end

  # unit tests for any_key
  # Use any API key
  # Use any API key
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'any_key test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for both_keys
  # Use both API keys
  # Use both API keys
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'both_keys test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for key_in_header
  # Use API key in header
  # Use API key in header
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'key_in_header test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for key_in_query
  # Use API key in query
  # Use API key in query
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'key_in_query test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
