> [!WARNING]
> This open source code is provided for research, experimentation, and developer education only. This code has not been audited, is actively experimental, and may contain bugs, vulnerabilities, or incomplete features. Use at your own risk and obtain legal advice as appropriate - DYOR.
>
> Parity doesn’t deploy the code but may update it based on community feedback.
>
> If you experience problems with any product or service that was built on or deployed from this code, you should contact the third party who deployed the code in its amended form, not Parity.

# Polkadot App Design System — Android

Compose / Kotlin design tokens for the Polkadot App: colors, typography, spacings, radii, shapes, borders. Generated from [polkadot-app-design-system](https://github.com/paritytech/polkadot-app-design-system) — do not edit files in `design-system/src/main/java/io/paritytech/polkadotapp/designsystem/` by hand; they're regenerated when the tokens change.

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

Tags are published as `X.Y.Z` (no `v` prefix), for example `1.0.4`. See the [tags](../../tags) page.

## What's in the artifact

```
io.paritytech.polkadotapp.designsystem.colors      PolkadotColorsPalette, BerlinDayPalette, BerlinNightPalette, LisbonPalette, MaltaPalette, TokyoPalette
io.paritytech.polkadotapp.designsystem.typography  PolkadotTypography, PolkadotDefaultTypography, PolkadotFontFamilies, PolkadotCashLogo
io.paritytech.polkadotapp.designsystem.spacings    PolkadotSpacings, PolkadotDefaultSpacings
io.paritytech.polkadotapp.designsystem.radii       PolkadotRadii, PolkadotDefaultRadii
io.paritytech.polkadotapp.designsystem.shapes      PolkadotShapes, PolkadotDefaultShapes
io.paritytech.polkadotapp.designsystem.borders     PolkadotBorders, PolkadotDefaultBorders
io.paritytech.polkadotapp.designsystem.themes      PolkadotAppTheme
```

Wire each into your `CompositionLocal` and expose them via your theme.

## Updating tokens

Tokens are edited in the upstream [polkadot-app-design-system](https://github.com/paritytech/polkadot-app-design-system) repo. A GitHub Action there regenerates the Kotlin and opens a PR against this repo.

## Fonts

The artifact bundles Inter, Manrope, Martian Mono and Source Sans 3 under `design-system/src/main/res/font/`. They are distributed under the SIL Open Font License 1.1, not the Apache License; see [THIRD_PARTY_NOTICES.md](THIRD_PARTY_NOTICES.md) and [`licenses/fonts/`](licenses/fonts).

## Security

Before deploying it for real use cases, you are responsible for:

- Reviewing the code yourself, we publish a reference, not a hardened production build
- Checking that the dependencies are up to date and free of known vulnerabilities
- Securing your own fork or deployment environment (keys, secrets, network configuration)
- Tracking the latest tagged release/commits for security fixes; older releases are not backported (exceptions might apply)

For Parity's security disclosure process, and Bug Bounty program, feel free to visit: https://parity.io/bug-bounty

## License

Licensed under the [Apache License, Version 2.0](LICENSE). Bundled fonts are licensed separately, see [Fonts](#fonts).
