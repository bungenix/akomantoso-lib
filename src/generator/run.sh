FOLDER_PREF=../main/java/org/oasis_open/docs/legaldocml/ns/akn
MAJOR_VERSION=_3_0
REL_VERSION=csd06
SCHEMA_FOLDER=$MAJOR_VERSION/$REL_VERSION
xjc -b ./$SCHEMA_FOLDER/akomantoso30.xjb ./$SCHEMA_FOLDER/akomantoso30.xsd -d ../main/java
cp ./$SCHEMA_FOLDER/*.xsd $FOLDER_PREF/$SCHEMA_FOLDER

