#!/usr/bin/env bash
PLUGINS="--plugin pretty --plugin html:cucumber/cucumber.html --plugin json:cucumber/cucumber.json"
java -jar target/pensjon-kladding.jar ${PLUGINS} --glue steps classpath:features  --tags "not @Wip" --tags @ExampleFeature --threads 8
