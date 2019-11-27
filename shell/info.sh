echo "Input Information"
echo "———————————————————"
echo "date|id|name|age"
now=`date "+%Y%m%d"`
while true
do
   read  -p "id:" id
   read -p "name:" name
   read -p "age:" age
   echo "$now|$id|$name|$age">>info.txt
   echo "——————Information Statistics————————"
   cat info.txt | cut -d "|" -f2 | sort | uniq -c
   echo "————————————————————————————————————"
done