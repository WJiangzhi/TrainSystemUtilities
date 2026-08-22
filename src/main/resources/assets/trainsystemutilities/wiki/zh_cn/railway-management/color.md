---
title: 颜色设置
id: railway-management/color
tags: [station, color]
---

# 颜色设置

![](bws:trainsystemutilities:wiki/screens/railway-management-color__ja_jp.png)

 popup opened by  "Col或" but以n on  铁路管理方块.  col或 of each of 10 text elements can be changed.

[[TOC]]

## How 以 open

1. **Right-click**  [铁路管理方块](../railway-management.md) 以 open its GUI.
2. **Click  "▒ Col或" but以n** on  显示器 row, 和 this col或 settings popup appears on  right side of  dialog.
3. Click  "▒ Col或" but以n again 以 close it.

## Editable targets (10)

| key | Display element |
|---|---|
| `arrTime` | Arrival time |
| `depTime` | Departure time |
| `stopInfo` | S以p info |
| `routeType` | Train type |
| `stopSec` | S以p seconds |
| `trainName` | Train name |
| `nextName` | Next train name |
| `sectionTitle` | 章节 header |
| `countdown` | Countdown |
| `trackNumber` | Track number |

## 预设 col或s (12)

Apply a col或 与 one click from  preset grid at  bot以m of  popup:

```
#4fc3f7 (cyan)   #80deea (light cyan)  #ff8a65 (orange)  #ffc107 (yellow)
#66bb6a (green)  #ef5350 (red)         #ab47bc (purple)  #ffffff (white)
#888888 (gray)   #555555 (dim)         #444444 (darker)  #333333 (darkest)
```

## Operation (what 以 click)

1. **Click  dropdown (与 ▾)** at  以p of  popup → from  list, **click**  **edit target** whose col或 you want 以 change (arrival time / train name / 轨道 number, 等 —  10 above).
2. **Click a preset col或** at  bot以m of  popup, 和  col或 is applied immediately 以  selected target.
3. To revert, click  **"Reset One" but以n** (resets only  selected target) 或  **"Reset All" but以n** (resets 全部 10).

> [!NOTE]
> This popup uses a **click-以-pick** scheme from 12 presets.  full [col或 picker](../management-computer/symbol-editor.md#color-picker) 带有 hue wheel 和 HEX input is used on or screens 例如  [线路 编号 edi以r](../management-computer/symbol-editor.md).

## Per-face management

**Click  "↻ Front/Back Toggle" but以n** 以 switch between front / back, 和 you can set a different col或 set 用于 each face.  
It also supp或ts [batch apply](settings.md#batch-apply) (see [显示器设置](settings.md#batch-apply)).

## Related

- [铁路管理方块](../railway-management.md)
- [显示器设置](settings.md)
- [Col或 Picker (管理用计算机)](../management-computer/symbol-editor.md#color-picker)
