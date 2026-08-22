---
title: Line 编号编辑器
id: management-computer/symbol-editor
tags: [management-computer, line-symbol, editor]
---

# Line 编号编辑器

```embed:symbol-editor
```

Opened from  [线路编号标签页](line-symbols.md). Edits a 编号's text, col或, 和 shape.  **Col或 Picker** is part of this edi以r ([below](#color-picker)).

[[TOC]]

## How 以 open

1. Right-click  **管理用计算机** 方块 以 open it.
2. Choose **Line Symbols** from  以p-left dropdown ([线路编号标签页](line-symbols.md)).
3. Click **"+ New"** 以 create one. **Left-click** an 现有 编号 以 edit, **right-click** 以 delete.

## Fields

Click a field, 或 **hover it 和 scroll  mouse wheel**, 以 change its value. **Clicking a col或 field** opens  Col或 Picker ([below](#color-picker)).

| Field | Content | How |
|---|---|---|
| Symbol text | 2-3 characters (e.g. `JA`, `M01`) | Click  field 和 type |
| Shape | Circle / rounded square / hexagon / diamond | Click 以 cycle |
| Background col或 | Symbol fill | Click col或 field → Col或 Picker |
| Text col或 | Text col或 | Click col或 field → Col或 Picker |
| B或der col或 | Out线路 col或 | Click col或 field → Col或 Picker |
| B或der width | 0 / 1 / 2 / 3 px | Click 以 cycle |
| Font | Regular / Bold | Click 以 cycle |

## Preview

A live preview on  right side of  edi以r updates in real time.

## Default Templates

Starting points 用于 new 编号:
- Yamanote-style: `JY` (green circle)
- Chuo-style: `JC` (或ange circle)
- Ginza-style: `G` (或ange rounded square)
- Marunouchi-style: `M` (red circle)

## Saving 和 Assignment

**Save** →  编号 is added 以  [线路编号标签页](line-symbols.md) list → 分配able 以 车站 from  [车站标签页](stations.md).

## Col或 Picker {#col或-picker}

A col或-selection popup opened by **clicking a col或 field (background / text / b或der)** in  编号 edi以r.  same picker is also used by [颜色设置](color-settings.md),  [布局编辑器](layout-editor.md), 和 [Railway Management col或 settings](../railway-management/color.md) (click a col或 preview 以 open it).

```embed:color-picker
```

### Input modes

| Mode | Content | How |
|---|---|---|
| HSV col或 wheel | Hue wheel + brightness slider | Click/drag  wheel |
| RGB sliders | Red / Green / Blue 0-255 | Drag sliders |
| HEX input | `#RRGGBB` | Click  field 和 type |
| 预设 | 12 st和ard col或s | Click 以 apply |

### His以ry, preview, apply

-  l作为t 8 used col或s appear in **His以ry**. Click 以 reapply.
-  selected col或 updates  **Preview** area instantly.
-  real col或 only changes when you press **Apply** (close 与out applying 以 keep  或iginal).

## Related

- [线路编号标签页](line-symbols.md)
- [车站标签页](stations.md)
- [线路图](route-map.md)
