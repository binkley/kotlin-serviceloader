<a href="LICENSE.md">
<img src="https://unlicense.org/pd-icon.png" alt="Public Domain" align="right"/>
</a>

# Kotlin-friendly JDK ServiceLoader

[![build](https://github.com/binkley/kotlin-serviceloader/workflows/build/badge.svg)](https://github.com/binkley/kotlin-serviceloader/actions)
[![issues](https://img.shields.io/github/issues/binkley/kotlin-serviceloader.svg)](https://github.com/binkley/kotlin-serviceloader/issues/)
[![vulnerabilities](https://snyk.io/test/github/binkley/kotlin-serviceloader/badge.svg)](https://snyk.io/test/github/binkley/kotlin-serviceloader)
[![license](https://img.shields.io/badge/license-Public%20Domain-blue.svg)](http://unlicense.org/)

## Supported Kotlin types

These work "out of the box" with the JDK's
[`ServiceLoader`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ServiceLoader.html):
- Plain, top-level classes (see [`PirateFoo`](./src/main/kotlin/demo/PirateFoo.kt))
- Nested _static_ classes (see [`PrivateerFoo.Static`](./src/main/kotlin/demo/PrivateerFoo.kt))
  provided you use `$` (dollar sign) as the type separator in [the provider 
  configuration file](./src/main/resources/META-INF/services/demo.Foo)
