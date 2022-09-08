// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

public interface UpdateCapacityCommitmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.UpdateCapacityCommitmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Content of the capacity commitment to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 1;</code>
   * @return Whether the capacityCommitment field is set.
   */
  boolean hasCapacityCommitment();
  /**
   * <pre>
   * Content of the capacity commitment to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 1;</code>
   * @return The capacityCommitment.
   */
  com.google.cloud.bigquery.reservation.v1.CapacityCommitment getCapacityCommitment();
  /**
   * <pre>
   * Content of the capacity commitment to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 1;</code>
   */
  com.google.cloud.bigquery.reservation.v1.CapacityCommitmentOrBuilder getCapacityCommitmentOrBuilder();

  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}