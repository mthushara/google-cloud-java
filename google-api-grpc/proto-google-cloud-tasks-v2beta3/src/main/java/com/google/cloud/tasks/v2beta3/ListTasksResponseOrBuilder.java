// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

public interface ListTasksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.ListTasksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  java.util.List<com.google.cloud.tasks.v2beta3.Task> getTasksList();
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  com.google.cloud.tasks.v2beta3.Task getTasks(int index);
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  int getTasksCount();
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tasks.v2beta3.TaskOrBuilder> getTasksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  com.google.cloud.tasks.v2beta3.TaskOrBuilder getTasksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * To return the next page of results, call
   * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this value as the
   * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
   * If the next_page_token is empty, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * To return the next page of results, call
   * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this value as the
   * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
   * If the next_page_token is empty, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
