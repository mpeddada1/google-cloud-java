// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ReplaceDictionaryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ReplaceDictionaryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of words to select from for random replacement. The
   * [limits](https://cloud.google.com/dlp/limits) page contains details about
   * the size limits of dictionaries.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordList word_list = 1;</code>
   * @return Whether the wordList field is set.
   */
  boolean hasWordList();
  /**
   * <pre>
   * A list of words to select from for random replacement. The
   * [limits](https://cloud.google.com/dlp/limits) page contains details about
   * the size limits of dictionaries.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordList word_list = 1;</code>
   * @return The wordList.
   */
  com.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordList getWordList();
  /**
   * <pre>
   * A list of words to select from for random replacement. The
   * [limits](https://cloud.google.com/dlp/limits) page contains details about
   * the size limits of dictionaries.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordList word_list = 1;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType.Dictionary.WordListOrBuilder getWordListOrBuilder();

  public com.google.privacy.dlp.v2.ReplaceDictionaryConfig.TypeCase getTypeCase();
}