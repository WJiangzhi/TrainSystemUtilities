---
title: Station Name Sign
id: structure/station-name-sign
tags: [structure, block, station, sign]
---

# Station Name Sign

```embed:items size=48 cols=2 label=true ids=trainsystemutilities:station_name_sign,trainsystemutilities:station_name_sign_pole
```

A platform station name board, 4 blocks wide and 1 block tall. Place it **inside a station group range** and it automatically displays the station name, line color and neighboring stations, on both faces. There is no UI — everything shown is derived from the station group and the assigned line symbol.

[[TOC]]

## Placement {#place}

1. Hold the sign and **right-click** where you want it. The display face turns toward you.
2. It needs 4 blocks of horizontal space. If the space is blocked, placement is cancelled and no item is consumed.
3. Breaking any of the 4 cells removes the whole sign and drops the item.

> [!WARNING]
> **A sign placed outside any station group range shows nothing** (the panel stays blank white). Always place it inside a station group created with the [Station Range Tool](../tools/station-range-tool.md).

## Pole variant (hanging) {#pole}

The pole variant adds a hanging pole at each end, for a total height of 2 blocks.

- **Right-click the underside of a ceiling** to hang it: the poles attach to the ceiling and the board sits one block below.
- Placement is cancelled if the pole space (above the two end cells) is blocked.
- Display behavior is identical to the normal variant.

## What is displayed {#display}

| Element | Content | Requires |
|---|---|---|
| Station name (center) | Name of the station group containing the sign | Sign inside a station group |
| Line symbol badge | Left of the station name | A [line symbol](../management-computer/line-symbols.md) assigned to a Create station inside the group |
| Color band | Band below the name; color = **the symbol's border color** | Same as above |
| Neighboring stations | White text at both ends of the band | Another station group connected by track |

- Renames and symbol changes propagate to the sign within a few seconds.
- Neighbors are resolved **from the track network**: starting at this station, the first different station group found in each direction along the track is shown. Left/right assignment follows the sign's facing automatically.
- After changing tracks or station groups, the neighbor display may take up to ~30 seconds to refresh.

## Troubleshooting {#faq}

- **Nothing is displayed** → the sign is outside any station group range.
- **No band / badge** → no line symbol is assigned to the station. Assign one in the [Management Computer's line symbol tab](../management-computer/line-symbols.md).
- **No neighbors** → check that tracks actually connect to the neighboring station and that it has its own station group.

## Related pages

- [Station Range Tool](../tools/station-range-tool.md)
- [Line Symbols (Management Computer)](../management-computer/line-symbols.md)
- [Ticket Vending Machine](ticket-vending-machine.md) / [Platform Fence](platform-fence.md)
