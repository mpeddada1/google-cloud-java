// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/session.proto

package com.google.cloud.dialogflow.cx.v3;

public interface FulfillIntentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.FulfillIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Must be same as the corresponding MatchIntent request, otherwise the
   * behavior is undefined.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.MatchIntentRequest match_intent_request = 1;</code>
   * @return Whether the matchIntentRequest field is set.
   */
  boolean hasMatchIntentRequest();
  /**
   * <pre>
   * Must be same as the corresponding MatchIntent request, otherwise the
   * behavior is undefined.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.MatchIntentRequest match_intent_request = 1;</code>
   * @return The matchIntentRequest.
   */
  com.google.cloud.dialogflow.cx.v3.MatchIntentRequest getMatchIntentRequest();
  /**
   * <pre>
   * Must be same as the corresponding MatchIntent request, otherwise the
   * behavior is undefined.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.MatchIntentRequest match_intent_request = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.MatchIntentRequestOrBuilder getMatchIntentRequestOrBuilder();

  /**
   * <pre>
   * The matched intent/event to fulfill.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 2;</code>
   * @return Whether the match field is set.
   */
  boolean hasMatch();
  /**
   * <pre>
   * The matched intent/event to fulfill.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 2;</code>
   * @return The match.
   */
  com.google.cloud.dialogflow.cx.v3.Match getMatch();
  /**
   * <pre>
   * The matched intent/event to fulfill.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match match = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.MatchOrBuilder getMatchOrBuilder();

  /**
   * <pre>
   * Instructs the speech synthesizer how to generate output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.OutputAudioConfig output_audio_config = 3;</code>
   * @return Whether the outputAudioConfig field is set.
   */
  boolean hasOutputAudioConfig();
  /**
   * <pre>
   * Instructs the speech synthesizer how to generate output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.OutputAudioConfig output_audio_config = 3;</code>
   * @return The outputAudioConfig.
   */
  com.google.cloud.dialogflow.cx.v3.OutputAudioConfig getOutputAudioConfig();
  /**
   * <pre>
   * Instructs the speech synthesizer how to generate output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.OutputAudioConfig output_audio_config = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();
}