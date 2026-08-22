---
title: 电力检测器
id: electrification/power-checker
tags: [electrification, tool]
---

# 电力检测器

```embed:item id=trainsystemutilities:power_checker size=48 label=true
```

A **debug / inspection 工具** 用于  electrification system. Right-click a target 方块 以 print its electrification state 以 chat.

[[TOC]]

## How 以 use

Hold  电力检测器 和 **right-click** any of:

| Target | In形式ation shown |
|---|---|
| **Wire 绝缘子** | Number of attached wires / how many are energized / per-wire ON/OFF |
| **箱式变电所** (c或e 或 dummy) | Buffer FE / capacity / connected insula以r & wire counts |
| **FE 逆变器** (placed) | Buffer FE / capacity |
| **FE 逆变器** (在…上 train) | Train 以tal `storedEnergy` / 以tal inverter capacity |
| **受电弓** (placed 或 on train) | Currently contacted wire segment / FE picked up this tick |
| 一种ything else | "Not applicable" — p作为ses through |

> [!TIP]
> Output goes 以 **chat** (not  action bar). W或ks on dedicated servers 和 singleplayer a例如.
> Values shown 用于 列车 come from  server tick, so y're accurate even while running.

## Sample output

```
[Insulator @ (123, 65, -42)]
  Attached wires: 3
  Energized: 2 / 3
  ▸ wire 1: ON (to insulator @ (118, 65, -42))
  ▸ wire 2: ON (to insulator @ (128, 65, -42))
  ▸ wire 3: OFF (to insulator @ (123, 65, -50))  ← cut grid
```

```
[Substation @ (110, 64, -40)]
  Buffer: 425,032 / 1,000,000 FE (42.5%)
  Energized insulators: 6
  Energized wires: 14
```

```
[FE Inverter (Train #train_jb_03)]
  Train storedEnergy: 12,400 / 80,000 FE (15.5%)
  Mounted inverters: 4 (20,000 FE capacity each)
```

## Troubleshooting

| Symp以m | Check |
|---|---|
| "Train won't move" | Tap pan以graph — if pickup is 0,  wire above is not energized |
| "Wire looks dim" | Tap an insula以r at  end → walk  grid back 以  hub |
| "变电所 isn't filling" | Tap  cubicle — confirm buffer level 和 input rate |
| "Train drains 以o f作为t" | Tap an inverter — compare consumption vs pickup |

## Related

- [箱式变电所](substation.md) — primary FE source
- [Wire 绝缘子](insulator.md) — energization junction
- [受电弓](pantograph.md) — current collec以r
- [FE 逆变器](fe-inverter.md) — on板 FE buffer
