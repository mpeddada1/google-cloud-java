/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/confidentialcomputing/v1alpha1/service.proto

package com.google.cloud.confidentialcomputing.v1alpha1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1alpha1_Challenge_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1alpha1_Challenge_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1alpha1_CreateChallengeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1alpha1_CreateChallengeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_PcrValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_PcrValuesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/confidentialcomputing/v1a"
          + "lpha1/service.proto\022+google.cloud.confid"
          + "entialcomputing.v1alpha1\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\241\002\n\tChallenge\022\021\n\004name\030\001 \001(\t"
          + "B\003\340A\003\0224\n\013create_time\030\002 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0224\n\013expire_time\030\003 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022\021\n\004use"
          + "d\030\004 \001(\010B\003\340A\003\022\022\n\005nonce\030\005 \001(\014B\003\340A\003:n\352Ak\n.c"
          + "onfidentialcomputing.googleapis.com/Chal"
          + "lenge\0229projects/{project}/locations/{loc"
          + "ation}/challenges/{uuid}\"\243\001\n\026CreateChall"
          + "engeRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!loc"
          + "ations.googleapis.com/Location\022N\n\tchalle"
          + "nge\030\002 \001(\01326.google.cloud.confidentialcom"
          + "puting.v1alpha1.ChallengeB\003\340A\002\"\233\002\n\030Verif"
          + "yAttestationRequest\022I\n\tchallenge\030\001 \001(\tB6"
          + "\340A\002\372A0\n.confidentialcomputing.googleapis"
          + ".com/Challenge\022Y\n\017gcp_credentials\030\002 \001(\0132"
          + ";.google.cloud.confidentialcomputing.v1a"
          + "lpha1.GcpCredentialsB\003\340A\001\022Y\n\017tpm_attesta"
          + "tion\030\003 \001(\0132;.google.cloud.confidentialco"
          + "mputing.v1alpha1.TpmAttestationB\003\340A\002\"6\n\031"
          + "VerifyAttestationResponse\022\031\n\014claims_toke"
          + "n\030\001 \001(\014B\003\340A\003\"#\n\016GcpCredentials\022\021\n\tid_tok"
          + "ens\030\001 \003(\014\"\233\003\n\016TpmAttestation\022Q\n\006quotes\030\001"
          + " \003(\0132A.google.cloud.confidentialcomputin"
          + "g.v1alpha1.TpmAttestation.Quote\022\025\n\rtcg_e"
          + "vent_log\030\002 \001(\014\022\033\n\023canonical_event_log\030\003 "
          + "\001(\014\022\017\n\007ak_cert\030\004 \001(\014\022\022\n\ncert_chain\030\005 \003(\014"
          + "\032\334\001\n\005Quote\022\021\n\thash_algo\030\001 \001(\005\022d\n\npcr_val"
          + "ues\030\002 \003(\0132P.google.cloud.confidentialcom"
          + "puting.v1alpha1.TpmAttestation.Quote.Pcr"
          + "ValuesEntry\022\021\n\traw_quote\030\003 \001(\014\022\025\n\rraw_si"
          + "gnature\030\004 \001(\014\0320\n\016PcrValuesEntry\022\013\n\003key\030\001"
          + " \001(\005\022\r\n\005value\030\002 \001(\014:\0028\0012\333\004\n\025Confidential"
          + "Computing\022\352\001\n\017CreateChallenge\022C.google.c"
          + "loud.confidentialcomputing.v1alpha1.Crea"
          + "teChallengeRequest\0326.google.cloud.confid"
          + "entialcomputing.v1alpha1.Challenge\"Z\202\323\344\223"
          + "\002A\"4/v1alpha1/{parent=projects/*/locatio"
          + "ns/*}/challenges:\tchallenge\332A\020parent,cha"
          + "llenge\022\372\001\n\021VerifyAttestation\022E.google.cl"
          + "oud.confidentialcomputing.v1alpha1.Verif"
          + "yAttestationRequest\032F.google.cloud.confi"
          + "dentialcomputing.v1alpha1.VerifyAttestat"
          + "ionResponse\"V\202\323\344\223\002P\"K/v1alpha1/{challeng"
          + "e=projects/*/locations/*/challenges/*}:v"
          + "erifyAttestation:\001*\032X\312A$confidentialcomp"
          + "uting.googleapis.com\322A.https://www.googl"
          + "eapis.com/auth/cloud-platformB\265\002\n/com.go"
          + "ogle.cloud.confidentialcomputing.v1alpha"
          + "1B\014ServiceProtoP\001Zecloud.google.com/go/c"
          + "onfidentialcomputing/apiv1alpha1/confide"
          + "ntialcomputingpb;confidentialcomputingpb"
          + "\252\002+Google.Cloud.ConfidentialComputing.V1"
          + "Alpha1\312\002+Google\\Cloud\\ConfidentialComput"
          + "ing\\V1alpha1\352\002.Google::Cloud::Confidenti"
          + "alComputing::V1alpha1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_confidentialcomputing_v1alpha1_Challenge_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_confidentialcomputing_v1alpha1_Challenge_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1alpha1_Challenge_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "ExpireTime", "Used", "Nonce",
            });
    internal_static_google_cloud_confidentialcomputing_v1alpha1_CreateChallengeRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_confidentialcomputing_v1alpha1_CreateChallengeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1alpha1_CreateChallengeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Challenge",
            });
    internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationRequest_descriptor,
            new java.lang.String[] {
              "Challenge", "GcpCredentials", "TpmAttestation",
            });
    internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1alpha1_VerifyAttestationResponse_descriptor,
            new java.lang.String[] {
              "ClaimsToken",
            });
    internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_descriptor,
            new java.lang.String[] {
              "IdTokens",
            });
    internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_descriptor,
            new java.lang.String[] {
              "Quotes", "TcgEventLog", "CanonicalEventLog", "AkCert", "CertChain",
            });
    internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_descriptor =
        internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_descriptor,
            new java.lang.String[] {
              "HashAlgo", "PcrValues", "RawQuote", "RawSignature",
            });
    internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_PcrValuesEntry_descriptor =
        internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_PcrValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1alpha1_TpmAttestation_Quote_PcrValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
