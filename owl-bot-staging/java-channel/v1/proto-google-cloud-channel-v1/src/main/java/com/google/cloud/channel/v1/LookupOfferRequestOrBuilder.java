// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface LookupOfferRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.LookupOfferRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the entitlement to retrieve the Offer.
   * Entitlement uses the format:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}
   * </pre>
   *
   * <code>string entitlement = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The entitlement.
   */
  java.lang.String getEntitlement();
  /**
   * <pre>
   * Required. The resource name of the entitlement to retrieve the Offer.
   * Entitlement uses the format:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}
   * </pre>
   *
   * <code>string entitlement = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for entitlement.
   */
  com.google.protobuf.ByteString
      getEntitlementBytes();
}