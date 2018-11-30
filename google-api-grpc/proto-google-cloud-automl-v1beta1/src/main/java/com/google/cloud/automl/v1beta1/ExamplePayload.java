// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Example data used for training or prediction.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.ExamplePayload}
 */
public final class ExamplePayload extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.ExamplePayload)
    ExamplePayloadOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExamplePayload.newBuilder() to construct.
  private ExamplePayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExamplePayload() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExamplePayload(
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
              com.google.cloud.automl.v1beta1.Image.Builder subBuilder = null;
              if (payloadCase_ == 1) {
                subBuilder = ((com.google.cloud.automl.v1beta1.Image) payload_).toBuilder();
              }
              payload_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.Image.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.automl.v1beta1.Image) payload_);
                payload_ = subBuilder.buildPartial();
              }
              payloadCase_ = 1;
              break;
            }
          case 18:
            {
              com.google.cloud.automl.v1beta1.TextSnippet.Builder subBuilder = null;
              if (payloadCase_ == 2) {
                subBuilder = ((com.google.cloud.automl.v1beta1.TextSnippet) payload_).toBuilder();
              }
              payload_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.TextSnippet.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.automl.v1beta1.TextSnippet) payload_);
                payload_ = subBuilder.buildPartial();
              }
              payloadCase_ = 2;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.DataItems
        .internal_static_google_cloud_automl_v1beta1_ExamplePayload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.DataItems
        .internal_static_google_cloud_automl_v1beta1_ExamplePayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.ExamplePayload.class,
            com.google.cloud.automl.v1beta1.ExamplePayload.Builder.class);
  }

  private int payloadCase_ = 0;
  private java.lang.Object payload_;

  public enum PayloadCase implements com.google.protobuf.Internal.EnumLite {
    IMAGE(1),
    TEXT_SNIPPET(2),
    PAYLOAD_NOT_SET(0);
    private final int value;

    private PayloadCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static PayloadCase valueOf(int value) {
      return forNumber(value);
    }

    public static PayloadCase forNumber(int value) {
      switch (value) {
        case 1:
          return IMAGE;
        case 2:
          return TEXT_SNIPPET;
        case 0:
          return PAYLOAD_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public PayloadCase getPayloadCase() {
    return PayloadCase.forNumber(payloadCase_);
  }

  public static final int IMAGE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * An example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   */
  public boolean hasImage() {
    return payloadCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * An example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.Image getImage() {
    if (payloadCase_ == 1) {
      return (com.google.cloud.automl.v1beta1.Image) payload_;
    }
    return com.google.cloud.automl.v1beta1.Image.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * An example image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
   */
  public com.google.cloud.automl.v1beta1.ImageOrBuilder getImageOrBuilder() {
    if (payloadCase_ == 1) {
      return (com.google.cloud.automl.v1beta1.Image) payload_;
    }
    return com.google.cloud.automl.v1beta1.Image.getDefaultInstance();
  }

  public static final int TEXT_SNIPPET_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   */
  public boolean hasTextSnippet() {
    return payloadCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   */
  public com.google.cloud.automl.v1beta1.TextSnippet getTextSnippet() {
    if (payloadCase_ == 2) {
      return (com.google.cloud.automl.v1beta1.TextSnippet) payload_;
    }
    return com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Example text.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
   */
  public com.google.cloud.automl.v1beta1.TextSnippetOrBuilder getTextSnippetOrBuilder() {
    if (payloadCase_ == 2) {
      return (com.google.cloud.automl.v1beta1.TextSnippet) payload_;
    }
    return com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance();
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
    if (payloadCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.automl.v1beta1.Image) payload_);
    }
    if (payloadCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.automl.v1beta1.TextSnippet) payload_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (payloadCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.automl.v1beta1.Image) payload_);
    }
    if (payloadCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.automl.v1beta1.TextSnippet) payload_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.ExamplePayload)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.ExamplePayload other =
        (com.google.cloud.automl.v1beta1.ExamplePayload) obj;

    boolean result = true;
    result = result && getPayloadCase().equals(other.getPayloadCase());
    if (!result) return false;
    switch (payloadCase_) {
      case 1:
        result = result && getImage().equals(other.getImage());
        break;
      case 2:
        result = result && getTextSnippet().equals(other.getTextSnippet());
        break;
      case 0:
      default:
    }
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
    switch (payloadCase_) {
      case 1:
        hash = (37 * hash) + IMAGE_FIELD_NUMBER;
        hash = (53 * hash) + getImage().hashCode();
        break;
      case 2:
        hash = (37 * hash) + TEXT_SNIPPET_FIELD_NUMBER;
        hash = (53 * hash) + getTextSnippet().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1beta1.ExamplePayload prototype) {
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
   * Example data used for training or prediction.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.ExamplePayload}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.ExamplePayload)
      com.google.cloud.automl.v1beta1.ExamplePayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_ExamplePayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_ExamplePayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.ExamplePayload.class,
              com.google.cloud.automl.v1beta1.ExamplePayload.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.ExamplePayload.newBuilder()
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
      payloadCase_ = 0;
      payload_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_ExamplePayload_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ExamplePayload getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.ExamplePayload.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ExamplePayload build() {
      com.google.cloud.automl.v1beta1.ExamplePayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ExamplePayload buildPartial() {
      com.google.cloud.automl.v1beta1.ExamplePayload result =
          new com.google.cloud.automl.v1beta1.ExamplePayload(this);
      if (payloadCase_ == 1) {
        if (imageBuilder_ == null) {
          result.payload_ = payload_;
        } else {
          result.payload_ = imageBuilder_.build();
        }
      }
      if (payloadCase_ == 2) {
        if (textSnippetBuilder_ == null) {
          result.payload_ = payload_;
        } else {
          result.payload_ = textSnippetBuilder_.build();
        }
      }
      result.payloadCase_ = payloadCase_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.ExamplePayload) {
        return mergeFrom((com.google.cloud.automl.v1beta1.ExamplePayload) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.ExamplePayload other) {
      if (other == com.google.cloud.automl.v1beta1.ExamplePayload.getDefaultInstance()) return this;
      switch (other.getPayloadCase()) {
        case IMAGE:
          {
            mergeImage(other.getImage());
            break;
          }
        case TEXT_SNIPPET:
          {
            mergeTextSnippet(other.getTextSnippet());
            break;
          }
        case PAYLOAD_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.automl.v1beta1.ExamplePayload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1beta1.ExamplePayload) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int payloadCase_ = 0;
    private java.lang.Object payload_;

    public PayloadCase getPayloadCase() {
      return PayloadCase.forNumber(payloadCase_);
    }

    public Builder clearPayload() {
      payloadCase_ = 0;
      payload_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.Image,
            com.google.cloud.automl.v1beta1.Image.Builder,
            com.google.cloud.automl.v1beta1.ImageOrBuilder>
        imageBuilder_;
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    public boolean hasImage() {
      return payloadCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.Image getImage() {
      if (imageBuilder_ == null) {
        if (payloadCase_ == 1) {
          return (com.google.cloud.automl.v1beta1.Image) payload_;
        }
        return com.google.cloud.automl.v1beta1.Image.getDefaultInstance();
      } else {
        if (payloadCase_ == 1) {
          return imageBuilder_.getMessage();
        }
        return com.google.cloud.automl.v1beta1.Image.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    public Builder setImage(com.google.cloud.automl.v1beta1.Image value) {
      if (imageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        imageBuilder_.setMessage(value);
      }
      payloadCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    public Builder setImage(com.google.cloud.automl.v1beta1.Image.Builder builderForValue) {
      if (imageBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        imageBuilder_.setMessage(builderForValue.build());
      }
      payloadCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    public Builder mergeImage(com.google.cloud.automl.v1beta1.Image value) {
      if (imageBuilder_ == null) {
        if (payloadCase_ == 1
            && payload_ != com.google.cloud.automl.v1beta1.Image.getDefaultInstance()) {
          payload_ =
              com.google.cloud.automl.v1beta1.Image.newBuilder(
                      (com.google.cloud.automl.v1beta1.Image) payload_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        if (payloadCase_ == 1) {
          imageBuilder_.mergeFrom(value);
        }
        imageBuilder_.setMessage(value);
      }
      payloadCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    public Builder clearImage() {
      if (imageBuilder_ == null) {
        if (payloadCase_ == 1) {
          payloadCase_ = 0;
          payload_ = null;
          onChanged();
        }
      } else {
        if (payloadCase_ == 1) {
          payloadCase_ = 0;
          payload_ = null;
        }
        imageBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.Image.Builder getImageBuilder() {
      return getImageFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.ImageOrBuilder getImageOrBuilder() {
      if ((payloadCase_ == 1) && (imageBuilder_ != null)) {
        return imageBuilder_.getMessageOrBuilder();
      } else {
        if (payloadCase_ == 1) {
          return (com.google.cloud.automl.v1beta1.Image) payload_;
        }
        return com.google.cloud.automl.v1beta1.Image.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * An example image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.Image image = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.Image,
            com.google.cloud.automl.v1beta1.Image.Builder,
            com.google.cloud.automl.v1beta1.ImageOrBuilder>
        getImageFieldBuilder() {
      if (imageBuilder_ == null) {
        if (!(payloadCase_ == 1)) {
          payload_ = com.google.cloud.automl.v1beta1.Image.getDefaultInstance();
        }
        imageBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.Image,
                com.google.cloud.automl.v1beta1.Image.Builder,
                com.google.cloud.automl.v1beta1.ImageOrBuilder>(
                (com.google.cloud.automl.v1beta1.Image) payload_,
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      payloadCase_ = 1;
      onChanged();
      ;
      return imageBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.TextSnippet,
            com.google.cloud.automl.v1beta1.TextSnippet.Builder,
            com.google.cloud.automl.v1beta1.TextSnippetOrBuilder>
        textSnippetBuilder_;
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    public boolean hasTextSnippet() {
      return payloadCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    public com.google.cloud.automl.v1beta1.TextSnippet getTextSnippet() {
      if (textSnippetBuilder_ == null) {
        if (payloadCase_ == 2) {
          return (com.google.cloud.automl.v1beta1.TextSnippet) payload_;
        }
        return com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance();
      } else {
        if (payloadCase_ == 2) {
          return textSnippetBuilder_.getMessage();
        }
        return com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    public Builder setTextSnippet(com.google.cloud.automl.v1beta1.TextSnippet value) {
      if (textSnippetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        textSnippetBuilder_.setMessage(value);
      }
      payloadCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    public Builder setTextSnippet(
        com.google.cloud.automl.v1beta1.TextSnippet.Builder builderForValue) {
      if (textSnippetBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        textSnippetBuilder_.setMessage(builderForValue.build());
      }
      payloadCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    public Builder mergeTextSnippet(com.google.cloud.automl.v1beta1.TextSnippet value) {
      if (textSnippetBuilder_ == null) {
        if (payloadCase_ == 2
            && payload_ != com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance()) {
          payload_ =
              com.google.cloud.automl.v1beta1.TextSnippet.newBuilder(
                      (com.google.cloud.automl.v1beta1.TextSnippet) payload_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        if (payloadCase_ == 2) {
          textSnippetBuilder_.mergeFrom(value);
        }
        textSnippetBuilder_.setMessage(value);
      }
      payloadCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    public Builder clearTextSnippet() {
      if (textSnippetBuilder_ == null) {
        if (payloadCase_ == 2) {
          payloadCase_ = 0;
          payload_ = null;
          onChanged();
        }
      } else {
        if (payloadCase_ == 2) {
          payloadCase_ = 0;
          payload_ = null;
        }
        textSnippetBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    public com.google.cloud.automl.v1beta1.TextSnippet.Builder getTextSnippetBuilder() {
      return getTextSnippetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    public com.google.cloud.automl.v1beta1.TextSnippetOrBuilder getTextSnippetOrBuilder() {
      if ((payloadCase_ == 2) && (textSnippetBuilder_ != null)) {
        return textSnippetBuilder_.getMessageOrBuilder();
      } else {
        if (payloadCase_ == 2) {
          return (com.google.cloud.automl.v1beta1.TextSnippet) payload_;
        }
        return com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Example text.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet text_snippet = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.TextSnippet,
            com.google.cloud.automl.v1beta1.TextSnippet.Builder,
            com.google.cloud.automl.v1beta1.TextSnippetOrBuilder>
        getTextSnippetFieldBuilder() {
      if (textSnippetBuilder_ == null) {
        if (!(payloadCase_ == 2)) {
          payload_ = com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance();
        }
        textSnippetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.TextSnippet,
                com.google.cloud.automl.v1beta1.TextSnippet.Builder,
                com.google.cloud.automl.v1beta1.TextSnippetOrBuilder>(
                (com.google.cloud.automl.v1beta1.TextSnippet) payload_,
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      payloadCase_ = 2;
      onChanged();
      ;
      return textSnippetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.ExamplePayload)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ExamplePayload)
  private static final com.google.cloud.automl.v1beta1.ExamplePayload DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.ExamplePayload();
  }

  public static com.google.cloud.automl.v1beta1.ExamplePayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExamplePayload> PARSER =
      new com.google.protobuf.AbstractParser<ExamplePayload>() {
        @java.lang.Override
        public ExamplePayload parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExamplePayload(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExamplePayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExamplePayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.ExamplePayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
