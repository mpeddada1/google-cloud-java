// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service_service.proto

package com.google.monitoring.v3;

public interface GetServiceLevelObjectiveRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetServiceLevelObjectiveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the `ServiceLevelObjective` to get. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Resource name of the `ServiceLevelObjective` to get. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * View of the `ServiceLevelObjective` to return. If `DEFAULT`, return the
   * `ServiceLevelObjective` as originally defined. If `EXPLICIT` and the
   * `ServiceLevelObjective` is defined in terms of a `BasicSli`, replace the
   * `BasicSli` with a `RequestBasedSli` spelling out how the SLI is computed.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective.View view = 2;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * View of the `ServiceLevelObjective` to return. If `DEFAULT`, return the
   * `ServiceLevelObjective` as originally defined. If `EXPLICIT` and the
   * `ServiceLevelObjective` is defined in terms of a `BasicSli`, replace the
   * `BasicSli` with a `RequestBasedSli` spelling out how the SLI is computed.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelObjective.View view = 2;</code>
   * @return The view.
   */
  com.google.monitoring.v3.ServiceLevelObjective.View getView();
}