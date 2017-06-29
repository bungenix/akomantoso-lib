# Akoma Ntoso Lib

This is a java class representation of the Akoma Ntoso XML schema. 

[Akoma Ntoso](http://www.akomtantoso.org) is an emerging legal document standard for representing legislative and judicial documents in XML format. 

The latest schema for Akoma Ntoso(AKN) can be found at [OASIS LegalDocML](https://www.oasis-open.org/committees/tc_home.php?wg_abbrev=legaldocml). I have a history of AKN Schema releases since 2006, in a [tagged github project](https://github.com/kohsah/akomantoso-release-archive). 

The schema has over 200 elements, so I wrote a schema browser (which includes annotated documentation and diagrams) for AKN to make it easier to navigate: [http://schema.akomantoso.com](http://schema.akomantoso.com)

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
