package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ZouYifeng on 2017/8/27.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
