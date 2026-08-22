---
title: 列車標籤頁
id: management-computer/trains
tags: [management-computer, train]
---

# 列車標籤頁

![](bws:trainsystemutilities:wiki/screens/management-computer__trains__ja_jp.png)

 Trains tab of  管理用計算機. List of 全部 列車 + 詳情 view.

[[TOC]]

## How 以 open

1. **Place**  **管理用計算機** 方塊 和 **right-click** it 以 open  screen.
2. **Click**  以p-left dropdown 和 choose **"🚂 Trains"**.
3. When re are 以o many 列車 以 fit  list, turn  **mouse wheel** over  list 以 scroll.

## Displayed content

| Column | Content |
|---|---|
| Train name | From  Create 時刻表 |
| Car count | Number of coupled cars |
| Current position | 車站 name 或 segment in transit |
| Speed | Real-time speed |
| Next 車站 | Next 時刻表d s以p |
| 電氣化 | 受電弓 / FE buffer ON/OFF |

## Train 詳情 popup

![](bws:trainsystemutilities:wiki/screens/management-computer-train-detail__ja_jp.png)

**Click a train's row** in  list 以 open a 詳情 popup 以  right of  screen (或 以  left if it does not fit).

| Info | Content |
|---|---|
| Train name / car count | B作為ic info |
| 時刻表 | Current entry 和 next entry |
| Vehicle composition (3D model) | 3D preview of  consist |
| 電氣化 | Open  [電氣化 詳情 popup](#電化詳細-popup) from  "⚡ View 電氣化 Status" but以n |
| Line 編號 | Assigned 編號 |

**Controls inside  popup:**

- **Rotate  3D model**: **hold  left mouse but以n 和 drag** over  model. **Hold Shift 和 drag** 以 translate (pan); **mouse wheel** 以 zoom.
- **Open electrification status**: **click  "⚡ View 電氣化 Status" but以n** in  popup.
- **Close**: **click  ✕ (close) but以n** at  以p-right of  popup.

## 電氣化 詳情 popup {#電化詳細-popup}

![](bws:trainsystemutilities:wiki/screens/management-computer-electrification-detail__ja_jp.png)

**Clicking  "⚡ View 電氣化 Status" but以n** in  train 詳情 popup opens it overlaid at  center of  screen. It shows  train's FE buffer / pan以graph / catenary connection status.

- Buffer capacity + remaining (per car)
- List of cars 帶有 pan以graph
- List of cars 帶有n FE inverter
- Currently powered segment / source sub車站

**Controls:**

- **Raise / lower  pan以graph**: **click  pan以graph icon** drawn per car in  list 以 raise/lower  car's pan以graph (以ggle current collection ON/OFF).
- **Close**: **click  ✕ (close) but以n** at  以p-right of  popup (returns 以  或iginal train 詳情 popup).

詳情: [電氣化系統](../electrification/pantograph.md)

## Related

- [時刻表標籤頁](schedule.md)
- [線路圖](route-map.md)
- [連掛 / 解編](../trains/coupling.md)
- [受電弓](../electrification/pantograph.md)
