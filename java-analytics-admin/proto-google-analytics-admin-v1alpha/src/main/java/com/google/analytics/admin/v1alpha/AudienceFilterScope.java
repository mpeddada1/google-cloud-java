/*
 * Copyright 2020 Google LLC
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
// source: google/analytics/admin/v1alpha/audience.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Specifies how to evaluate users for joining an Audience.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.admin.v1alpha.AudienceFilterScope}
 */
public enum AudienceFilterScope implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Scope is not specified.
   * </pre>
   *
   * <code>AUDIENCE_FILTER_SCOPE_UNSPECIFIED = 0;</code>
   */
  AUDIENCE_FILTER_SCOPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * User joins the Audience if the filter condition is met within one
   * event.
   * </pre>
   *
   * <code>AUDIENCE_FILTER_SCOPE_WITHIN_SAME_EVENT = 1;</code>
   */
  AUDIENCE_FILTER_SCOPE_WITHIN_SAME_EVENT(1),
  /**
   *
   *
   * <pre>
   * User joins the Audience if the filter condition is met within one
   * session.
   * </pre>
   *
   * <code>AUDIENCE_FILTER_SCOPE_WITHIN_SAME_SESSION = 2;</code>
   */
  AUDIENCE_FILTER_SCOPE_WITHIN_SAME_SESSION(2),
  /**
   *
   *
   * <pre>
   * User joins the Audience if the filter condition is met by any event
   * across any session.
   * </pre>
   *
   * <code>AUDIENCE_FILTER_SCOPE_ACROSS_ALL_SESSIONS = 3;</code>
   */
  AUDIENCE_FILTER_SCOPE_ACROSS_ALL_SESSIONS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Scope is not specified.
   * </pre>
   *
   * <code>AUDIENCE_FILTER_SCOPE_UNSPECIFIED = 0;</code>
   */
  public static final int AUDIENCE_FILTER_SCOPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * User joins the Audience if the filter condition is met within one
   * event.
   * </pre>
   *
   * <code>AUDIENCE_FILTER_SCOPE_WITHIN_SAME_EVENT = 1;</code>
   */
  public static final int AUDIENCE_FILTER_SCOPE_WITHIN_SAME_EVENT_VALUE = 1;
  /**
   *
   *
   * <pre>
   * User joins the Audience if the filter condition is met within one
   * session.
   * </pre>
   *
   * <code>AUDIENCE_FILTER_SCOPE_WITHIN_SAME_SESSION = 2;</code>
   */
  public static final int AUDIENCE_FILTER_SCOPE_WITHIN_SAME_SESSION_VALUE = 2;
  /**
   *
   *
   * <pre>
   * User joins the Audience if the filter condition is met by any event
   * across any session.
   * </pre>
   *
   * <code>AUDIENCE_FILTER_SCOPE_ACROSS_ALL_SESSIONS = 3;</code>
   */
  public static final int AUDIENCE_FILTER_SCOPE_ACROSS_ALL_SESSIONS_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AudienceFilterScope valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AudienceFilterScope forNumber(int value) {
    switch (value) {
      case 0:
        return AUDIENCE_FILTER_SCOPE_UNSPECIFIED;
      case 1:
        return AUDIENCE_FILTER_SCOPE_WITHIN_SAME_EVENT;
      case 2:
        return AUDIENCE_FILTER_SCOPE_WITHIN_SAME_SESSION;
      case 3:
        return AUDIENCE_FILTER_SCOPE_ACROSS_ALL_SESSIONS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AudienceFilterScope>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AudienceFilterScope>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AudienceFilterScope>() {
            public AudienceFilterScope findValueByNumber(int number) {
              return AudienceFilterScope.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AudienceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AudienceFilterScope[] VALUES = values();

  public static AudienceFilterScope valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AudienceFilterScope(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1alpha.AudienceFilterScope)
}