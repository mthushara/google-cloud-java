// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public interface UpdateInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.UpdateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The instance to update, which must always include the instance
   * name.  Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.Instance instance = 1;</code>
   */
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * Required. The instance to update, which must always include the instance
   * name.  Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.Instance instance = 1;</code>
   */
  com.google.spanner.admin.instance.v1.Instance getInstance();
  /**
   *
   *
   * <pre>
   * Required. The instance to update, which must always include the instance
   * name.  Otherwise, only fields mentioned in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask] need be included.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.Instance instance = 1;</code>
   */
  com.google.spanner.admin.instance.v1.InstanceOrBuilder getInstanceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated.
   * The field mask must always be specified; this prevents any future fields in
   * [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know
   * about them.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated.
   * The field mask must always be specified; this prevents any future fields in
   * [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know
   * about them.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * Required. A mask specifying which fields in [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance] should be updated.
   * The field mask must always be specified; this prevents any future fields in
   * [][google.spanner.admin.instance.v1.Instance] from being erased accidentally by clients that do not know
   * about them.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
