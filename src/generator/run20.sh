# Change the 3 params below to customize schema generation
FOLDER_PREF=../main/java/org/akomantoso
MAJOR_VERSION=_2_0
SCHEMA_FOLDER=$MAJOR_VERSION
xjc -b ./$SCHEMA_FOLDER/schema.xjb ./$SCHEMA_FOLDER/schema.xsd -d ../main/java
cp ./$SCHEMA_FOLDER/schema.xsd $FOLDER_PREF/$SCHEMA_FOLDER

