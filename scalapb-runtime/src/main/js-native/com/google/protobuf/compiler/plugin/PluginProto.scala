// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package com.google.protobuf.compiler.plugin

object PluginProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.google.protobuf.compiler.plugin.Version,
      com.google.protobuf.compiler.plugin.CodeGeneratorRequest,
      com.google.protobuf.compiler.plugin.CodeGeneratorResponse
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CiVnb29nbGUvcHJvdG9idWYvY29tcGlsZXIvcGx1Z2luLnByb3RvEhhnb29nbGUucHJvdG9idWYuY29tcGlsZXIaIGdvb2dsZ
  S9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIpQBCgdWZXJzaW9uEiAKBW1ham9yGAEgASgFQgriPwcSBW1ham9yUgVtYWpvchIgC
  gVtaW5vchgCIAEoBUIK4j8HEgVtaW5vclIFbWlub3ISIAoFcGF0Y2gYAyABKAVCCuI/BxIFcGF0Y2hSBXBhdGNoEiMKBnN1ZmZpe
  BgEIAEoCUIL4j8IEgZzdWZmaXhSBnN1ZmZpeCK2AwoUQ29kZUdlbmVyYXRvclJlcXVlc3QSPQoQZmlsZV90b19nZW5lcmF0ZRgBI
  AMoCUIT4j8QEg5maWxlVG9HZW5lcmF0ZVIOZmlsZVRvR2VuZXJhdGUSLAoJcGFyYW1ldGVyGAIgASgJQg7iPwsSCXBhcmFtZXRlc
  lIJcGFyYW1ldGVyElMKCnByb3RvX2ZpbGUYDyADKAsyJC5nb29nbGUucHJvdG9idWYuRmlsZURlc2NyaXB0b3JQcm90b0IO4j8LE
  glwcm90b0ZpbGVSCXByb3RvRmlsZRJ4Chdzb3VyY2VfZmlsZV9kZXNjcmlwdG9ycxgRIAMoCzIkLmdvb2dsZS5wcm90b2J1Zi5Ga
  WxlRGVzY3JpcHRvclByb3RvQhriPxcSFXNvdXJjZUZpbGVEZXNjcmlwdG9yc1IVc291cmNlRmlsZURlc2NyaXB0b3JzEmIKEGNvb
  XBpbGVyX3ZlcnNpb24YAyABKAsyIS5nb29nbGUucHJvdG9idWYuY29tcGlsZXIuVmVyc2lvbkIU4j8REg9jb21waWxlclZlcnNpb
  25SD2NvbXBpbGVyVmVyc2lvbiL2BQoVQ29kZUdlbmVyYXRvclJlc3BvbnNlEiAKBWVycm9yGAEgASgJQgriPwcSBWVycm9yUgVlc
  nJvchJFChJzdXBwb3J0ZWRfZmVhdHVyZXMYAiABKARCFuI/ExIRc3VwcG9ydGVkRmVhdHVyZXNSEXN1cHBvcnRlZEZlYXR1cmVzE
  jwKD21pbmltdW1fZWRpdGlvbhgDIAEoBUIT4j8QEg5taW5pbXVtRWRpdGlvblIObWluaW11bUVkaXRpb24SPAoPbWF4aW11bV9lZ
  Gl0aW9uGAQgASgFQhPiPxASDm1heGltdW1FZGl0aW9uUg5tYXhpbXVtRWRpdGlvbhJTCgRmaWxlGA8gAygLMjQuZ29vZ2xlLnByb
  3RvYnVmLmNvbXBpbGVyLkNvZGVHZW5lcmF0b3JSZXNwb25zZS5GaWxlQgniPwYSBGZpbGVSBGZpbGUa9wEKBEZpbGUSHQoEbmFtZ
  RgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEjwKD2luc2VydGlvbl9wb2ludBgCIAEoCUIT4j8QEg5pbnNlcnRpb25Qb2ludFIOaW5zZ
  XJ0aW9uUG9pbnQSJgoHY29udGVudBgPIAEoCUIM4j8JEgdjb250ZW50Ugdjb250ZW50EmoKE2dlbmVyYXRlZF9jb2RlX2luZm8YE
  CABKAsyIi5nb29nbGUucHJvdG9idWYuR2VuZXJhdGVkQ29kZUluZm9CFuI/ExIRZ2VuZXJhdGVkQ29kZUluZm9SEWdlbmVyYXRlZ
  ENvZGVJbmZvIqgBCgdGZWF0dXJlEiMKDEZFQVRVUkVfTk9ORRAAGhHiPw4SDEZFQVRVUkVfTk9ORRI5ChdGRUFUVVJFX1BST1RPM
  19PUFRJT05BTBABGhziPxkSF0ZFQVRVUkVfUFJPVE8zX09QVElPTkFMEj0KGUZFQVRVUkVfU1VQUE9SVFNfRURJVElPTlMQAhoe4
  j8bEhlGRUFUVVJFX1NVUFBPUlRTX0VESVRJT05TQnIKHGNvbS5nb29nbGUucHJvdG9idWYuY29tcGlsZXJCDFBsdWdpblByb3Rvc
  1opZ29vZ2xlLmdvbGFuZy5vcmcvcHJvdG9idWYvdHlwZXMvcGx1Z2lucGKqAhhHb29nbGUuUHJvdG9idWYuQ29tcGlsZXI="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}