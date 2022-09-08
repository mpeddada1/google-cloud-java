// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2beta/user_event.proto

package com.google.cloud.retail.v2beta;

/**
 * <pre>
 * A transaction represents the entire purchase transaction.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.PurchaseTransaction}
 */
public final class PurchaseTransaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.PurchaseTransaction)
    PurchaseTransactionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PurchaseTransaction.newBuilder() to construct.
  private PurchaseTransaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PurchaseTransaction() {
    id_ = "";
    currencyCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PurchaseTransaction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PurchaseTransaction(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 21: {

            revenue_ = input.readFloat();
            break;
          }
          case 29: {

            tax_ = input.readFloat();
            break;
          }
          case 37: {

            cost_ = input.readFloat();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            currencyCode_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_PurchaseTransaction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_PurchaseTransaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.PurchaseTransaction.class, com.google.cloud.retail.v2beta.PurchaseTransaction.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * The transaction ID with a length limit of 128 characters.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The transaction ID with a length limit of 128 characters.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVENUE_FIELD_NUMBER = 2;
  private float revenue_;
  /**
   * <pre>
   * Required. Total non-zero revenue or grand total associated with the
   * transaction. This value include shipping, tax, or other adjustments to
   * total revenue that you want to include as part of your revenue
   * calculations.
   * </pre>
   *
   * <code>float revenue = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The revenue.
   */
  @java.lang.Override
  public float getRevenue() {
    return revenue_;
  }

  public static final int TAX_FIELD_NUMBER = 3;
  private float tax_;
  /**
   * <pre>
   * All the taxes associated with the transaction.
   * </pre>
   *
   * <code>float tax = 3;</code>
   * @return The tax.
   */
  @java.lang.Override
  public float getTax() {
    return tax_;
  }

  public static final int COST_FIELD_NUMBER = 4;
  private float cost_;
  /**
   * <pre>
   * All the costs associated with the products. These can be manufacturing
   * costs, shipping expenses not borne by the end user, or any other costs,
   * such that:
   * * Profit =
   * [revenue][google.cloud.retail.v2beta.PurchaseTransaction.revenue] -
   * [tax][google.cloud.retail.v2beta.PurchaseTransaction.tax] -
   * [cost][google.cloud.retail.v2beta.PurchaseTransaction.cost]
   * </pre>
   *
   * <code>float cost = 4;</code>
   * @return The cost.
   */
  @java.lang.Override
  public float getCost() {
    return cost_;
  }

  public static final int CURRENCY_CODE_FIELD_NUMBER = 5;
  private volatile java.lang.Object currencyCode_;
  /**
   * <pre>
   * Required. Currency code. Use three-character ISO-4217 code.
   * </pre>
   *
   * <code>string currency_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The currencyCode.
   */
  @java.lang.Override
  public java.lang.String getCurrencyCode() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currencyCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Currency code. Use three-character ISO-4217 code.
   * </pre>
   *
   * <code>string currency_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for currencyCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCurrencyCodeBytes() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currencyCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (java.lang.Float.floatToRawIntBits(revenue_) != 0) {
      output.writeFloat(2, revenue_);
    }
    if (java.lang.Float.floatToRawIntBits(tax_) != 0) {
      output.writeFloat(3, tax_);
    }
    if (java.lang.Float.floatToRawIntBits(cost_) != 0) {
      output.writeFloat(4, cost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currencyCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, currencyCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (java.lang.Float.floatToRawIntBits(revenue_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, revenue_);
    }
    if (java.lang.Float.floatToRawIntBits(tax_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, tax_);
    }
    if (java.lang.Float.floatToRawIntBits(cost_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, cost_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currencyCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, currencyCode_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.PurchaseTransaction)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.PurchaseTransaction other = (com.google.cloud.retail.v2beta.PurchaseTransaction) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (java.lang.Float.floatToIntBits(getRevenue())
        != java.lang.Float.floatToIntBits(
            other.getRevenue())) return false;
    if (java.lang.Float.floatToIntBits(getTax())
        != java.lang.Float.floatToIntBits(
            other.getTax())) return false;
    if (java.lang.Float.floatToIntBits(getCost())
        != java.lang.Float.floatToIntBits(
            other.getCost())) return false;
    if (!getCurrencyCode()
        .equals(other.getCurrencyCode())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + REVENUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRevenue());
    hash = (37 * hash) + TAX_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTax());
    hash = (37 * hash) + COST_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCost());
    hash = (37 * hash) + CURRENCY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.retail.v2beta.PurchaseTransaction parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.retail.v2beta.PurchaseTransaction prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A transaction represents the entire purchase transaction.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.PurchaseTransaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.PurchaseTransaction)
      com.google.cloud.retail.v2beta.PurchaseTransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_PurchaseTransaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_PurchaseTransaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.PurchaseTransaction.class, com.google.cloud.retail.v2beta.PurchaseTransaction.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.PurchaseTransaction.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      revenue_ = 0F;

      tax_ = 0F;

      cost_ = 0F;

      currencyCode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.retail.v2beta.UserEventProto.internal_static_google_cloud_retail_v2beta_PurchaseTransaction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.PurchaseTransaction getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.PurchaseTransaction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.PurchaseTransaction build() {
      com.google.cloud.retail.v2beta.PurchaseTransaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.PurchaseTransaction buildPartial() {
      com.google.cloud.retail.v2beta.PurchaseTransaction result = new com.google.cloud.retail.v2beta.PurchaseTransaction(this);
      result.id_ = id_;
      result.revenue_ = revenue_;
      result.tax_ = tax_;
      result.cost_ = cost_;
      result.currencyCode_ = currencyCode_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.retail.v2beta.PurchaseTransaction) {
        return mergeFrom((com.google.cloud.retail.v2beta.PurchaseTransaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.PurchaseTransaction other) {
      if (other == com.google.cloud.retail.v2beta.PurchaseTransaction.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getRevenue() != 0F) {
        setRevenue(other.getRevenue());
      }
      if (other.getTax() != 0F) {
        setTax(other.getTax());
      }
      if (other.getCost() != 0F) {
        setCost(other.getCost());
      }
      if (!other.getCurrencyCode().isEmpty()) {
        currencyCode_ = other.currencyCode_;
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
      com.google.cloud.retail.v2beta.PurchaseTransaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.retail.v2beta.PurchaseTransaction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * The transaction ID with a length limit of 128 characters.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The transaction ID with a length limit of 128 characters.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The transaction ID with a length limit of 128 characters.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The transaction ID with a length limit of 128 characters.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The transaction ID with a length limit of 128 characters.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private float revenue_ ;
    /**
     * <pre>
     * Required. Total non-zero revenue or grand total associated with the
     * transaction. This value include shipping, tax, or other adjustments to
     * total revenue that you want to include as part of your revenue
     * calculations.
     * </pre>
     *
     * <code>float revenue = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The revenue.
     */
    @java.lang.Override
    public float getRevenue() {
      return revenue_;
    }
    /**
     * <pre>
     * Required. Total non-zero revenue or grand total associated with the
     * transaction. This value include shipping, tax, or other adjustments to
     * total revenue that you want to include as part of your revenue
     * calculations.
     * </pre>
     *
     * <code>float revenue = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The revenue to set.
     * @return This builder for chaining.
     */
    public Builder setRevenue(float value) {
      
      revenue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Total non-zero revenue or grand total associated with the
     * transaction. This value include shipping, tax, or other adjustments to
     * total revenue that you want to include as part of your revenue
     * calculations.
     * </pre>
     *
     * <code>float revenue = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearRevenue() {
      
      revenue_ = 0F;
      onChanged();
      return this;
    }

    private float tax_ ;
    /**
     * <pre>
     * All the taxes associated with the transaction.
     * </pre>
     *
     * <code>float tax = 3;</code>
     * @return The tax.
     */
    @java.lang.Override
    public float getTax() {
      return tax_;
    }
    /**
     * <pre>
     * All the taxes associated with the transaction.
     * </pre>
     *
     * <code>float tax = 3;</code>
     * @param value The tax to set.
     * @return This builder for chaining.
     */
    public Builder setTax(float value) {
      
      tax_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * All the taxes associated with the transaction.
     * </pre>
     *
     * <code>float tax = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTax() {
      
      tax_ = 0F;
      onChanged();
      return this;
    }

    private float cost_ ;
    /**
     * <pre>
     * All the costs associated with the products. These can be manufacturing
     * costs, shipping expenses not borne by the end user, or any other costs,
     * such that:
     * * Profit =
     * [revenue][google.cloud.retail.v2beta.PurchaseTransaction.revenue] -
     * [tax][google.cloud.retail.v2beta.PurchaseTransaction.tax] -
     * [cost][google.cloud.retail.v2beta.PurchaseTransaction.cost]
     * </pre>
     *
     * <code>float cost = 4;</code>
     * @return The cost.
     */
    @java.lang.Override
    public float getCost() {
      return cost_;
    }
    /**
     * <pre>
     * All the costs associated with the products. These can be manufacturing
     * costs, shipping expenses not borne by the end user, or any other costs,
     * such that:
     * * Profit =
     * [revenue][google.cloud.retail.v2beta.PurchaseTransaction.revenue] -
     * [tax][google.cloud.retail.v2beta.PurchaseTransaction.tax] -
     * [cost][google.cloud.retail.v2beta.PurchaseTransaction.cost]
     * </pre>
     *
     * <code>float cost = 4;</code>
     * @param value The cost to set.
     * @return This builder for chaining.
     */
    public Builder setCost(float value) {
      
      cost_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * All the costs associated with the products. These can be manufacturing
     * costs, shipping expenses not borne by the end user, or any other costs,
     * such that:
     * * Profit =
     * [revenue][google.cloud.retail.v2beta.PurchaseTransaction.revenue] -
     * [tax][google.cloud.retail.v2beta.PurchaseTransaction.tax] -
     * [cost][google.cloud.retail.v2beta.PurchaseTransaction.cost]
     * </pre>
     *
     * <code>float cost = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCost() {
      
      cost_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object currencyCode_ = "";
    /**
     * <pre>
     * Required. Currency code. Use three-character ISO-4217 code.
     * </pre>
     *
     * <code>string currency_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The currencyCode.
     */
    public java.lang.String getCurrencyCode() {
      java.lang.Object ref = currencyCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Currency code. Use three-character ISO-4217 code.
     * </pre>
     *
     * <code>string currency_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for currencyCode.
     */
    public com.google.protobuf.ByteString
        getCurrencyCodeBytes() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currencyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Currency code. Use three-character ISO-4217 code.
     * </pre>
     *
     * <code>string currency_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currencyCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Currency code. Use three-character ISO-4217 code.
     * </pre>
     *
     * <code>string currency_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrencyCode() {
      
      currencyCode_ = getDefaultInstance().getCurrencyCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Currency code. Use three-character ISO-4217 code.
     * </pre>
     *
     * <code>string currency_code = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currencyCode_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.PurchaseTransaction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.PurchaseTransaction)
  private static final com.google.cloud.retail.v2beta.PurchaseTransaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.PurchaseTransaction();
  }

  public static com.google.cloud.retail.v2beta.PurchaseTransaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurchaseTransaction>
      PARSER = new com.google.protobuf.AbstractParser<PurchaseTransaction>() {
    @java.lang.Override
    public PurchaseTransaction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PurchaseTransaction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PurchaseTransaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurchaseTransaction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.PurchaseTransaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
