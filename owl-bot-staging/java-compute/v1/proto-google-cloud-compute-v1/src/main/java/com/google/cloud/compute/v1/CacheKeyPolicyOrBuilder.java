// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface CacheKeyPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.CacheKeyPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, requests to different hosts will be cached separately.
   * </pre>
   *
   * <code>optional bool include_host = 486867679;</code>
   * @return Whether the includeHost field is set.
   */
  boolean hasIncludeHost();
  /**
   * <pre>
   * If true, requests to different hosts will be cached separately.
   * </pre>
   *
   * <code>optional bool include_host = 486867679;</code>
   * @return The includeHost.
   */
  boolean getIncludeHost();

  /**
   * <pre>
   * Allows HTTP request headers (by name) to be used in the cache key.
   * </pre>
   *
   * <code>repeated string include_http_headers = 2489606;</code>
   * @return A list containing the includeHttpHeaders.
   */
  java.util.List<java.lang.String>
      getIncludeHttpHeadersList();
  /**
   * <pre>
   * Allows HTTP request headers (by name) to be used in the cache key.
   * </pre>
   *
   * <code>repeated string include_http_headers = 2489606;</code>
   * @return The count of includeHttpHeaders.
   */
  int getIncludeHttpHeadersCount();
  /**
   * <pre>
   * Allows HTTP request headers (by name) to be used in the cache key.
   * </pre>
   *
   * <code>repeated string include_http_headers = 2489606;</code>
   * @param index The index of the element to return.
   * @return The includeHttpHeaders at the given index.
   */
  java.lang.String getIncludeHttpHeaders(int index);
  /**
   * <pre>
   * Allows HTTP request headers (by name) to be used in the cache key.
   * </pre>
   *
   * <code>repeated string include_http_headers = 2489606;</code>
   * @param index The index of the value to return.
   * @return The bytes of the includeHttpHeaders at the given index.
   */
  com.google.protobuf.ByteString
      getIncludeHttpHeadersBytes(int index);

  /**
   * <pre>
   * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
   * </pre>
   *
   * <code>repeated string include_named_cookies = 87316530;</code>
   * @return A list containing the includeNamedCookies.
   */
  java.util.List<java.lang.String>
      getIncludeNamedCookiesList();
  /**
   * <pre>
   * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
   * </pre>
   *
   * <code>repeated string include_named_cookies = 87316530;</code>
   * @return The count of includeNamedCookies.
   */
  int getIncludeNamedCookiesCount();
  /**
   * <pre>
   * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
   * </pre>
   *
   * <code>repeated string include_named_cookies = 87316530;</code>
   * @param index The index of the element to return.
   * @return The includeNamedCookies at the given index.
   */
  java.lang.String getIncludeNamedCookies(int index);
  /**
   * <pre>
   * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in the cache key Cloud CDN generates.
   * </pre>
   *
   * <code>repeated string include_named_cookies = 87316530;</code>
   * @param index The index of the value to return.
   * @return The bytes of the includeNamedCookies at the given index.
   */
  com.google.protobuf.ByteString
      getIncludeNamedCookiesBytes(int index);

  /**
   * <pre>
   * If true, http and https requests will be cached separately.
   * </pre>
   *
   * <code>optional bool include_protocol = 303507535;</code>
   * @return Whether the includeProtocol field is set.
   */
  boolean hasIncludeProtocol();
  /**
   * <pre>
   * If true, http and https requests will be cached separately.
   * </pre>
   *
   * <code>optional bool include_protocol = 303507535;</code>
   * @return The includeProtocol.
   */
  boolean getIncludeProtocol();

  /**
   * <pre>
   * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
   * </pre>
   *
   * <code>optional bool include_query_string = 474036639;</code>
   * @return Whether the includeQueryString field is set.
   */
  boolean hasIncludeQueryString();
  /**
   * <pre>
   * If true, include query string parameters in the cache key according to query_string_whitelist and query_string_blacklist. If neither is set, the entire query string will be included. If false, the query string will be excluded from the cache key entirely.
   * </pre>
   *
   * <code>optional bool include_query_string = 474036639;</code>
   * @return The includeQueryString.
   */
  boolean getIncludeQueryString();

  /**
   * <pre>
   * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_blacklist = 354964742;</code>
   * @return A list containing the queryStringBlacklist.
   */
  java.util.List<java.lang.String>
      getQueryStringBlacklistList();
  /**
   * <pre>
   * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_blacklist = 354964742;</code>
   * @return The count of queryStringBlacklist.
   */
  int getQueryStringBlacklistCount();
  /**
   * <pre>
   * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_blacklist = 354964742;</code>
   * @param index The index of the element to return.
   * @return The queryStringBlacklist at the given index.
   */
  java.lang.String getQueryStringBlacklist(int index);
  /**
   * <pre>
   * Names of query string parameters to exclude in cache keys. All other parameters will be included. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_blacklist = 354964742;</code>
   * @param index The index of the value to return.
   * @return The bytes of the queryStringBlacklist at the given index.
   */
  com.google.protobuf.ByteString
      getQueryStringBlacklistBytes(int index);

  /**
   * <pre>
   * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_whitelist = 52456496;</code>
   * @return A list containing the queryStringWhitelist.
   */
  java.util.List<java.lang.String>
      getQueryStringWhitelistList();
  /**
   * <pre>
   * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_whitelist = 52456496;</code>
   * @return The count of queryStringWhitelist.
   */
  int getQueryStringWhitelistCount();
  /**
   * <pre>
   * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_whitelist = 52456496;</code>
   * @param index The index of the element to return.
   * @return The queryStringWhitelist at the given index.
   */
  java.lang.String getQueryStringWhitelist(int index);
  /**
   * <pre>
   * Names of query string parameters to include in cache keys. All other parameters will be excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;' and '=' will be percent encoded and not treated as delimiters.
   * </pre>
   *
   * <code>repeated string query_string_whitelist = 52456496;</code>
   * @param index The index of the value to return.
   * @return The bytes of the queryStringWhitelist at the given index.
   */
  com.google.protobuf.ByteString
      getQueryStringWhitelistBytes(int index);
}