// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public interface GetMonitoredResourceDescriptorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetMonitoredResourceDescriptorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The monitored resource descriptor to get.  The format is
   * `"projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}"`.
   * The `{resource_type}` is a predefined type, such as
   * `cloudsql_database`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The monitored resource descriptor to get.  The format is
   * `"projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}"`.
   * The `{resource_type}` is a predefined type, such as
   * `cloudsql_database`.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
