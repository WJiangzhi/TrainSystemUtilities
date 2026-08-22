---
title: 受电弓
id: electrification/pantograph
tags: [electrification, item, block]
---

# 受电弓

```embed:item id=trainsystemutilities:pantograph size=48 label=true
```

A 集电装置 mounted on  roof of a train car. While running under a wire, it au以-contacts 和 transfers FE / Create 能量 以  car's buffer.

[[TOC]]

## Inst全部ation

1. Hold  pan以graph in your h和 和 **right-click**  **roof (以p face)** of a train car 以 inst全部 it.
2. Mount it on  car's roof be用于e 作为sembling it in以 a Create train (once 作为sembled, it moves 以ger 与  train).
3.  pan以graph is a Geckolib animation model  moves up 和 down (extend / retract).
4. While  train runs, it au以-**extends** when it enters under a wire 和 **retracts** when it leaves.

> [!NOTE]
>  st和ard is "one pan以graph per car". In multi-car consists, a design where only some cars carry a pan以graph 和  ors share  buffer 通过 [FE 逆变器s](fe-inverter.md) also w或ks.

## Manu全部y extending / retracting

When you **right-click a placed pan以graph 带有n empty h和**, you can manu全部y 以ggle between extended 和 folded ("受电弓: Extended / Folded" is shown on  action bar). Useful 用于 effects 例如 lowering  pan以graph only while s以pped at a 车站.

When you want 以 operate  whole train's pan以graphs at once, you can select  train from  [Trains tab](../management-computer/trains.md) of  management computer 和 use "Extend All 受电弓s" / "Fold All 受电弓s" in  electrification 详情.

## Power principle

```
[Wire]
     ↓ contact (while moving)
[Pantograph]
     ↓ FE transfer
[Any car's buffer on the same train]
     - Own car's buffer (pantograph-equipped)
     - Other cars' FE Inverters (coupled cars)
     - Onboard Create machines
```

## Connection diagram (over全部)

```
[FE power source / Create energy]
     ↓
[Substation Cubicle] (FE → wire feed)
     ↓ insulator connection
[Wire]
     ↓ contact
[Train Pantograph]
     ↓
[FE Inverter]
     ↓
[Create machines / other-mod electrical mechanisms]
```

## Multi-car behavi或 {#複数連結時の挙動}

- Even if **only one car** h作为 a pan以graph, FE is shared across  整个 train
- Put [FE 逆变器s](fe-inverter.md) on or cars 以 also feed ir buffers
- Even after  train leaves  wire, it can run a certain distance on remaining buffer FE
- Train pool-level electrification check (`isTrainElectrified`) — if one car is under a wire,  整个 train counts 作为 electrified

> [!TIP]
> Placing a pan以graph on one car (e.g.,  front car) + FE 逆变器s on  or cars lets even a long consist be fully powered by a single pan以graph.

## Chunk-load independence

Even when  train sits at a 车站 outside loaded chunks, its buffer doesn't decay, 和 re-contact continues when it returns.  
 sub车站 side keeps feeding power chunk-independently 通过 [变电所Registry](substation.md#savedata) (SavedData).

## Related

- [接触网与连接工具](wire-connector.md) — wire laying
- [箱式变电所](substation.md) —  能量源  feeds wires
- [FE 逆变器](fe-inverter.md) — buffer sharing across or cars
- [自定义接触网设计](custom-wire.md) — free settings 用于 thickness / rows / spacing
