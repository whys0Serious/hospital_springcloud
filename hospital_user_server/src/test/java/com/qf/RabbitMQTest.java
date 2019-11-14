package com.qf;

import com.qf.utils.Md5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void sendMail(){
              String msg="hello";
            rabbitTemplate.convertAndSend("sendMail",msg);
    }

    @Test
    public void Md5Test(){
        String password = Md5Utils.encryptPassword("666", "老板来了");
        System.out.println(password);
    }

//    @Test
//    public void upload(){
//        File file1 = new File("D:\\touxiang.jpg");
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream(file1);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            MultipartFile multipartFile = new MockMultipartFile(file1.getName(), file1.getName(),
//                    ContentType.APPLICATION_OCTET_STREAM.toString(), fileInputStream);
//            String upload = fastUtils.upload(multipartFile);
//            System.out.println(upload);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    @Test
    public void fileText() throws IOException {
        File file = new File("F:\\input.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String numStr;
            List list=new ArrayList();
            while ((numStr=bufferedReader.readLine())!=null){
                    if(Integer.parseInt(numStr)<1000&&Integer.parseInt(numStr)>0){
                        list.add(numStr);
                    }
            }
            System.out.println(list.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
