// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/prediction_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface PredictResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.PredictResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of recommended items. The order represents the ranking (from the
   * most relevant item to the least).
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResult results = 1;</code>
   */
  java.util.List<com.google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResult> 
      getResultsList();
  /**
   * <pre>
   * A list of recommended items. The order represents the ranking (from the
   * most relevant item to the least).
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResult results = 1;</code>
   */
  com.google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResult getResults(int index);
  /**
   * <pre>
   * A list of recommended items. The order represents the ranking (from the
   * most relevant item to the least).
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * A list of recommended items. The order represents the ranking (from the
   * most relevant item to the least).
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResult results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * A list of recommended items. The order represents the ranking (from the
   * most relevant item to the least).
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResult results = 1;</code>
   */
  com.google.cloud.recommendationengine.v1beta1.PredictResponse.PredictionResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * A unique recommendation token. This should be included in the user event
   * logs resulting from this recommendation, which enables accurate attribution
   * of recommendation model performance.
   * </pre>
   *
   * <code>string recommendation_token = 2;</code>
   * @return The recommendationToken.
   */
  java.lang.String getRecommendationToken();
  /**
   * <pre>
   * A unique recommendation token. This should be included in the user event
   * logs resulting from this recommendation, which enables accurate attribution
   * of recommendation model performance.
   * </pre>
   *
   * <code>string recommendation_token = 2;</code>
   * @return The bytes for recommendationToken.
   */
  com.google.protobuf.ByteString
      getRecommendationTokenBytes();

  /**
   * <pre>
   * IDs of items in the request that were missing from the catalog.
   * </pre>
   *
   * <code>repeated string items_missing_in_catalog = 3;</code>
   * @return A list containing the itemsMissingInCatalog.
   */
  java.util.List<java.lang.String>
      getItemsMissingInCatalogList();
  /**
   * <pre>
   * IDs of items in the request that were missing from the catalog.
   * </pre>
   *
   * <code>repeated string items_missing_in_catalog = 3;</code>
   * @return The count of itemsMissingInCatalog.
   */
  int getItemsMissingInCatalogCount();
  /**
   * <pre>
   * IDs of items in the request that were missing from the catalog.
   * </pre>
   *
   * <code>repeated string items_missing_in_catalog = 3;</code>
   * @param index The index of the element to return.
   * @return The itemsMissingInCatalog at the given index.
   */
  java.lang.String getItemsMissingInCatalog(int index);
  /**
   * <pre>
   * IDs of items in the request that were missing from the catalog.
   * </pre>
   *
   * <code>repeated string items_missing_in_catalog = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the itemsMissingInCatalog at the given index.
   */
  com.google.protobuf.ByteString
      getItemsMissingInCatalogBytes(int index);

  /**
   * <pre>
   * True if the dryRun property was set in the request.
   * </pre>
   *
   * <code>bool dry_run = 4;</code>
   * @return The dryRun.
   */
  boolean getDryRun();

  /**
   * <pre>
   * Additional domain specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; metadata = 5;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * Additional domain specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; metadata = 5;</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getMetadata();
  /**
   * <pre>
   * Additional domain specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; metadata = 5;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getMetadataMap();
  /**
   * <pre>
   * Additional domain specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; metadata = 5;</code>
   */

  /* nullable */
com.google.protobuf.Value getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <pre>
   * Additional domain specific prediction response metadata.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; metadata = 5;</code>
   */

  com.google.protobuf.Value getMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * If empty, the list is complete. If nonempty, the token to pass to the next
   * request's PredictRequest.page_token.
   * </pre>
   *
   * <code>string next_page_token = 6;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If empty, the list is complete. If nonempty, the token to pass to the next
   * request's PredictRequest.page_token.
   * </pre>
   *
   * <code>string next_page_token = 6;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}