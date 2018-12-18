// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/auth/cert.proto

package io.grpc.xds.shaded.envoy.api.v2.auth;

public interface SecretOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.auth.Secret)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name (FQDN, UUID, SPKI, SHA256, etc.) by which the secret can be uniquely referred to.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name (FQDN, UUID, SPKI, SHA256, etc.) by which the secret can be uniquely referred to.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.envoy.api.v2.auth.TlsCertificate tls_certificate = 2;</code>
   */
  boolean hasTlsCertificate();
  /**
   * <code>.envoy.api.v2.auth.TlsCertificate tls_certificate = 2;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.auth.TlsCertificate getTlsCertificate();
  /**
   * <code>.envoy.api.v2.auth.TlsCertificate tls_certificate = 2;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.auth.TlsCertificateOrBuilder getTlsCertificateOrBuilder();

  /**
   * <code>.envoy.api.v2.auth.TlsSessionTicketKeys session_ticket_keys = 3;</code>
   */
  boolean hasSessionTicketKeys();
  /**
   * <code>.envoy.api.v2.auth.TlsSessionTicketKeys session_ticket_keys = 3;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.auth.TlsSessionTicketKeys getSessionTicketKeys();
  /**
   * <code>.envoy.api.v2.auth.TlsSessionTicketKeys session_ticket_keys = 3;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.auth.TlsSessionTicketKeysOrBuilder getSessionTicketKeysOrBuilder();

  /**
   * <code>.envoy.api.v2.auth.CertificateValidationContext validation_context = 4;</code>
   */
  boolean hasValidationContext();
  /**
   * <code>.envoy.api.v2.auth.CertificateValidationContext validation_context = 4;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.auth.CertificateValidationContext getValidationContext();
  /**
   * <code>.envoy.api.v2.auth.CertificateValidationContext validation_context = 4;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.auth.CertificateValidationContextOrBuilder getValidationContextOrBuilder();

  public io.grpc.xds.shaded.envoy.api.v2.auth.Secret.TypeCase getTypeCase();
}