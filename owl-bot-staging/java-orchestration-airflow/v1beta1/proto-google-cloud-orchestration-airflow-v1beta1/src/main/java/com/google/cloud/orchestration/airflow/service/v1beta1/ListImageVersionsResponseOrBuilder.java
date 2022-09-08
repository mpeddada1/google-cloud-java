// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1beta1/image_versions.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface ListImageVersionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.ListImageVersionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  java.util.List<com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion> 
      getImageVersionsList();
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersion getImageVersions(int index);
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  int getImageVersionsCount();
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder> 
      getImageVersionsOrBuilderList();
  /**
   * <pre>
   * The list of supported ImageVersions in a location.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1beta1.ImageVersion image_versions = 1;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.ImageVersionOrBuilder getImageVersionsOrBuilder(
      int index);

  /**
   * <pre>
   * The page token used to query for the next page if one exists.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The page token used to query for the next page if one exists.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}