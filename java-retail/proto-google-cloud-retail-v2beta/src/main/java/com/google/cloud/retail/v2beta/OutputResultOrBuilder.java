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
// source: google/cloud/retail/v2beta/export_config.proto

package com.google.cloud.retail.v2beta;

public interface OutputResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.OutputResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Export result in BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.BigQueryOutputResult bigquery_result = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2beta.BigQueryOutputResult> getBigqueryResultList();
  /**
   *
   *
   * <pre>
   * Export result in BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.BigQueryOutputResult bigquery_result = 1;</code>
   */
  com.google.cloud.retail.v2beta.BigQueryOutputResult getBigqueryResult(int index);
  /**
   *
   *
   * <pre>
   * Export result in BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.BigQueryOutputResult bigquery_result = 1;</code>
   */
  int getBigqueryResultCount();
  /**
   *
   *
   * <pre>
   * Export result in BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.BigQueryOutputResult bigquery_result = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2beta.BigQueryOutputResultOrBuilder>
      getBigqueryResultOrBuilderList();
  /**
   *
   *
   * <pre>
   * Export result in BigQuery.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.BigQueryOutputResult bigquery_result = 1;</code>
   */
  com.google.cloud.retail.v2beta.BigQueryOutputResultOrBuilder getBigqueryResultOrBuilder(
      int index);
}