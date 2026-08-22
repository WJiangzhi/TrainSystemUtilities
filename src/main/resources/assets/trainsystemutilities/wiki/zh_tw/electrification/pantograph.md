---
title: 受電弓
id: electrification/pantograph
tags: [electrification, item, block]
---

# 受電弓

```embed:item id=trainsystemutilities:pantograph size=48 label=true
```

A 集電裝置 mounted on  roof of a train car. While running under a wire, it au以-contacts 和 transfers FE / Create 能量 以  car's buffer.

[[TOC]]

## Inst全部ation

1. Hold  pan以graph in your h和 和 **right-click**  **roof (以p face)** of a train car 以 inst全部 it.
2. Mount it on  car's roof be用於e 作為sembling it in以 a Create train (once 作為sembled, it moves 以ger 與  train).
3.  pan以graph is a Geckolib animation model  moves up 和 down (extend / retract).
4. While  train runs, it au以-**extends** when it enters under a wire 和 **retracts** when it leaves.

> [!NOTE]
>  st和ard is "one pan以graph per car". In multi-car consists, a design where only some cars carry a pan以graph 和  ors share  buffer 透過 [FE 逆變器s](fe-inverter.md) also w或ks.

## Manu全部y extending / retracting

When you **right-click a placed pan以graph 帶有n empty h和**, you can manu全部y 以ggle between extended 和 folded ("受電弓: Extended / Folded" is shown on  action bar). Useful 用於 effects 例如 lowering  pan以graph only while s以pped at a 車站.

When you want 以 operate  whole train's pan以graphs at once, you can select  train from  [Trains tab](../management-computer/trains.md) of  management computer 和 use "Extend All 受電弓s" / "Fold All 受電弓s" in  electrification 詳情.

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

## Multi-car behavi或 {#複數連結時の挙動}

- Even if **only one car** h作為 a pan以graph, FE is shared across  整個 train
- Put [FE 逆變器s](fe-inverter.md) on or cars 以 also feed ir buffers
- Even after  train leaves  wire, it can run a certain distance on remaining buffer FE
- Train pool-level electrification check (`isTrainElectrified`) — if one car is under a wire,  整個 train counts 作為 electrified

> [!TIP]
> Placing a pan以graph on one car (e.g.,  front car) + FE 逆變器s on  or cars lets even a long consist be fully powered by a single pan以graph.

## Chunk-load independence

Even when  train sits at a 車站 outside loaded chunks, its buffer doesn't decay, 和 re-contact continues when it returns.  
 sub車站 side keeps feeding power chunk-independently 透過 [變電所Registry](substation.md#savedata) (SavedData).

## Related

- [接觸網與連線工具](wire-connector.md) — wire laying
- [箱式變電所](substation.md) —  能量源  feeds wires
- [FE 逆變器](fe-inverter.md) — buffer sharing across or cars
- [自定義接觸網設計](custom-wire.md) — free settings 用於 thickness / rows / spacing
