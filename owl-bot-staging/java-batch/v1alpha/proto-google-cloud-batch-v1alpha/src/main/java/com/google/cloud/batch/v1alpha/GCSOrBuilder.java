// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1alpha/volume.proto

package com.google.cloud.batch.v1alpha;

public interface GCSOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.GCS)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Remote path, either a bucket name or a subdirectory of a bucket, e.g.:
   * bucket_name, bucket_name/subdirectory/
   * </pre>
   *
   * <code>string remote_path = 1;</code>
   * @return The remotePath.
   */
  java.lang.String getRemotePath();
  /**
   * <pre>
   * Remote path, either a bucket name or a subdirectory of a bucket, e.g.:
   * bucket_name, bucket_name/subdirectory/
   * </pre>
   *
   * <code>string remote_path = 1;</code>
   * @return The bytes for remotePath.
   */
  com.google.protobuf.ByteString
      getRemotePathBytes();
}