// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1;

public interface ListFindingTypeStatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1.ListFindingTypeStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.FindingTypeStats finding_type_stats = 1;</code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1.FindingTypeStats> 
      getFindingTypeStatsList();
  /**
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.FindingTypeStats finding_type_stats = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1.FindingTypeStats getFindingTypeStats(int index);
  /**
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.FindingTypeStats finding_type_stats = 1;</code>
   */
  int getFindingTypeStatsCount();
  /**
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.FindingTypeStats finding_type_stats = 1;</code>
   */
  java.util.List<? extends com.google.cloud.websecurityscanner.v1.FindingTypeStatsOrBuilder> 
      getFindingTypeStatsOrBuilderList();
  /**
   * <pre>
   * The list of FindingTypeStats returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.FindingTypeStats finding_type_stats = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1.FindingTypeStatsOrBuilder getFindingTypeStatsOrBuilder(
      int index);
}