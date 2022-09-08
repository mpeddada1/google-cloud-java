// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface BoundingBoxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.BoundingBox)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Top coordinate of the bounding box. (0,0) is upper left.
   * </pre>
   *
   * <code>int32 top = 1;</code>
   * @return The top.
   */
  int getTop();

  /**
   * <pre>
   * Left coordinate of the bounding box. (0,0) is upper left.
   * </pre>
   *
   * <code>int32 left = 2;</code>
   * @return The left.
   */
  int getLeft();

  /**
   * <pre>
   * Width of the bounding box in pixels.
   * </pre>
   *
   * <code>int32 width = 3;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <pre>
   * Height of the bounding box in pixels.
   * </pre>
   *
   * <code>int32 height = 4;</code>
   * @return The height.
   */
  int getHeight();
}