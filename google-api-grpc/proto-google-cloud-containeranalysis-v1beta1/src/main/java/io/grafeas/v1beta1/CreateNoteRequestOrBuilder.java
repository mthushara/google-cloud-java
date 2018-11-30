// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

public interface CreateNoteRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.CreateNoteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the note is to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the note is to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The ID to use for this note.
   * </pre>
   *
   * <code>string note_id = 2;</code>
   */
  java.lang.String getNoteId();
  /**
   *
   *
   * <pre>
   * The ID to use for this note.
   * </pre>
   *
   * <code>string note_id = 2;</code>
   */
  com.google.protobuf.ByteString getNoteIdBytes();

  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 3;</code>
   */
  boolean hasNote();
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 3;</code>
   */
  io.grafeas.v1beta1.Note getNote();
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Note note = 3;</code>
   */
  io.grafeas.v1beta1.NoteOrBuilder getNoteOrBuilder();
}
