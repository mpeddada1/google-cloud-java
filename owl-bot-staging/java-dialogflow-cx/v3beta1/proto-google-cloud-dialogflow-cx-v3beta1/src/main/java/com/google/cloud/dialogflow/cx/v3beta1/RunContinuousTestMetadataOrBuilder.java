// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/environment.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface RunContinuousTestMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestError> 
      getErrorsList();
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestError getErrors(int index);
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder getErrorsOrBuilder(
      int index);
}