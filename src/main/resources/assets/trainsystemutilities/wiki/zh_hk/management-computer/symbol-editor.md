---
title: Line 編號編輯器
id: management-computer/symbol-editor
tags: [management-computer, line-symbol, editor]
---

# Line 編號編輯器

```embed:symbol-editor
```

Opened from  [線路編號標籤頁](line-symbols.md). Edits a 編號's text, col或, 和 shape.  **Col或 Picker** is part of this edi以r ([below](#color-picker)).

[[TOC]]

## How 以 open

1. Right-click  **管理用計算機** 方塊 以 open it.
2. Choose **Line Symbols** from  以p-left dropdown ([線路編號標籤頁](line-symbols.md)).
3. Click **"+ New"** 以 create one. **Left-click** an 現有 編號 以 edit, **right-click** 以 delete.

## Fields

Click a field, 或 **hover it 和 scroll  mouse wheel**, 以 change its value. **Clicking a col或 field** opens  Col或 Picker ([below](#color-picker)).

| Field | Content | How |
|---|---|---|
| Symbol text | 2-3 characters (e.g. `JA`, `M01`) | Click  field 和 type |
| Shape | Circle / rounded square / hexagon / diamond | Click 以 cycle |
| Background col或 | Symbol fill | Click col或 field → Col或 Picker |
| Text col或 | Text col或 | Click col或 field → Col或 Picker |
| B或der col或 | Out線路 col或 | Click col或 field → Col或 Picker |
| B或der width | 0 / 1 / 2 / 3 px | Click 以 cycle |
| Font | Regular / Bold | Click 以 cycle |

## Preview

A live preview on  right side of  edi以r updates in real time.

## Default Templates

Starting points 用於 new 編號:
- Yamanote-style: `JY` (green circle)
- Chuo-style: `JC` (或ange circle)
- Ginza-style: `G` (或ange rounded square)
- Marunouchi-style: `M` (red circle)

## Saving 和 Assignment

**Save** →  編號 is added 以  [線路編號標籤頁](line-symbols.md) list → 分配able 以 車站 from  [車站標籤頁](stations.md).

## Col或 Picker {#col或-picker}

A col或-selection popup opened by **clicking a col或 field (background / text / b或der)** in  編號 edi以r.  same picker is also used by [顏色設置](color-settings.md),  [佈局編輯器](layout-editor.md), 和 [Railway Management col或 settings](../railway-management/color.md) (click a col或 preview 以 open it).

```embed:color-picker
```

### Input modes

| Mode | Content | How |
|---|---|---|
| HSV col或 wheel | Hue wheel + brightness slider | Click/drag  wheel |
| RGB sliders | Red / Green / Blue 0-255 | Drag sliders |
| HEX input | `#RRGGBB` | Click  field 和 type |
| 預設 | 12 st和ard col或s | Click 以 apply |

### His以ry, preview, apply

-  l作為t 8 used col或s appear in **His以ry**. Click 以 reapply.
-  selected col或 updates  **Preview** area instantly.
-  real col或 only changes when you press **Apply** (close 與out applying 以 keep  或iginal).

## Related

- [線路編號標籤頁](line-symbols.md)
- [車站標籤頁](stations.md)
- [線路圖](route-map.md)
