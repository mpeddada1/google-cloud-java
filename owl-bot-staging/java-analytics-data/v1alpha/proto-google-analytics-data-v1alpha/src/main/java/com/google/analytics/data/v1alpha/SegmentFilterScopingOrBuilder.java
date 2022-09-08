// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface SegmentFilterScopingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.SegmentFilterScoping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If `atAnyPointInTime` is true, this filter evaluates to true for all
   * events if it evaluates to true for any event in the date range of the
   * request.
   * This `atAnyPointInTime` parameter does not extend the date range of
   * events in the report. If `atAnyPointInTime` is true, only events within
   * the report's date range are considered when evaluating this filter.
   * This `atAnyPointInTime` is only able to be specified if the criteria
   * scoping is `ACROSS_ALL_SESSIONS` and is not able to be specified in
   * sequences.
   * If the criteria scoping is `ACROSS_ALL_SESSIONS`, `atAnyPointInTime` =
   * false is used if unspecified.
   * </pre>
   *
   * <code>optional bool at_any_point_in_time = 1;</code>
   * @return Whether the atAnyPointInTime field is set.
   */
  boolean hasAtAnyPointInTime();
  /**
   * <pre>
   * If `atAnyPointInTime` is true, this filter evaluates to true for all
   * events if it evaluates to true for any event in the date range of the
   * request.
   * This `atAnyPointInTime` parameter does not extend the date range of
   * events in the report. If `atAnyPointInTime` is true, only events within
   * the report's date range are considered when evaluating this filter.
   * This `atAnyPointInTime` is only able to be specified if the criteria
   * scoping is `ACROSS_ALL_SESSIONS` and is not able to be specified in
   * sequences.
   * If the criteria scoping is `ACROSS_ALL_SESSIONS`, `atAnyPointInTime` =
   * false is used if unspecified.
   * </pre>
   *
   * <code>optional bool at_any_point_in_time = 1;</code>
   * @return The atAnyPointInTime.
   */
  boolean getAtAnyPointInTime();
}