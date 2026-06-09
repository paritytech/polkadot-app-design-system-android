# Polkadot App Design System — Android

Compose / Kotlin design tokens for the Polkadot App: colors, typography, spacings, radii, borders. Generated from [polkadot-app-design-system](https://github.com/paritytech/polkadot-app-design-system) — do not edit files in `design-system/src/main/java/io/paritytech/polkadotapp/designsystem/` by hand; they're regenerated on every release.

## Consuming via JitPack

In your root `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        maven("https://jitpack.io")
    }
}
```

In your module's `build.gradle.kts`:

```kotlin
dependencies {
    implementation("com.github.paritytech:polkadot-app-design-system-android:<tag>")
}
```

Tags are published as `vX.Y.Z`. See the [Releases](../../releases) page.

## What's in the artifact

```
io.paritytech.polkadotapp.designsystem.colors      PolkadotColorsPalette, PolkadotColorsPrimitives, PolkadotDefaultPalette
io.paritytech.polkadotapp.designsystem.typography  PolkadotTypography, PolkadotFontFamilies, PolkadotDefaultTypography, PolkadotValueTypography
io.paritytech.polkadotapp.designsystem.spacings    PolkadotSpacings, PolkadotDefaultSpacings
io.paritytech.polkadotapp.designsystem.radii       PolkadotRadii, PolkadotDefaultRadii
io.paritytech.polkadotapp.designsystem.borders     PolkadotBorders, PolkadotDefaultBorders
```

Wire each into your `CompositionLocal` and expose them via your theme.

## Updating tokens

Tokens are edited in the upstream [polkadot-app-design-system](https://github.com/paritytech/polkadot-app-design-system) repo. A GitHub Action there regenerates the Kotlin and opens a PR against this repo on every release.
