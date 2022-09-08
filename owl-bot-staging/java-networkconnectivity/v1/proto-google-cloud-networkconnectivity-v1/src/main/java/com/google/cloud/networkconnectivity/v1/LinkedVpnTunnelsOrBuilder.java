// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

public interface LinkedVpnTunnelsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.LinkedVpnTunnels)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URIs of linked VPN tunnel resources.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the uris.
   */
  java.util.List<java.lang.String>
      getUrisList();
  /**
   * <pre>
   * The URIs of linked VPN tunnel resources.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of uris.
   */
  int getUrisCount();
  /**
   * <pre>
   * The URIs of linked VPN tunnel resources.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  java.lang.String getUris(int index);
  /**
   * <pre>
   * The URIs of linked VPN tunnel resources.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  com.google.protobuf.ByteString
      getUrisBytes(int index);

  /**
   * <pre>
   * A value that controls whether site-to-site data transfer is enabled for
   * these resources. Data transfer is available only in [supported
   * locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
   * </pre>
   *
   * <code>bool site_to_site_data_transfer = 2;</code>
   * @return The siteToSiteDataTransfer.
   */
  boolean getSiteToSiteDataTransfer();
}