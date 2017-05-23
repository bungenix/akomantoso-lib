# Akoma Ntoso Lib

This is a java class representation of the Akoma Ntoso XML schema. 

[Akoma Ntoso](http://www.akomtantoso.org) is an emerging legal document standard for representing legislative and judicial documents in XML format.

## Project Website

You can find out much more about Akoma Ntoso Lib at the [project website](http://kohsah.github.io/akomantoso-lib/).


## Building

Git clone and :

```
mvn package
```

There is a separate release profile to push the library to maven central:

```
mvn clean deploy -P release
```


## Resources

For more information on Akoma Ntoso and ongoing work in this area, please see below. 

 * http://www.akomtantoso.org
 * http://code.google.com/p/akomantoso

This library is generated using JAXB on the Akoma Ntoso 3.0 schema. 

Akoma Ntoso Lib is licensed under the [Apache Software License v2.0](http://apache.org/licenses/LICENSE-2.0). For a local copy of the license, see LICENSE.txt in this directory.
