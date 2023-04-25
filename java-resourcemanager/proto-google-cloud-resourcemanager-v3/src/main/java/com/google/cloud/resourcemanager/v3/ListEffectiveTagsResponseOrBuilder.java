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
// source: google/cloud/resourcemanager/v3/tag_bindings.proto

package com.google.cloud.resourcemanager.v3;

public interface ListEffectiveTagsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.ListEffectiveTagsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A possibly paginated list of effective tags for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.EffectiveTag effective_tags = 1;</code>
   */
  java.util.List<com.google.cloud.resourcemanager.v3.EffectiveTag> getEffectiveTagsList();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of effective tags for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.EffectiveTag effective_tags = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.EffectiveTag getEffectiveTags(int index);
  /**
   *
   *
   * <pre>
   * A possibly paginated list of effective tags for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.EffectiveTag effective_tags = 1;</code>
   */
  int getEffectiveTagsCount();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of effective tags for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.EffectiveTag effective_tags = 1;</code>
   */
  java.util.List<? extends com.google.cloud.resourcemanager.v3.EffectiveTagOrBuilder>
      getEffectiveTagsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of effective tags for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.EffectiveTag effective_tags = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.EffectiveTagOrBuilder getEffectiveTagsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pagination token.
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   * Pagination tokens have a limited lifetime.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Pagination token.
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   * Pagination tokens have a limited lifetime.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
