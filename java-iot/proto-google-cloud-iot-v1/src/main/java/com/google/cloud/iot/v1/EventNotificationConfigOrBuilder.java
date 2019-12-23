/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

public interface EventNotificationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.EventNotificationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If the subfolder name matches this string exactly, this configuration will
   * be used. The string must not include the leading '/' character. If empty,
   * all strings are matched. This field is used only for telemetry events;
   * subfolders are not supported for state changes.
   * </pre>
   *
   * <code>string subfolder_matches = 2;</code>
   *
   * @return The subfolderMatches.
   */
  java.lang.String getSubfolderMatches();
  /**
   *
   *
   * <pre>
   * If the subfolder name matches this string exactly, this configuration will
   * be used. The string must not include the leading '/' character. If empty,
   * all strings are matched. This field is used only for telemetry events;
   * subfolders are not supported for state changes.
   * </pre>
   *
   * <code>string subfolder_matches = 2;</code>
   *
   * @return The bytes for subfolderMatches.
   */
  com.google.protobuf.ByteString getSubfolderMatchesBytes();

  /**
   *
   *
   * <pre>
   * A Cloud Pub/Sub topic name. For example,
   * `projects/myProject/topics/deviceEvents`.
   * </pre>
   *
   * <code>string pubsub_topic_name = 1;</code>
   *
   * @return The pubsubTopicName.
   */
  java.lang.String getPubsubTopicName();
  /**
   *
   *
   * <pre>
   * A Cloud Pub/Sub topic name. For example,
   * `projects/myProject/topics/deviceEvents`.
   * </pre>
   *
   * <code>string pubsub_topic_name = 1;</code>
   *
   * @return The bytes for pubsubTopicName.
   */
  com.google.protobuf.ByteString getPubsubTopicNameBytes();
}
