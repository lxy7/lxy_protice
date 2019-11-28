#!/bin/bash
#根据文件列表筛选增量文件
rm -rf ./obj
#mkdir ./obj
file_list=./FileList.txt #文件列表
file_tar_out=./obj.tar
file_zip_out=./obj.zip

echo 定义函数
out_zip(){
cat $file_list | xargs zip -r $file_zip_out
unzip ./obj.zip #解压
}

out_tar(){
cat $file_list | xargs tar czvf $file_tar_out
}


#调用打包函数
out_zip
rm -rf ./obj.zip #删除压缩文件
#out_tar
