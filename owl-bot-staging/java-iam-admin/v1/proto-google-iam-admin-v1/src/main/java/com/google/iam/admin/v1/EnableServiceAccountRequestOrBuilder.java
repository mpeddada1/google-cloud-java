// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface EnableServiceAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.EnableServiceAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}