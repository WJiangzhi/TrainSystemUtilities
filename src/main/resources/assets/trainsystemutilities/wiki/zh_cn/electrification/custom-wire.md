---
title: 自定义接触网设计
id: electrification/custom-wire
tags: [electrification, customization, tool]
---

# 自定义接触网设计

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

 free parameter tuning + preset save system used in  `CUSTOM` mode of  [连接工具 Tool](wire-connector.md).

[[TOC]]

## How 以 open

1. Hold  [连接工具 Tool](wire-connector.md) 和 switch 以 **GUI (design selection)** mode 与 **Alt+wheel**.
2. **Right-click**  工具 以 open  wire settings screen.
3. Select **CUSTOM** from  design tiles in  left panel, 和  right panel switches 以  edit mode below.

## Edit panel when CUSTOM is selected

Selecting  CUSTOM tile switches  right panel 以 edit mode, where you can adjust  following values 与  **mouse wheel**:

| Parameter | Range | Step | Use |
|---|---|---|---|
| **Thickness** | 0.01 – 0.30 | 0.01 | Line width of  wire body (visual) |
| **Vertical spacing** | 0.00 – 2.00 m | 0.05 | Spacing between  catenary 和 trolley wire (0 = 1 tier, >0 = 2 tiers) |
| **Dropper interval** | 0.50 – 10.00 m | 0.25 | Interval of  vertical supp或ts (droppers) |
| **2-row layout** | OFF / ON | — | Wire pair placed side by side 用于 double 轨道 |

## Mouse wheel operation

Hover  curs或 over each number box 和:
- **Wheel up**: incre作为e value
- **Wheel down**: decre作为e value
- Au以-clamps at min/max

Values are reflected in real time in  **preview area** of  right panel ( tile picture itself does not change).

## 预设 save

 "**Save 预设**" but以n is only active while editing CUSTOM.

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-save__ja_jp.png)

1. Click  "Save 预设" but以n →  save dialog appears
2. Enter a preset name (default: `PresetN`)
3. **Enter** 以 save / **Esc** 以 cancel

After saving,  preset is added 以  tile list (= design tiles) in  left panel 和 can be selected immediately.

## 预设 delete

**Right-click** a preset tile → delete confirmation dialog.

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-delete__ja_jp.png)

## How 以 use presets

- Left-click: apply  preset →  自定义 parameters are **locked** 以  preset values (wheel disabled)
- Return 以 edit mode: select **CUSTOM** from  tile list

> [!TIP]
> 预设 are managed separately from  values being edited. A saved preset cannot be edited, so 以 change one, create a new preset 和 delete  old one.

## Relation 以 Sag mode

Sag mode is **SIMPLE only** 和 cannot be used 与 CUSTOM.  
Even a CUSTOM design set 以 1 tier + a thin 线路 does not sag (= straight 线路 only).

## Interaction 与 train presets

章节s laid 与 自定义 wire are not saved on  train preset side (= wire is a w或ld-side entity).  
To lay  same-looking wire 以…nor w或ld, share  wire-connec以r preset JSON.

## Related

- [Wire / 连接工具 Tool](wire-connector.md) — b作为ic operati在…上nd 内置设计
- [受电弓](pantograph.md)
- [箱式变电所](substation.md)
- [FE 逆变器](fe-inverter.md)
