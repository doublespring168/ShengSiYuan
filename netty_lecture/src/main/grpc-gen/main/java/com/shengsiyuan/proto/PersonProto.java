// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Person.proto

package com.shengsiyuan.proto;

public final class PersonProto {
  private PersonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_PRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_PRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_PResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_PResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_IntReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_IntReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_StreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_StreamResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_StreamListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_StreamListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_StreamReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_StreamReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shengsiyuan_proto_StreamResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_shengsiyuan_proto_StreamResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Person.proto\022\025com.shengsiyuan.proto\"\034\n" +
      "\010PRequest\022\020\n\010username\030\001 \001(\t\"\035\n\tPResponse" +
      "\022\020\n\010realname\030\001 \001(\t\"\025\n\006IntReq\022\013\n\003age\030\001 \001(" +
      "\005\"9\n\016StreamResponse\022\014\n\004name\030\001 \001(\t\022\013\n\003age" +
      "\030\002 \001(\005\022\014\n\004city\030\003 \001(\t\"S\n\022StreamListRespon" +
      "se\022=\n\016streamResponse\030\001 \003(\0132%.com.shengsi" +
      "yuan.proto.StreamResponse\"\035\n\tStreamReq\022\020" +
      "\n\010req_info\030\001 \001(\t\"\037\n\nStreamResp\022\021\n\tresp_i" +
      "nfo\030\001 \001(\t2\210\003\n\rPersonService\022\\\n\025GetRealNa" +
      "meByUsername\022\037.com.shengsiyuan.proto.PRe" +
      "quest\032 .com.shengsiyuan.proto.PResponse\"" +
      "\000\022[\n\017GetPersonsByAge\022\035.com.shengsiyuan.p" +
      "roto.IntReq\032%.com.shengsiyuan.proto.Stre" +
      "amResponse\"\0000\001\022g\n\027GetPersonsWrapperByAge" +
      "s\022\035.com.shengsiyuan.proto.IntReq\032).com.s" +
      "hengsiyuan.proto.StreamListResponse\"\000(\001\022" +
      "S\n\006BiTalk\022 .com.shengsiyuan.proto.Stream" +
      "Req\032!.com.shengsiyuan.proto.StreamResp\"\000" +
      "(\0010\001B&\n\025com.shengsiyuan.protoB\013PersonPro" +
      "toP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_shengsiyuan_proto_PRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_shengsiyuan_proto_PRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_PRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_com_shengsiyuan_proto_PResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_shengsiyuan_proto_PResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_PResponse_descriptor,
        new java.lang.String[] { "Realname", });
    internal_static_com_shengsiyuan_proto_IntReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_shengsiyuan_proto_IntReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_IntReq_descriptor,
        new java.lang.String[] { "Age", });
    internal_static_com_shengsiyuan_proto_StreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_shengsiyuan_proto_StreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_StreamResponse_descriptor,
        new java.lang.String[] { "Name", "Age", "City", });
    internal_static_com_shengsiyuan_proto_StreamListResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_shengsiyuan_proto_StreamListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_StreamListResponse_descriptor,
        new java.lang.String[] { "StreamResponse", });
    internal_static_com_shengsiyuan_proto_StreamReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_shengsiyuan_proto_StreamReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_StreamReq_descriptor,
        new java.lang.String[] { "ReqInfo", });
    internal_static_com_shengsiyuan_proto_StreamResp_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_shengsiyuan_proto_StreamResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_shengsiyuan_proto_StreamResp_descriptor,
        new java.lang.String[] { "RespInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
