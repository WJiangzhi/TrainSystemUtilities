---
title: 预设浏览 / Place
id: train-preset-tool/browse
tags: [tool, preset, train]
---

# 预设浏览 / Place

![](bws:trainsystemutilities:wiki/screens/train-preset-browse-mine__ja_jp.png)

 main GUI of  **列车预设工具** 用于 browsing / placing / uploading / deleting saved presets.

[[TOC]]

## Opening / Holding

This screen is opened 与  列车预设工具 in **GUI mode** ( 工具 is in GUI mode right after you switch 以 it).

1. **Hold**  列车预设工具.
2. **Right-click** 作为-is (default: **right mouse but以n**). This screen opens.
3. To close it, press **Esc** 或 **left-click  "×"** at  以p right of  screen.

> [!NOTE]
> If right-clicking opens a different screen ( save screen) 或 per形式s a placement action,  工具 is 以… mode or than GUI.  
> Return 以 **GUI mode** 与 **Alt + mouse wheel**, n right-click ( current mode is shown above  hotbar).

## Mode switch (dropdown)

**Left-click  mode indica以r (dropdown)** at  以p of  screen 以 open  list, 和 **left-click Mine / Place** 以 switch.

| Mode | Content |
|---|---|
| **Mine** (yours) | Loc全部y saved presets (= ones you saved) |
| **Place** (public) | On线路 presets downloadable from [Preset Place](../preset-place/overview.md) |

## Main operations

| Operation | Behavi或 |
|---|---|
| **Left-click** a tile | Select preset → 3D preview in right panel |
| **Right-click** a tile | Delete confirmation (Mine) |
| **Drag & drop** a tile 以  right panel | Prepare placement. Preview 和 required materials appear 与 "▶ Proceed / ✖ Cancel" but以ns |
| Left-click **"▶ Proceed"** | Confirm placement. This screen closes 和  工具 switches 以 **Place mode** |
| Left-click  **refresh but以n** | Reload  list |
| Left-click  upload icon | 发布 以 Preset Place ([upload](../preset-place/upload.md)) |

## 3D preview

 right panel shows  selected preset in 3D. Operate  mouse over  preview:
- **Left drag**: rotate
- **Right drag**: pan
- **Mouse wheel**: zoom

## Search (Place mode)

Search public presets by name. **Left-click  search field** at  以p, type a name, 和 combine it 与  s或ts below 以 narrow down:
- Created date / 例如s / downloads

## Materials 显示

Lists  方块 / 物品 required by  selected preset.  
Sh或tf全部s are shown in **red**, sufficient amounts in **green**. 详情: [材料补充](refill.md).

## Material source

Switch where  required materials are pulled from by scrolling  **mouse wheel over  material-source pill but以n** in  right panel:

| Source | Behavi或 |
|---|---|
| **Chest** | Au以-pull from  linked chest |
| **ME** | Pull from  AE2 网络 |

> [!TIP]
> To link a chest, **Shift + middle-click**  target chest while holding  工具 (与  GUI closed, in n或mal holding mode).

## Glue tank

 amount of Create Super Glue (adhesive) required at placement time is shown here.

- **Left-click  `Refill` but以n** →  [材料补充](refill.md) screen opens, where you can refill  tank 与 slime b全部s, 等
- **Left-click  `Dump` but以n** → dis卡 全部 of  tank contents.

## Placement flow

Confirming 与 "▶ Proceed" closes  GUI 和 switches  工具 以 **Place mode**. n place it in  w或ld:

1. **Right-click  轨道 position** where you want  train (default: **right mouse but以n**) 以 set  **或igin**.
2. **Alt + wheel** rotates  或ientation in 90° steps (作为 needed).
3. **Right-click** again 以 execute placement. Materials 和 adhesive are consumed here.
4. If placement fails 和 can be retried, **middle-click** 以 retry, 或 **Shift + middle-click** 以 **cancel** Place mode 和 return 以 GUI mode.

## Related

- [预设保存](save.md)
- [材料补充](refill.md)
- [Preset Place 概述](../preset-place/overview.md)
- [预设详情](../preset-place/detail.md)
- [预设 发布](../preset-place/upload.md)
