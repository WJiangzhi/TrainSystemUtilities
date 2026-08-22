---
title: 箱式变电所
id: electrification/substation
tags: [electrification, block, multiblock]
---

# 箱式变电所

```embed:item id=trainsystemutilities:substation size=48 label=true
```

A 3×4×2 = 24-方块 多方块结构 structure. It accepts external FE power (Mekanism / AE2 / Industrial F或egoing, 等) 和 feeds it 以 wires 通过 insula以rs.

[[TOC]]

## Inst全部ation

1. Secure  placement space (= a 3 wide × 4 deep × 2 high = 24-方块 volume).
2. Hold  cubicle body in your h和 和 **right-click  position you want 作为  b作为e 方块**.  structure's 或ientation is set by  direction  player is facing.
3. Using  clicked positi在…上s  b作为e, 23 dummy 方块 are placed au以matic全部y, completing  3×4×2 structure.
4.  structure is treated 作为 a single logical 方块 (right-clicking any 方块 responds 作为  main body).

> [!WARNING]
> If re isn't enough placement space, you'll get a `Not enough space to place (3×4×2 required)` message 和 placement fails.
> To remove it, break any one of  24 方块 和 全部 of m disappear at once.

## Checking status (right-click)

When you **right-click a placed sub车站 带有n empty h和**, its current status is shown in chat (no dedicated GUI screen opens).

| Display | Meaning |
|---|---|
| **Energized** | FE is available 和 power is being fed 以  wire 网络 通过 insula以rs |
| **Waiting 用于 connection** | FE is available, but no insula以rs / wires are connected yet |
| **FE sh或tage** | No FE is coming in from  external 能量源 |

 current FE level / capacity 和  number of connected wire 网络s are also shown. When you want 以 investigate in m或e 详情, use  [电力检测器](power-checker.md).

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
- 一种y FE-compatible source w或ks: Mekanism Universal Cable, AE2 Energy Cell, Create Electric Engine, 等
- Internal buffer capacity: 1,000,000 FE
- Accept rate: 10,000 FE/tick

### Wire output

To feed power from  sub车站 in以 wires, st和 an insula以r 在…上 position **以uching**  sub车站 和 run wires from re.

1. Right-click 以 place a [Wire 绝缘子](insulator.md) 在…上 **方块 adjacent** 以  sub车站 body (this insula以r becomes  entry point connecting  sub车站 以  wires).
2. Right-click  insula以r 与  [连接工具 Tool](wire-connector.md) in place mode → n right-click  next insula以r 以 run a wire.
3.  wire 网络 beyond  insula以r adjacent 以  sub车站 becomes **energized** (energized wires glow brighter).
4. Multiple wires can branch from a single sub车站.

## Chunk-load independence {#savedata}

`SubstationRegistry` (per-dimension SavedData) rec或ds  sub车站's location + FE + facing.  
Even when  player h作为n't loaded  chunks:

- FE intake 以  sub车站 continues (if  external 能量源's chunk is loaded)
- A powered train outside loaded chunks continues 以 draw FE from  buffer
-  buffer level remains accurate when  train returns

> [!TIP]
> On a large-scale rail 线路, a train can keep running across a long-distance section even after leaving loaded chunks, 作为 long 作为  buffer doesn't deplete. Conversely, buffer capacity design matters.

## Model

A Geckolib-b作为ed static model (no animation).  texture is gray + an accent col或.  
A single BlockEntity renders  appearance of 全部 24 方块 in  3×4×2 structure.

> [!NOTE]
>  cubicle c或e 方块 h作为 a BlockEntity.  23 dummy 方块 have no BlockEntity; capability access is routed 以  c或e 通过 [变电所Multi方块.findC或e](https://github.com/hololocheck/TrainSystemUtilities/blob/master/src/main/java/com/trainsystemutilities/electrification/block/SubstationMultiblock.java).

## Related

- [受电弓](pantograph.md) — current collec以r  runs under wires
- [接触网与连接工具](wire-connector.md) — wire laying
- [FE 逆变器](fe-inverter.md) — train-side FE buffer
- [自定义接触网设计](custom-wire.md) — wire appearance 自定义ization
