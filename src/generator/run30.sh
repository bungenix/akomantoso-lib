# Change the 3 params below to customize schema generation
FOLDER_PREF=../main/java/org/oasis_open/docs/legaldocml/ns/akn
MAJOR_VERSION=_3_0
REL_VERSION=csd06
SCHEMA_FOLDER=$MAJOR_VERSION/$REL_VERSION
xjc -b ./$SCHEMA_FOLDER/schema.xjb ./$SCHEMA_FOLDER/schema.xsd -d ../main/java
cp ./$SCHEMA_FOLDER/schema.xsd $FOLDER_PREF/$SCHEMA_FOLDER

