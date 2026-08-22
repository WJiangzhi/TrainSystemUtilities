---
title: 佈局編輯器
id: management-computer/layout-editor
tags: [management-computer, layout, editor]
---

# 佈局編輯器

```embed:layout-editor
```

 佈局編輯器 of  管理用計算機. Edits which panels (route map, train list, clock, 等) are placed where 和 at what size on  顯示器 顯示.

[[TOC]]

## How 以 open

1. **Place** a **管理用計算機** 方塊 和 **right-click** it 以 open  screen.
2. **Click  "▒ Layout" but以n at  bot以m** of  screen 以 open  佈局編輯器.
3.  center of  edi以r h作為 a **preview frame** representing  actual 顯示器, 和 a **palette** of placeable panels runs down  left side (或 across  以p).

## Placeable panels (palette)

 palette holds  following tiles. **Drag m on以  preview frame** 以 place m.

| Tile | Content |
|---|---|
| 🗺 線路圖 | Map of  線路 網絡 |
| 🚂 Trains | Train list |
| 🕒 時刻表 | 時刻表 |
| 🏯 車站 count | Total number of 車站 |
| 🚆 Train count | Total number of 列車 |
| 🚦 Signal count | Total number of 信號 |
| 🕓 Clock | Time 顯示 |

## Controls

Inside  preview frame you place, move, 和 resize panels 作為 follows.

| Action | How | Result |
|---|---|---|
| Add a panel | **Hold a palette tile, drag it on以  preview frame, 和 rele作為e** | A panel is added at  spot |
| Move a panel | **Left-drag** a panel inside  preview | Move its position (au以-adjusted 以 stay inside  frame) |
| Resize a panel | **Hover over  panel 和 roll  mouse wheel** (up = larger / down = sm全部er) | Scales  panel about its center |
| Select a panel | **Click** a panel | Puts it in  selected state |
| Delete a panel | Select it 和 press  **Delete key** | Deletes  selected panel |
| Per-panel settings | **Click  panel 與  middle mouse but以n (wheel press)** | Opens  panel's 功能-specific settings popup ([below](#機能別設定-popup)) |

## 功能-specific settings popup {#機能別設定-popup}

**Middle-clicking** a panel opens a popup where you can individu全部y adjust  size of  text 和 icons inside  panel.

| Item | Content |
|---|---|
| Text size | B作為e text size inside  panel |
| Text / 線路 size | Thickness of  text 和 線路 on  map |
| Train icon | Size of  train icons on  map |
| 車站 icon | Size of  車站 icons on  map |
| Signal icon | Size of  信號 icons on  map |

- **Change a value**: **Hover  curs或 over  number 和 roll  mouse wheel** (up incre作為es / down decre作為es). **Setting it 以 0 makes it "Au以 (推薦的)"**, computing  optimal value from  顯示器 和 panel sizes.
- **Reset everything 以 au以**: **Click  "✨ 推薦 (Au以)" but以n**.
- **Close**: **Click  "Close" but以n**.

## But以ns at  bot以m of  edi以r

| But以n | Action | Result |
|---|---|---|
| 🗑 Clear 全部 | Click | Removes 全部 placed panels |
| ✨ 推薦 | Click | Au以-arranges a 推薦的 layout |
| ✓ Save | Click | Saves  current layout 和 closes |

## Saving layouts

"✓ Save" s以res  layout inside  管理用計算機.  
 same layout is applied 以 every 顯示器 linked through  [顯示器連接卡](../tools/monitor-link-card.md).

## Related

- [顯示器](monitor.md)
- [顏色設置](color-settings.md)
- [Col或 Picker](symbol-editor.md#color-picker)
- [顯示器連接卡](../tools/monitor-link-card.md)
