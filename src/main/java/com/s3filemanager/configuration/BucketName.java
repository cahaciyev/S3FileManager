package com.s3filemanager.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BucketName {
    TODO_IMAGE("amazon-bucket-for-tutorial");
    private final String bucketName;
}