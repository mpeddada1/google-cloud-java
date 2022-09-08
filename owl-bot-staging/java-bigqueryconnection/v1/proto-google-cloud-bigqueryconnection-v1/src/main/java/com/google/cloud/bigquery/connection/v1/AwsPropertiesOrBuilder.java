// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

public interface AwsPropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.AwsProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Authentication using Google owned AWS IAM user's access key to assume
   * into customer's AWS IAM Role.
   * Deprecated, do not use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
   * @deprecated google.cloud.bigquery.connection.v1.AwsProperties.cross_account_role is deprecated.
   *     See google/cloud/bigquery/connection/v1/connection.proto;l=314
   * @return Whether the crossAccountRole field is set.
   */
  @java.lang.Deprecated boolean hasCrossAccountRole();
  /**
   * <pre>
   * Authentication using Google owned AWS IAM user's access key to assume
   * into customer's AWS IAM Role.
   * Deprecated, do not use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
   * @deprecated google.cloud.bigquery.connection.v1.AwsProperties.cross_account_role is deprecated.
   *     See google/cloud/bigquery/connection/v1/connection.proto;l=314
   * @return The crossAccountRole.
   */
  @java.lang.Deprecated com.google.cloud.bigquery.connection.v1.AwsCrossAccountRole getCrossAccountRole();
  /**
   * <pre>
   * Authentication using Google owned AWS IAM user's access key to assume
   * into customer's AWS IAM Role.
   * Deprecated, do not use.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsCrossAccountRole cross_account_role = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.cloud.bigquery.connection.v1.AwsCrossAccountRoleOrBuilder getCrossAccountRoleOrBuilder();

  /**
   * <pre>
   * Authentication using Google owned service account to assume into
   * customer's AWS IAM Role.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
   * @return Whether the accessRole field is set.
   */
  boolean hasAccessRole();
  /**
   * <pre>
   * Authentication using Google owned service account to assume into
   * customer's AWS IAM Role.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
   * @return The accessRole.
   */
  com.google.cloud.bigquery.connection.v1.AwsAccessRole getAccessRole();
  /**
   * <pre>
   * Authentication using Google owned service account to assume into
   * customer's AWS IAM Role.
   * </pre>
   *
   * <code>.google.cloud.bigquery.connection.v1.AwsAccessRole access_role = 3;</code>
   */
  com.google.cloud.bigquery.connection.v1.AwsAccessRoleOrBuilder getAccessRoleOrBuilder();

  public com.google.cloud.bigquery.connection.v1.AwsProperties.AuthenticationMethodCase getAuthenticationMethodCase();
}