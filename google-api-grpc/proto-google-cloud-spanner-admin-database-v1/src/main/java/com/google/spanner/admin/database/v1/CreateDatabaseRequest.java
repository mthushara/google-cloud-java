// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

/**
 *
 *
 * <pre>
 * The request for [CreateDatabase][google.spanner.admin.database.v1.DatabaseAdmin.CreateDatabase].
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.CreateDatabaseRequest}
 */
public final class CreateDatabaseRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.CreateDatabaseRequest)
    CreateDatabaseRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateDatabaseRequest.newBuilder() to construct.
  private CreateDatabaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDatabaseRequest() {
    parent_ = "";
    createStatement_ = "";
    extraStatements_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateDatabaseRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              createStatement_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                extraStatements_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              extraStatements_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        extraStatements_ = extraStatements_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.CreateDatabaseRequest.class,
            com.google.spanner.admin.database.v1.CreateDatabaseRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the instance that will serve the new database.
   * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the instance that will serve the new database.
   * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_STATEMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object createStatement_;
  /**
   *
   *
   * <pre>
   * Required. A `CREATE DATABASE` statement, which specifies the ID of the
   * new database.  The database ID must conform to the regular expression
   * `[a-z][a-z0-9_&#92;-]*[a-z0-9]` and be between 2 and 30 characters in length.
   * If the database ID is a reserved word or if it contains a hyphen, the
   * database ID must be enclosed in backticks (`` ` ``).
   * </pre>
   *
   * <code>string create_statement = 2;</code>
   */
  public java.lang.String getCreateStatement() {
    java.lang.Object ref = createStatement_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createStatement_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. A `CREATE DATABASE` statement, which specifies the ID of the
   * new database.  The database ID must conform to the regular expression
   * `[a-z][a-z0-9_&#92;-]*[a-z0-9]` and be between 2 and 30 characters in length.
   * If the database ID is a reserved word or if it contains a hyphen, the
   * database ID must be enclosed in backticks (`` ` ``).
   * </pre>
   *
   * <code>string create_statement = 2;</code>
   */
  public com.google.protobuf.ByteString getCreateStatementBytes() {
    java.lang.Object ref = createStatement_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      createStatement_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTRA_STATEMENTS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList extraStatements_;
  /**
   *
   *
   * <pre>
   * An optional list of DDL statements to run inside the newly created
   * database. Statements can create tables, indexes, etc. These
   * statements execute atomically with the creation of the database:
   * if there is an error in any statement, the database is not created.
   * </pre>
   *
   * <code>repeated string extra_statements = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList getExtraStatementsList() {
    return extraStatements_;
  }
  /**
   *
   *
   * <pre>
   * An optional list of DDL statements to run inside the newly created
   * database. Statements can create tables, indexes, etc. These
   * statements execute atomically with the creation of the database:
   * if there is an error in any statement, the database is not created.
   * </pre>
   *
   * <code>repeated string extra_statements = 3;</code>
   */
  public int getExtraStatementsCount() {
    return extraStatements_.size();
  }
  /**
   *
   *
   * <pre>
   * An optional list of DDL statements to run inside the newly created
   * database. Statements can create tables, indexes, etc. These
   * statements execute atomically with the creation of the database:
   * if there is an error in any statement, the database is not created.
   * </pre>
   *
   * <code>repeated string extra_statements = 3;</code>
   */
  public java.lang.String getExtraStatements(int index) {
    return extraStatements_.get(index);
  }
  /**
   *
   *
   * <pre>
   * An optional list of DDL statements to run inside the newly created
   * database. Statements can create tables, indexes, etc. These
   * statements execute atomically with the creation of the database:
   * if there is an error in any statement, the database is not created.
   * </pre>
   *
   * <code>repeated string extra_statements = 3;</code>
   */
  public com.google.protobuf.ByteString getExtraStatementsBytes(int index) {
    return extraStatements_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getCreateStatementBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, createStatement_);
    }
    for (int i = 0; i < extraStatements_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, extraStatements_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getCreateStatementBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, createStatement_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < extraStatements_.size(); i++) {
        dataSize += computeStringSizeNoTag(extraStatements_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getExtraStatementsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.admin.database.v1.CreateDatabaseRequest)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.CreateDatabaseRequest other =
        (com.google.spanner.admin.database.v1.CreateDatabaseRequest) obj;

    boolean result = true;
    result = result && getParent().equals(other.getParent());
    result = result && getCreateStatement().equals(other.getCreateStatement());
    result = result && getExtraStatementsList().equals(other.getExtraStatementsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CREATE_STATEMENT_FIELD_NUMBER;
    hash = (53 * hash) + getCreateStatement().hashCode();
    if (getExtraStatementsCount() > 0) {
      hash = (37 * hash) + EXTRA_STATEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getExtraStatementsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.spanner.admin.database.v1.CreateDatabaseRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request for [CreateDatabase][google.spanner.admin.database.v1.DatabaseAdmin.CreateDatabase].
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.CreateDatabaseRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.CreateDatabaseRequest)
      com.google.spanner.admin.database.v1.CreateDatabaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.CreateDatabaseRequest.class,
              com.google.spanner.admin.database.v1.CreateDatabaseRequest.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.CreateDatabaseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      createStatement_ = "";

      extraStatements_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_CreateDatabaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.CreateDatabaseRequest getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.CreateDatabaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.CreateDatabaseRequest build() {
      com.google.spanner.admin.database.v1.CreateDatabaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.CreateDatabaseRequest buildPartial() {
      com.google.spanner.admin.database.v1.CreateDatabaseRequest result =
          new com.google.spanner.admin.database.v1.CreateDatabaseRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.parent_ = parent_;
      result.createStatement_ = createStatement_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        extraStatements_ = extraStatements_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.extraStatements_ = extraStatements_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.admin.database.v1.CreateDatabaseRequest) {
        return mergeFrom((com.google.spanner.admin.database.v1.CreateDatabaseRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.CreateDatabaseRequest other) {
      if (other == com.google.spanner.admin.database.v1.CreateDatabaseRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getCreateStatement().isEmpty()) {
        createStatement_ = other.createStatement_;
        onChanged();
      }
      if (!other.extraStatements_.isEmpty()) {
        if (extraStatements_.isEmpty()) {
          extraStatements_ = other.extraStatements_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureExtraStatementsIsMutable();
          extraStatements_.addAll(other.extraStatements_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.spanner.admin.database.v1.CreateDatabaseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.spanner.admin.database.v1.CreateDatabaseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the instance that will serve the new database.
     * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the instance that will serve the new database.
     * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the instance that will serve the new database.
     * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the instance that will serve the new database.
     * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the instance that will serve the new database.
     * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object createStatement_ = "";
    /**
     *
     *
     * <pre>
     * Required. A `CREATE DATABASE` statement, which specifies the ID of the
     * new database.  The database ID must conform to the regular expression
     * `[a-z][a-z0-9_&#92;-]*[a-z0-9]` and be between 2 and 30 characters in length.
     * If the database ID is a reserved word or if it contains a hyphen, the
     * database ID must be enclosed in backticks (`` ` ``).
     * </pre>
     *
     * <code>string create_statement = 2;</code>
     */
    public java.lang.String getCreateStatement() {
      java.lang.Object ref = createStatement_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createStatement_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A `CREATE DATABASE` statement, which specifies the ID of the
     * new database.  The database ID must conform to the regular expression
     * `[a-z][a-z0-9_&#92;-]*[a-z0-9]` and be between 2 and 30 characters in length.
     * If the database ID is a reserved word or if it contains a hyphen, the
     * database ID must be enclosed in backticks (`` ` ``).
     * </pre>
     *
     * <code>string create_statement = 2;</code>
     */
    public com.google.protobuf.ByteString getCreateStatementBytes() {
      java.lang.Object ref = createStatement_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        createStatement_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A `CREATE DATABASE` statement, which specifies the ID of the
     * new database.  The database ID must conform to the regular expression
     * `[a-z][a-z0-9_&#92;-]*[a-z0-9]` and be between 2 and 30 characters in length.
     * If the database ID is a reserved word or if it contains a hyphen, the
     * database ID must be enclosed in backticks (`` ` ``).
     * </pre>
     *
     * <code>string create_statement = 2;</code>
     */
    public Builder setCreateStatement(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      createStatement_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A `CREATE DATABASE` statement, which specifies the ID of the
     * new database.  The database ID must conform to the regular expression
     * `[a-z][a-z0-9_&#92;-]*[a-z0-9]` and be between 2 and 30 characters in length.
     * If the database ID is a reserved word or if it contains a hyphen, the
     * database ID must be enclosed in backticks (`` ` ``).
     * </pre>
     *
     * <code>string create_statement = 2;</code>
     */
    public Builder clearCreateStatement() {

      createStatement_ = getDefaultInstance().getCreateStatement();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A `CREATE DATABASE` statement, which specifies the ID of the
     * new database.  The database ID must conform to the regular expression
     * `[a-z][a-z0-9_&#92;-]*[a-z0-9]` and be between 2 and 30 characters in length.
     * If the database ID is a reserved word or if it contains a hyphen, the
     * database ID must be enclosed in backticks (`` ` ``).
     * </pre>
     *
     * <code>string create_statement = 2;</code>
     */
    public Builder setCreateStatementBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      createStatement_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList extraStatements_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureExtraStatementsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        extraStatements_ = new com.google.protobuf.LazyStringArrayList(extraStatements_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getExtraStatementsList() {
      return extraStatements_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public int getExtraStatementsCount() {
      return extraStatements_.size();
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public java.lang.String getExtraStatements(int index) {
      return extraStatements_.get(index);
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public com.google.protobuf.ByteString getExtraStatementsBytes(int index) {
      return extraStatements_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public Builder setExtraStatements(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureExtraStatementsIsMutable();
      extraStatements_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public Builder addExtraStatements(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureExtraStatementsIsMutable();
      extraStatements_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public Builder addAllExtraStatements(java.lang.Iterable<java.lang.String> values) {
      ensureExtraStatementsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, extraStatements_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public Builder clearExtraStatements() {
      extraStatements_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These
     * statements execute atomically with the creation of the database:
     * if there is an error in any statement, the database is not created.
     * </pre>
     *
     * <code>repeated string extra_statements = 3;</code>
     */
    public Builder addExtraStatementsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureExtraStatementsIsMutable();
      extraStatements_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.CreateDatabaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.CreateDatabaseRequest)
  private static final com.google.spanner.admin.database.v1.CreateDatabaseRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.CreateDatabaseRequest();
  }

  public static com.google.spanner.admin.database.v1.CreateDatabaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDatabaseRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDatabaseRequest>() {
        @java.lang.Override
        public CreateDatabaseRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateDatabaseRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateDatabaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDatabaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.CreateDatabaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
