// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/trigger.proto

package com.google.cloud.eventarc.v1;

public interface PubsubOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.Pubsub)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The name of the Pub/Sub topic created and managed by Eventarc as
   * a transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`.
   * You can set an existing topic for triggers of the type
   * `google.cloud.pubsub.topic.v1.messagePublished`. The topic you provide
   * here is not deleted by Eventarc at trigger deletion.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * Optional. The name of the Pub/Sub topic created and managed by Eventarc as
   * a transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`.
   * You can set an existing topic for triggers of the type
   * `google.cloud.pubsub.topic.v1.messagePublished`. The topic you provide
   * here is not deleted by Eventarc at trigger deletion.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * Output only. The name of the Pub/Sub subscription created and managed by Eventarc
   * as a transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
   * </pre>
   *
   * <code>string subscription = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * Output only. The name of the Pub/Sub subscription created and managed by Eventarc
   * as a transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
   * </pre>
   *
   * <code>string subscription = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();
}