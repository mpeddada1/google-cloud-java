// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface LintPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.LintPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The full resource name of the policy this lint request is about.
   * The name follows the Google Cloud Platform (GCP) resource format.
   * For example, a GCP project with ID `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * The resource name is not used to read the policy instance from the Cloud
   * IAM database. The candidate policy for lint has to be provided in the same
   * request object.
   * </pre>
   *
   * <code>string full_resource_name = 1;</code>
   * @return The fullResourceName.
   */
  java.lang.String getFullResourceName();
  /**
   * <pre>
   * The full resource name of the policy this lint request is about.
   * The name follows the Google Cloud Platform (GCP) resource format.
   * For example, a GCP project with ID `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * The resource name is not used to read the policy instance from the Cloud
   * IAM database. The candidate policy for lint has to be provided in the same
   * request object.
   * </pre>
   *
   * <code>string full_resource_name = 1;</code>
   * @return The bytes for fullResourceName.
   */
  com.google.protobuf.ByteString
      getFullResourceNameBytes();

  /**
   * <pre>
   * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   * @return Whether the condition field is set.
   */
  boolean hasCondition();
  /**
   * <pre>
   * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   * @return The condition.
   */
  com.google.type.Expr getCondition();
  /**
   * <pre>
   * [google.iam.v1.Binding.condition] [google.iam.v1.Binding.condition] object to be linted.
   * </pre>
   *
   * <code>.google.type.Expr condition = 5;</code>
   */
  com.google.type.ExprOrBuilder getConditionOrBuilder();

  public com.google.iam.admin.v1.LintPolicyRequest.LintObjectCase getLintObjectCase();
}