// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/slsa_provenance_zero_two.proto

package io.grafeas.v1;

public interface SlsaProvenanceZeroTwoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.SlsaProvenanceZeroTwo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaBuilder builder = 1;</code>
   * @return Whether the builder field is set.
   */
  boolean hasBuilder();
  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaBuilder builder = 1;</code>
   * @return The builder.
   */
  io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaBuilder getBuilder();
  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaBuilder builder = 1;</code>
   */
  io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaBuilderOrBuilder getBuilderOrBuilder();

  /**
   * <code>string build_type = 2;</code>
   * @return The buildType.
   */
  java.lang.String getBuildType();
  /**
   * <code>string build_type = 2;</code>
   * @return The bytes for buildType.
   */
  com.google.protobuf.ByteString
      getBuildTypeBytes();

  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaInvocation invocation = 3;</code>
   * @return Whether the invocation field is set.
   */
  boolean hasInvocation();
  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaInvocation invocation = 3;</code>
   * @return The invocation.
   */
  io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaInvocation getInvocation();
  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaInvocation invocation = 3;</code>
   */
  io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaInvocationOrBuilder getInvocationOrBuilder();

  /**
   * <code>.google.protobuf.Struct build_config = 4;</code>
   * @return Whether the buildConfig field is set.
   */
  boolean hasBuildConfig();
  /**
   * <code>.google.protobuf.Struct build_config = 4;</code>
   * @return The buildConfig.
   */
  com.google.protobuf.Struct getBuildConfig();
  /**
   * <code>.google.protobuf.Struct build_config = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getBuildConfigOrBuilder();

  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMetadata metadata = 5;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMetadata metadata = 5;</code>
   * @return The metadata.
   */
  io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMetadata getMetadata();
  /**
   * <code>.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMetadata metadata = 5;</code>
   */
  io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <code>repeated .grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterial materials = 6;</code>
   */
  java.util.List<io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterial> 
      getMaterialsList();
  /**
   * <code>repeated .grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterial materials = 6;</code>
   */
  io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterial getMaterials(int index);
  /**
   * <code>repeated .grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterial materials = 6;</code>
   */
  int getMaterialsCount();
  /**
   * <code>repeated .grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterial materials = 6;</code>
   */
  java.util.List<? extends io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterialOrBuilder> 
      getMaterialsOrBuilderList();
  /**
   * <code>repeated .grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterial materials = 6;</code>
   */
  io.grafeas.v1.SlsaProvenanceZeroTwo.SlsaMaterialOrBuilder getMaterialsOrBuilder(
      int index);
}