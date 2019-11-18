package com.qf.utils;

import com.qf.domain.FileSystem;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/9
 * \* Time: 10:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class FastUtils {

    @Value("${file-fastdfs.upload_location}")
    private String filePath;

    @Value("${file-fastdfs.path}")
    private String path;


    public String upload(MultipartFile file) throws IOException {
        FileSystem fileSystem = new FileSystem();
        //将文件先存储在web服务器上（本机），再调用fastdfs的client将文件上传到fastdfs服务器
        String originalFilename = file.getOriginalFilename();
        //扩展名
        String extention = originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileNameNew = UUID.randomUUID()+"."+extention;
        //定义file，使用file存储上传的文件
//        File file1 = new File("D:\\upload\\"+fileNameNew);
        File fil = new File(filePath);
        if (!fil.exists()){
            fil.mkdir();
        }
        File file1 = new File(filePath+fileNameNew);
        file.transferTo(file1);
        //获取新上传文件的物理路径
        String newfile1Path = file1.getAbsolutePath();
        try {
            //加载fastDFS配置文件
            ClientGlobal.initByProperties("FastDFS.properties");
            System.out.println("network_timeout=" + ClientGlobal.g_network_timeout + "ms");
            System.out.println("charset=" + ClientGlobal.g_charset);

            //创建tracker的客户端
            TrackerClient tracker = new TrackerClient();
            TrackerServer trackerServer = tracker.getConnection();
            StorageServer storageServer = null;

            //定义storage的客户端
            StorageClient1 client = new StorageClient1(trackerServer, storageServer);

            //文件元信息
            NameValuePair[] metaList = new NameValuePair[1];
            metaList[0] = new NameValuePair("fileName", originalFilename);

            //最关键   执行上传  将上传成功的存放在本机在上传服务器
            String fileId = client.upload_file1(newfile1Path, extention, metaList);
            System.out.println("upload success. file id is: " + fileId);
            fileSystem.setFileId(fileId);
            fileSystem.setFilePath(fileId);
            fileSystem.setFileName(originalFilename);

//            int i = 0;
//            while (i++ < 10) {
//                byte[] result = client.download_file1(fileId);
//                System.out.println(i + ", download result is: " + result.length);
//            }
            //关闭tracker server的连接
            trackerServer.close();
            return path+"/"+fileId;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}