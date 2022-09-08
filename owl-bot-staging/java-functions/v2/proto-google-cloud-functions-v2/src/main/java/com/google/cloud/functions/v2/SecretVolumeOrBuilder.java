// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2/functions.proto

package com.google.cloud.functions.v2;

public interface SecretVolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2.SecretVolume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The path within the container to mount the secret volume. For example,
   * setting the mount_path as `/etc/secrets` would mount the secret value files
   * under the `/etc/secrets` directory. This directory will also be completely
   * shadowed and unavailable to mount any other secrets.
   * Recommended mount path: /etc/secrets
   * </pre>
   *
   * <code>string mount_path = 1;</code>
   * @return The mountPath.
   */
  java.lang.String getMountPath();
  /**
   * <pre>
   * The path within the container to mount the secret volume. For example,
   * setting the mount_path as `/etc/secrets` would mount the secret value files
   * under the `/etc/secrets` directory. This directory will also be completely
   * shadowed and unavailable to mount any other secrets.
   * Recommended mount path: /etc/secrets
   * </pre>
   *
   * <code>string mount_path = 1;</code>
   * @return The bytes for mountPath.
   */
  com.google.protobuf.ByteString
      getMountPathBytes();

  /**
   * <pre>
   * Project identifier (preferably project number but can also be the project
   * ID) of the project that contains the secret. If not set, it is
   * assumed that the secret is in the same project as the function.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Project identifier (preferably project number but can also be the project
   * ID) of the project that contains the secret. If not set, it is
   * assumed that the secret is in the same project as the function.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Name of the secret in secret manager (not the full resource name).
   * </pre>
   *
   * <code>string secret = 3;</code>
   * @return The secret.
   */
  java.lang.String getSecret();
  /**
   * <pre>
   * Name of the secret in secret manager (not the full resource name).
   * </pre>
   *
   * <code>string secret = 3;</code>
   * @return The bytes for secret.
   */
  com.google.protobuf.ByteString
      getSecretBytes();

  /**
   * <pre>
   * List of secret versions to mount for this secret. If empty, the `latest`
   * version of the secret will be made available in a file named after the
   * secret under the mount point.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2.SecretVolume.SecretVersion versions = 4;</code>
   */
  java.util.List<com.google.cloud.functions.v2.SecretVolume.SecretVersion> 
      getVersionsList();
  /**
   * <pre>
   * List of secret versions to mount for this secret. If empty, the `latest`
   * version of the secret will be made available in a file named after the
   * secret under the mount point.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2.SecretVolume.SecretVersion versions = 4;</code>
   */
  com.google.cloud.functions.v2.SecretVolume.SecretVersion getVersions(int index);
  /**
   * <pre>
   * List of secret versions to mount for this secret. If empty, the `latest`
   * version of the secret will be made available in a file named after the
   * secret under the mount point.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2.SecretVolume.SecretVersion versions = 4;</code>
   */
  int getVersionsCount();
  /**
   * <pre>
   * List of secret versions to mount for this secret. If empty, the `latest`
   * version of the secret will be made available in a file named after the
   * secret under the mount point.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2.SecretVolume.SecretVersion versions = 4;</code>
   */
  java.util.List<? extends com.google.cloud.functions.v2.SecretVolume.SecretVersionOrBuilder> 
      getVersionsOrBuilderList();
  /**
   * <pre>
   * List of secret versions to mount for this secret. If empty, the `latest`
   * version of the secret will be made available in a file named after the
   * secret under the mount point.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2.SecretVolume.SecretVersion versions = 4;</code>
   */
  com.google.cloud.functions.v2.SecretVolume.SecretVersionOrBuilder getVersionsOrBuilder(
      int index);
}