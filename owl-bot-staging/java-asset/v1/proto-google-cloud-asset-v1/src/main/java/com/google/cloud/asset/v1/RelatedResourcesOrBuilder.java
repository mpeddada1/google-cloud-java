// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

public interface RelatedResourcesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.RelatedResources)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  java.util.List<com.google.cloud.asset.v1.RelatedResource> 
      getRelatedResourcesList();
  /**
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  com.google.cloud.asset.v1.RelatedResource getRelatedResources(int index);
  /**
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  int getRelatedResourcesCount();
  /**
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.RelatedResourceOrBuilder> 
      getRelatedResourcesOrBuilderList();
  /**
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  com.google.cloud.asset.v1.RelatedResourceOrBuilder getRelatedResourcesOrBuilder(
      int index);
}