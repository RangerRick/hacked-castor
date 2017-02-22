# Hacked Castor

This repository includes a hacked version of Castor that modifies the way the code is generated in order to ease our migration to JAXB.

For a log of modifications made to the source tree see: https://github.com/j-white/castor/tree/1.1.2.1a-develop


## Building

    mvn clean install

## Using in OpenNMS

This package has a different version number, so the easiest way to update use the modified version of the codegen module is to overwrite the artifacts in your Maven repo: 

    cp ~/.m2/repository/org/codehaus/castor/castor-codegen/1.1.2.1a-SNAPSHOT/castor-codegen-1.1.2.1a-SNAPSHOT.jar ~/.m2/repository/org/codehaus/castor/castor-codegen/1.1.2.1/castor-codegen-1.1.2.1.jar
