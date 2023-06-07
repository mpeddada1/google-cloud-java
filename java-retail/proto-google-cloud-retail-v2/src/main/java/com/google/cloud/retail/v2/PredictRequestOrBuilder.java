/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/prediction_service.proto

package com.google.cloud.retail.v2;

public interface PredictRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.PredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of the format:
   * `{placement=projects/&#42;&#47;locations/global/catalogs/default_catalog/servingConfigs/&#42;}`
   * or
   * `{placement=projects/&#42;&#47;locations/global/catalogs/default_catalog/placements/&#42;}`.
   * We recommend using the `servingConfigs` resource. `placements` is a legacy
   * resource.
   * The ID of the Recommendations AI serving config or placement.
   * Before you can request predictions from your model, you must create at
   * least one serving config or placement for it. For more information, see
   * [Manage serving configs]
   * (https://cloud.google.com/retail/docs/manage-configs).
   *
   * The full list of available serving configs can be seen at
   * https://console.cloud.google.com/ai/retail/catalogs/default_catalog/configs
   * </pre>
   *
   * <code>string placement = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The placement.
   */
  java.lang.String getPlacement();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the format:
   * `{placement=projects/&#42;&#47;locations/global/catalogs/default_catalog/servingConfigs/&#42;}`
   * or
   * `{placement=projects/&#42;&#47;locations/global/catalogs/default_catalog/placements/&#42;}`.
   * We recommend using the `servingConfigs` resource. `placements` is a legacy
   * resource.
   * The ID of the Recommendations AI serving config or placement.
   * Before you can request predictions from your model, you must create at
   * least one serving config or placement for it. For more information, see
   * [Manage serving configs]
   * (https://cloud.google.com/retail/docs/manage-configs).
   *
   * The full list of available serving configs can be seen at
   * https://console.cloud.google.com/ai/retail/catalogs/default_catalog/configs
   * </pre>
   *
   * <code>string placement = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for placement.
   */
  com.google.protobuf.ByteString getPlacementBytes();

  /**
   *
   *
   * <pre>
   * Required. Context about the user, what they are looking at and what action
   * they took to trigger the predict request. Note that this user event detail
   * won't be ingested to userEvent logs. Thus, a separate userEvent write
   * request is required for event logging.
   *
   * Don't set
   * [UserEvent.visitor_id][google.cloud.retail.v2.UserEvent.visitor_id] or
   * [UserInfo.user_id][google.cloud.retail.v2.UserInfo.user_id] to the same
   * fixed ID for different users. If you are trying to receive non-personalized
   * recommendations (not recommended; this can negatively impact model
   * performance), instead set
   * [UserEvent.visitor_id][google.cloud.retail.v2.UserEvent.visitor_id] to a
   * random unique ID and leave
   * [UserInfo.user_id][google.cloud.retail.v2.UserInfo.user_id] unset.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userEvent field is set.
   */
  boolean hasUserEvent();
  /**
   *
   *
   * <pre>
   * Required. Context about the user, what they are looking at and what action
   * they took to trigger the predict request. Note that this user event detail
   * won't be ingested to userEvent logs. Thus, a separate userEvent write
   * request is required for event logging.
   *
   * Don't set
   * [UserEvent.visitor_id][google.cloud.retail.v2.UserEvent.visitor_id] or
   * [UserInfo.user_id][google.cloud.retail.v2.UserInfo.user_id] to the same
   * fixed ID for different users. If you are trying to receive non-personalized
   * recommendations (not recommended; this can negatively impact model
   * performance), instead set
   * [UserEvent.visitor_id][google.cloud.retail.v2.UserEvent.visitor_id] to a
   * random unique ID and leave
   * [UserInfo.user_id][google.cloud.retail.v2.UserInfo.user_id] unset.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userEvent.
   */
  com.google.cloud.retail.v2.UserEvent getUserEvent();
  /**
   *
   *
   * <pre>
   * Required. Context about the user, what they are looking at and what action
   * they took to trigger the predict request. Note that this user event detail
   * won't be ingested to userEvent logs. Thus, a separate userEvent write
   * request is required for event logging.
   *
   * Don't set
   * [UserEvent.visitor_id][google.cloud.retail.v2.UserEvent.visitor_id] or
   * [UserInfo.user_id][google.cloud.retail.v2.UserInfo.user_id] to the same
   * fixed ID for different users. If you are trying to receive non-personalized
   * recommendations (not recommended; this can negatively impact model
   * performance), instead set
   * [UserEvent.visitor_id][google.cloud.retail.v2.UserEvent.visitor_id] to a
   * random unique ID and leave
   * [UserInfo.user_id][google.cloud.retail.v2.UserInfo.user_id] unset.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.UserEvent user_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2.UserEventOrBuilder getUserEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum number of results to return. Set this property to the number of
   * prediction results needed. If zero, the service will choose a reasonable
   * default. The maximum allowed value is 100. Values above 100 will be coerced
   * to 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * This field is not used; leave it unset.
   * </pre>
   *
   * <code>string page_token = 4 [deprecated = true];</code>
   *
   * @deprecated google.cloud.retail.v2.PredictRequest.page_token is deprecated. See
   *     google/cloud/retail/v2/prediction_service.proto;l=94
   * @return The pageToken.
   */
  @java.lang.Deprecated
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * This field is not used; leave it unset.
   * </pre>
   *
   * <code>string page_token = 4 [deprecated = true];</code>
   *
   * @deprecated google.cloud.retail.v2.PredictRequest.page_token is deprecated. See
   *     google/cloud/retail/v2/prediction_service.proto;l=94
   * @return The bytes for pageToken.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Filter for restricting prediction results with a length limit of 5,000
   * characters. Accepts values for tags and the `filterOutOfStockItems` flag.
   *
   *  * Tag expressions. Restricts predictions to products that match all of the
   *    specified tags. Boolean operators `OR` and `NOT` are supported if the
   *    expression is enclosed in parentheses, and must be separated from the
   *    tag values by a space. `-"tagA"` is also supported and is equivalent to
   *    `NOT "tagA"`. Tag values must be double quoted UTF-8 encoded strings
   *    with a size limit of 1,000 characters.
   *
   *    Note: "Recently viewed" models don't support tag filtering at the
   *    moment.
   *
   *  * filterOutOfStockItems. Restricts predictions to products that do not
   *  have a
   *    stockState value of OUT_OF_STOCK.
   *
   * Examples:
   *
   *  * tag=("Red" OR "Blue") tag="New-Arrival" tag=(NOT "promotional")
   *  * filterOutOfStockItems  tag=(-"promotional")
   *  * filterOutOfStockItems
   *
   * If your filter blocks all prediction results, the API will return *no*
   * results. If instead you want empty result sets to return generic
   * (unfiltered) popular products, set `strictFiltering` to False in
   * `PredictRequest.params`. Note that the API will never return items with
   * storageStatus of "EXPIRED" or "DELETED" regardless of filter choices.
   *
   * If `filterSyntaxV2` is set to true under the `params` field, then
   * attribute-based expressions are expected instead of the above described
   * tag-based syntax. Examples:
   *
   *  * (colors: ANY("Red", "Blue")) AND NOT (categories: ANY("Phones"))
   *  * (availability: ANY("IN_STOCK")) AND
   *    (colors: ANY("Red") OR categories: ANY("Phones"))
   *
   * For more information, see
   * [Filter recommendations](https://cloud.google.com/retail/docs/filter-recs).
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter for restricting prediction results with a length limit of 5,000
   * characters. Accepts values for tags and the `filterOutOfStockItems` flag.
   *
   *  * Tag expressions. Restricts predictions to products that match all of the
   *    specified tags. Boolean operators `OR` and `NOT` are supported if the
   *    expression is enclosed in parentheses, and must be separated from the
   *    tag values by a space. `-"tagA"` is also supported and is equivalent to
   *    `NOT "tagA"`. Tag values must be double quoted UTF-8 encoded strings
   *    with a size limit of 1,000 characters.
   *
   *    Note: "Recently viewed" models don't support tag filtering at the
   *    moment.
   *
   *  * filterOutOfStockItems. Restricts predictions to products that do not
   *  have a
   *    stockState value of OUT_OF_STOCK.
   *
   * Examples:
   *
   *  * tag=("Red" OR "Blue") tag="New-Arrival" tag=(NOT "promotional")
   *  * filterOutOfStockItems  tag=(-"promotional")
   *  * filterOutOfStockItems
   *
   * If your filter blocks all prediction results, the API will return *no*
   * results. If instead you want empty result sets to return generic
   * (unfiltered) popular products, set `strictFiltering` to False in
   * `PredictRequest.params`. Note that the API will never return items with
   * storageStatus of "EXPIRED" or "DELETED" regardless of filter choices.
   *
   * If `filterSyntaxV2` is set to true under the `params` field, then
   * attribute-based expressions are expected instead of the above described
   * tag-based syntax. Examples:
   *
   *  * (colors: ANY("Red", "Blue")) AND NOT (categories: ANY("Phones"))
   *  * (availability: ANY("IN_STOCK")) AND
   *    (colors: ANY("Red") OR categories: ANY("Phones"))
   *
   * For more information, see
   * [Filter recommendations](https://cloud.google.com/retail/docs/filter-recs).
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Use validate only mode for this prediction query. If set to true, a
   * dummy model will be used that returns arbitrary products.
   * Note that the validate only mode should only be used for testing the API,
   * or if the model is not ready.
   * </pre>
   *
   * <code>bool validate_only = 6;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the predictions.
   *
   * Allowed values:
   *
   * * `returnProduct`: Boolean. If set to true, the associated product
   *    object will be returned in the `results.metadata` field in the
   *    prediction response.
   * * `returnScore`: Boolean. If set to true, the prediction 'score'
   *    corresponding to each returned product will be set in the
   *    `results.metadata` field in the prediction response. The given
   *    'score' indicates the probability of a product being clicked/purchased
   *    given the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular products instead of empty if
   *    your filter blocks all prediction results.
   * * `priceRerankLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-price-reranking', 'low-price-reranking',
   *    'medium-price-reranking', 'high-price-reranking'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    price.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-diversity', 'low-diversity',
   *    'medium-diversity', 'high-diversity', 'auto-diversity'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    category.
   * * `filterSyntaxV2`: Boolean. False by default. If set to true, the `filter`
   *   field is interpreteted according to the new, attribute-based syntax.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 7;</code>
   */
  int getParamsCount();
  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the predictions.
   *
   * Allowed values:
   *
   * * `returnProduct`: Boolean. If set to true, the associated product
   *    object will be returned in the `results.metadata` field in the
   *    prediction response.
   * * `returnScore`: Boolean. If set to true, the prediction 'score'
   *    corresponding to each returned product will be set in the
   *    `results.metadata` field in the prediction response. The given
   *    'score' indicates the probability of a product being clicked/purchased
   *    given the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular products instead of empty if
   *    your filter blocks all prediction results.
   * * `priceRerankLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-price-reranking', 'low-price-reranking',
   *    'medium-price-reranking', 'high-price-reranking'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    price.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-diversity', 'low-diversity',
   *    'medium-diversity', 'high-diversity', 'auto-diversity'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    category.
   * * `filterSyntaxV2`: Boolean. False by default. If set to true, the `filter`
   *   field is interpreteted according to the new, attribute-based syntax.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 7;</code>
   */
  boolean containsParams(java.lang.String key);
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getParams();
  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the predictions.
   *
   * Allowed values:
   *
   * * `returnProduct`: Boolean. If set to true, the associated product
   *    object will be returned in the `results.metadata` field in the
   *    prediction response.
   * * `returnScore`: Boolean. If set to true, the prediction 'score'
   *    corresponding to each returned product will be set in the
   *    `results.metadata` field in the prediction response. The given
   *    'score' indicates the probability of a product being clicked/purchased
   *    given the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular products instead of empty if
   *    your filter blocks all prediction results.
   * * `priceRerankLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-price-reranking', 'low-price-reranking',
   *    'medium-price-reranking', 'high-price-reranking'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    price.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-diversity', 'low-diversity',
   *    'medium-diversity', 'high-diversity', 'auto-diversity'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    category.
   * * `filterSyntaxV2`: Boolean. False by default. If set to true, the `filter`
   *   field is interpreteted according to the new, attribute-based syntax.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 7;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getParamsMap();
  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the predictions.
   *
   * Allowed values:
   *
   * * `returnProduct`: Boolean. If set to true, the associated product
   *    object will be returned in the `results.metadata` field in the
   *    prediction response.
   * * `returnScore`: Boolean. If set to true, the prediction 'score'
   *    corresponding to each returned product will be set in the
   *    `results.metadata` field in the prediction response. The given
   *    'score' indicates the probability of a product being clicked/purchased
   *    given the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular products instead of empty if
   *    your filter blocks all prediction results.
   * * `priceRerankLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-price-reranking', 'low-price-reranking',
   *    'medium-price-reranking', 'high-price-reranking'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    price.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-diversity', 'low-diversity',
   *    'medium-diversity', 'high-diversity', 'auto-diversity'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    category.
   * * `filterSyntaxV2`: Boolean. False by default. If set to true, the `filter`
   *   field is interpreteted according to the new, attribute-based syntax.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 7;</code>
   */
  /* nullable */
  com.google.protobuf.Value getParamsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Additional domain specific parameters for the predictions.
   *
   * Allowed values:
   *
   * * `returnProduct`: Boolean. If set to true, the associated product
   *    object will be returned in the `results.metadata` field in the
   *    prediction response.
   * * `returnScore`: Boolean. If set to true, the prediction 'score'
   *    corresponding to each returned product will be set in the
   *    `results.metadata` field in the prediction response. The given
   *    'score' indicates the probability of a product being clicked/purchased
   *    given the user's context and history.
   * * `strictFiltering`: Boolean. True by default. If set to false, the service
   *    will return generic (unfiltered) popular products instead of empty if
   *    your filter blocks all prediction results.
   * * `priceRerankLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-price-reranking', 'low-price-reranking',
   *    'medium-price-reranking', 'high-price-reranking'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    price.
   * * `diversityLevel`: String. Default empty. If set to be non-empty, then
   *    it needs to be one of {'no-diversity', 'low-diversity',
   *    'medium-diversity', 'high-diversity', 'auto-diversity'}. This gives
   *    request-level control and adjusts prediction results based on product
   *    category.
   * * `filterSyntaxV2`: Boolean. False by default. If set to true, the `filter`
   *   field is interpreteted according to the new, attribute-based syntax.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 7;</code>
   */
  com.google.protobuf.Value getParamsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
