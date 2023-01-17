<a href="LICENSE.md">
<img src="https://unlicense.org/pd-icon.png" alt="Public Domain" align="right"/>
</a>

# Kotlin-friendly JDK ServiceLoader

[![build](https://github.com/binkley/kotlin-serviceloader/workflows/build/badge.svg)](https://github.com/binkley/kotlin-serviceloader/actions)
[![issues](https://img.shields.io/github/issues/binkley/kotlin-serviceloader.svg)](https://github.com/binkley/kotlin-serviceloader/issues/)
[![pull requests](https://img.shields.io/github/issues-pr/binkley/kotlin-serviceloader.svg)](https://github.com/binkley/kotlin-serviceloader/pulls)
[![vulnerabilities](https://snyk.io/test/github/binkley/kotlin-serviceloader/badge.svg)](https://snyk.io/test/github/binkley/kotlin-serviceloader)
[![license](https://img.shields.io/badge/license-Public%20Domain-blue.svg)](http://unlicense.org/)

## Supported Kotlin types

These types work "out of the box" with the JDK's
[`ServiceLoader`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ServiceLoader.html):
- Plain, top-level classes (see [`PirateFoo`](./kotlin-serviceloader-sample/src/main/kotlin/demo/PirateFoo.kt))
- Nested _static_ classes (see [`PrivateerFoo.IAmAnInnerClass`](./kotlin-serviceloader-sample/src/main/kotlin/demo/PrivateerFoo.kt))
  provided you use `$` (dollar sign) as the type separator in [the provider 
  configuration file](./kotlin-serviceloader-sample/src/main/resources/META-INF/services/demo.Foo)

These types **do not work**:
- Object declarations (top-level `object`): they lack a suitable constructor

## TODO

- Example with a "provider method"
  - Returning a top-level `object`
  - Returning a `fun interface` expression
