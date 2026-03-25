# Tinker Star Wars Changelog

## Summary

This pass reworked the Tinkers material pipeline toward the Star Wars metal and ore roster.
The core tool material system now generates the new target metals from the design sheet, removes legacy materials from the main material generators, and regenerates the associated material data successfully.

## Added Materials

The following materials were added to the main generated material set:

- Beskar
- Cortosis
- Electrum
- Alum
- Ultrachrome
- Crystal-Weave
- Titanium
- Fire Diamond
- Chromium
- Platinum
- Quadranium
- Aurodium
- Doonium
- Steel
- Cast Iron
- Carbonite
- Codoran
- Lapis
- Redstone
- Quartz
- Coal
- Sulfur
- Aluminum
- Nickel
- Brass
- Lead
- Lithium
- Constantan
- Uranium
- Beryllium

## Material Pipeline Changes

The following systems were updated to use the new roster:

- Material IDs and generated material definitions
- Material tags and category placement
- Material item recipes
- Material stats
- Material traits
- Material render info
- Material sprite generation
- Trim material registration and trim palette generation

Datagen now completes successfully with the new material set.

## Legacy Material Cleanup

Legacy tool materials were removed from the primary material generators so they are no longer treated as first-class materials in the core tool material pipeline.

Examples of materials removed from the main generated roster:

- Slimesteel
- Amethyst Bronze
- Rose Gold
- Pig Iron
- Cobalt
- Queens Slime
- Cinderslime
- Hepatizon
- Manyullyn
- Knightmetal
- Knightslime
- Osmium
- Silver
- Bronze
- Invar
- Pewter
- Necronium
- Plated Slimewood
- Steeleaf
- Fiery
- Nicrosil

Some legacy IDs are still redirected internally for compatibility during migration.

## Custom Ore API

A small addon-facing custom ore API was added so other mods can register ore-style materials more cleanly:

- `CustomOreMaterial`
- `CustomOreMaterialRegistry`

This provides a stable place for compat ore metadata instead of hardcoding every custom ore directly into the existing material internals.

## Generated Content

The generated material resources were refreshed under `src/generated/resources` after the material pipeline changes.

This includes:

- material definitions
- material stats
- material traits
- material render metadata
- material recipes
- generated material palettes and trim palette assets

## Known Remaining Work

This changelog reflects the material and tool pipeline update only.

The broader mod still contains legacy metal content outside the material pipeline, including some older:

- fluids
- worldgen and ore content
- block and item tags
- advancements
- modifier model references
- skull and special recipe references

Those systems still need a separate full purge if the goal is to remove every non-Star-Wars metal from the entire mod, not just from the tool material system.
