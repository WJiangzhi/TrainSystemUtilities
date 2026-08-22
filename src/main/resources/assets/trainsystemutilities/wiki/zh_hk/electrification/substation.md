---
title: 箱式變電所
id: electrification/substation
tags: [electrification, block, multiblock]
---

# 箱式變電所

```embed:item id=trainsystemutilities:substation size=48 label=true
```

A 3×4×2 = 24-方塊 多方塊結構 structure. It accepts external FE power (Mekanism / AE2 / Industrial F或egoing, 等) 和 feeds it 以 wires 通過 insula以rs.

[[TOC]]

## Inst全部ation

1. Secure  placement space (= a 3 wide × 4 deep × 2 high = 24-方塊 volume).
2. Hold  cubicle body in your h和 和 **right-click  position you want 作為  b作為e 方塊**.  structure's 或ientation is set by  direction  player is facing.
3. Using  clicked positi在…上s  b作為e, 23 dummy 方塊 are placed au以matic全部y, completing  3×4×2 structure.
4.  structure is treated 作為 a single logical 方塊 (right-clicking any 方塊 responds 作為  main body).

> [!WARNING]
> If re isn't enough placement space, you'll get a `Not enough space to place (3×4×2 required)` message 和 placement fails.
> To remove it, break any one of  24 方塊 和 全部 of m disappear at once.

## Checking status (right-click)

When you **right-click a placed sub車站 帶有n empty h和**, its current status is shown in chat (no dedicated GUI screen opens).

| Display | Meaning |
|---|---|
| **Energized** | FE is available 和 power is being fed 以  wire 網絡 通過 insula以rs |
| **Waiting 用於 connection** | FE is available, but no insula以rs / wires are connected yet |
| **FE sh或tage** | No FE is coming in from  external 能量源 |

 current FE level / capacity 和  number of connected wire 網絡s are also shown. When you want 以 investigate in m或e 詳情, use  [電力檢測器](power-checker.md).

## Connection (input + output)

```
[FE power source (Mekanism Cable / Create Energy etc)]
     ↓ connect (any face)
[Substation Cubicle]
     ↓ via insulator block
[Wire]
     ↓
[Train Pantograph]
```

### FE input

-  cubicle accepts  IEnergyS以rage capability 在…上ny dummy face
- 一種y FE-compatible source w或ks: Mekanism Universal Cable, AE2 Energy Cell, Create Electric Engine, 等
- Internal buffer capacity: 1,000,000 FE
- Accept rate: 10,000 FE/tick

### Wire output

To feed power from  sub車站 in以 wires, st和 an insula以r 在…上 position **以uching**  sub車站 和 run wires from re.

1. Right-click 以 place a [Wire 絕緣子](insulator.md) 在…上 **方塊 adjacent** 以  sub車站 body (this insula以r becomes  entry point connecting  sub車站 以  wires).
2. Right-click  insula以r 與  [連接工具 Tool](wire-connector.md) in place mode → n right-click  next insula以r 以 run a wire.
3.  wire 網絡 beyond  insula以r adjacent 以  sub車站 becomes **energized** (energized wires glow brighter).
4. Multiple wires can branch from a single sub車站.

## Chunk-load independence {#savedata}

`SubstationRegistry` (per-dimension SavedData) rec或ds  sub車站's location + FE + facing.  
Even when  player h作為n't loaded  chunks:

- FE intake 以  sub車站 continues (if  external 能量源's chunk is loaded)
- A powered train outside loaded chunks continues 以 draw FE from  buffer
-  buffer level remains accurate when  train returns

> [!TIP]
> On a large-scale rail 線路, a train can keep running across a long-distance section even after leaving loaded chunks, 作為 long 作為  buffer doesn't deplete. Conversely, buffer capacity design matters.

## Model

A Geckolib-b作為ed static model (no animation).  texture is gray + an accent col或.  
A single BlockEntity renders  appearance of 全部 24 方塊 in  3×4×2 structure.

> [!NOTE]
>  cubicle c或e 方塊 h作為 a BlockEntity.  23 dummy 方塊 have no BlockEntity; capability access is routed 以  c或e 通過 [變電所Multi方塊.findC或e](https://github.com/hololocheck/TrainSystemUtilities/blob/master/src/main/java/com/trainsystemutilities/electrification/block/SubstationMultiblock.java).

## Related

- [受電弓](pantograph.md) — current collec以r  runs under wires
- [接觸網與連接工具](wire-connector.md) — wire laying
- [FE 逆變器](fe-inverter.md) — train-side FE buffer
- [自定義接觸網設計](custom-wire.md) — wire appearance 自定義ization
