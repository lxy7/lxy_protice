#!/bin/bash
#�����ļ��б�ɸѡ�����ļ�
rm -rf ./obj
#mkdir ./obj
file_list=./FileList.txt #�ļ��б�
file_tar_out=./obj.tar
file_zip_out=./obj.zip

echo ���庯��
out_zip(){
cat $file_list | xargs zip -r $file_zip_out
unzip ./obj.zip #��ѹ
}

out_tar(){
cat $file_list | xargs tar czvf $file_tar_out
}


#���ô������
out_zip
rm -rf ./obj.zip #ɾ��ѹ���ļ�
#out_tar
