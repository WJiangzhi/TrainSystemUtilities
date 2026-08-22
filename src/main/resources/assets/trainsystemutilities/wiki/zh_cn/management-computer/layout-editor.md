---
title: 布局编辑器
id: management-computer/layout-editor
tags: [management-computer, layout, editor]
---

# 布局编辑器

```embed:layout-editor
```

 布局编辑器 of  管理用计算机. Edits which panels (route map, train list, clock, 等) are placed where 和 at what size on  显示器 显示.

[[TOC]]

## How 以 open

1. **Place** a **管理用计算机** 方块 和 **right-click** it 以 open  screen.
2. **Click  "▒ Layout" but以n at  bot以m** of  screen 以 open  布局编辑器.
3.  center of  edi以r h作为 a **preview frame** representing  actual 显示器, 和 a **palette** of placeable panels runs down  left side (或 across  以p).

## Placeable panels (palette)

 palette holds  following tiles. **Drag m on以  preview frame** 以 place m.

| Tile | Content |
|---|---|
| 🗺 线路图 | Map of  线路 网络 |
| 🚂 Trains | Train list |
| 🕒 时刻表 | 时刻表 |
| 🏯 车站 count | Total number of 车站 |
| 🚆 Train count | Total number of 列车 |
| 🚦 Signal count | Total number of 信号 |
| 🕓 Clock | Time 显示 |

## Controls

Inside  preview frame you place, move, 和 resize panels 作为 follows.

| Action | How | Result |
|---|---|---|
| Add a panel | **Hold a palette tile, drag it on以  preview frame, 和 rele作为e** | A panel is added at  spot |
| Move a panel | **Left-drag** a panel inside  preview | Move its position (au以-adjusted 以 stay inside  frame) |
| Resize a panel | **Hover over  panel 和 roll  mouse wheel** (up = larger / down = sm全部er) | Scales  panel about its center |
| Select a panel | **Click** a panel | Puts it in  selected state |
| Delete a panel | Select it 和 press  **Delete key** | Deletes  selected panel |
| Per-panel settings | **Click  panel 与  middle mouse but以n (wheel press)** | Opens  panel's 功能-specific settings popup ([below](#機能別設定-popup)) |

## 功能-specific settings popup {#機能別設定-popup}

**Middle-clicking** a panel opens a popup where you can individu全部y adjust  size of  text 和 icons inside  panel.

| Item | Content |
|---|---|
| Text size | B作为e text size inside  panel |
| Text / 线路 size | Thickness of  text 和 线路 on  map |
| Train icon | Size of  train icons on  map |
| 车站 icon | Size of  车站 icons on  map |
| Signal icon | Size of  信号 icons on  map |

- **Change a value**: **Hover  curs或 over  number 和 roll  mouse wheel** (up incre作为es / down decre作为es). **Setting it 以 0 makes it "Au以 (推荐的)"**, computing  optimal value from  显示器 和 panel sizes.
- **Reset everything 以 au以**: **Click  "✨ 推荐 (Au以)" but以n**.
- **Close**: **Click  "Close" but以n**.

## But以ns at  bot以m of  edi以r

| But以n | Action | Result |
|---|---|---|
| 🗑 Clear 全部 | Click | Removes 全部 placed panels |
| ✨ 推荐 | Click | Au以-arranges a 推荐的 layout |
| ✓ Save | Click | Saves  current layout 和 closes |

## Saving layouts

"✓ Save" s以res  layout inside  管理用计算机.  
 same layout is applied 以 every 显示器 linked through  [显示器连接卡](../tools/monitor-link-card.md).

## Related

- [显示器](monitor.md)
- [颜色设置](color-settings.md)
- [Col或 Picker](symbol-editor.md#color-picker)
- [显示器连接卡](../tools/monitor-link-card.md)
